package com.amaricevic.stadiums.ui.stadiums

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.amaricevic.stadiums.App
import com.amaricevic.stadiums.R
import com.amaricevic.stadiums.commons.constants.STADIUM_KEY
import com.amaricevic.stadiums.commons.extensions.hide
import com.amaricevic.stadiums.commons.extensions.onClick
import com.amaricevic.stadiums.commons.extensions.show
import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.firebase.authentication.AuthenticationHelperImpl
import com.amaricevic.stadiums.firebase.database.DatabaseHelperImpl
import com.amaricevic.stadiums.preferences.PreferencesHelperImpl
import com.amaricevic.stadiums.ui.listeners.OnItemClickListener
import com.amaricevic.stadiums.ui.signIn.SignInActivity
import com.amaricevic.stadiums.ui.stadium_details.StadiumDetailsActivity
import com.amaricevic.stadiums.ui.stadiums.adapter.StadiumAdapter
import com.amaricevic.stadiums.ui.stadiums.views.FavoritesView
import kotlinx.android.synthetic.main.fragment_favorites.*

class FavoritesFragment : Fragment(), OnItemClickListener, FavoritesView {

    private val auth: AuthenticationHelperImpl by lazy {
        AuthenticationHelperImpl(
            App.auth,
            DatabaseHelperImpl(App.database),
            PreferencesHelperImpl(App.prefs)
        )
    }

    private val database: DatabaseHelperImpl by lazy {
        DatabaseHelperImpl(App.database)
    }

    private val adapter by lazy { StadiumAdapter(this) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        initRecycler()
        getFavorites()
    }

    private fun initListeners() {
        signOutFavorites.onClick {
            auth.logTheUserOut()
            val intent = Intent(activity, SignInActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }

        sortByFavorites.onClick {
            val sort = adapter.changeSort()
            if (sort == 0) showSortAsc() else showSortDesc()
        }
    }

    private fun initRecycler() {
        recyclerViewFavorites.adapter = adapter
        val lm = LinearLayoutManager(activity)
        recyclerViewFavorites.layoutManager = lm
    }

    // logic functions

    private fun getFavorites() {
        val userId = auth.getCurrentUserId()
        userId?.let { database.listenToFavoriteStadiums(it, { this.onSuccessfulRequest(it) }) }
    }

    private fun onSuccessfulRequest(stadiums: List<Stadium>) {
        if (stadiums.isEmpty()) {
            this.showMessageOnScreen()
        } else {
            this.hideMessageOnScreen()
        }
        this.setFavorites(stadiums)
    }

    private fun onLikeTapped(stadium: Stadium) {
        stadium.isLiked = !stadium.isLiked
        auth.getCurrentUser()?.uid?.run {
            database.onStadiumLiked(this, stadium)
        }
    }

    // view functions
    override fun setFavorites(stadiums: List<Stadium>) = adapter.setList(stadiums)

    override fun onStadiumClick(stadium: Stadium) {
        val bundle = Bundle()
        bundle.putSerializable(STADIUM_KEY, stadium)
        val intent = Intent(activity, StadiumDetailsActivity::class.java).putExtras(bundle)
        startActivity(intent)
    }

    override fun onLikeClick(stadium: Stadium) {
        this.onLikeTapped(stadium)
        adapter.setLiked(stadium.id, stadium.isLiked)
    }

    override fun showMessageOnScreen() = noFavorites.show()

    override fun hideMessageOnScreen() = noFavorites.hide()

    private fun showSortDesc() {
        sortByFavorites.text = "Capacity DESC"
    }

    private fun showSortAsc() {
        sortByFavorites.text = "Capacity ASC"
    }
}