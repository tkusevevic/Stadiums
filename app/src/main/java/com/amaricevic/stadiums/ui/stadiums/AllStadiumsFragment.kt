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
import com.amaricevic.stadiums.commons.extensions.show
import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.firebase.authentication.AuthenticationHelperImpl
import com.amaricevic.stadiums.firebase.database.DatabaseHelperImpl
import com.amaricevic.stadiums.ui.listeners.OnItemClickListener
import com.amaricevic.stadiums.ui.stadium_details.StadiumDetailsActivity
import com.amaricevic.stadiums.ui.stadiums.adapter.AllStadiumsAdapter
import com.amaricevic.stadiums.ui.stadiums.views.AllStadiumsView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.fragment_all_stadiums.*

class AllStadiumsFragment : Fragment(), OnItemClickListener, AllStadiumsView {

    private val auth: AuthenticationHelperImpl by lazy {
        AuthenticationHelperImpl(
            App.auth,
            DatabaseHelperImpl(App.database)
        )
    }

    private val database: DatabaseHelperImpl by lazy {
        DatabaseHelperImpl(App.database)
    }

    private val adapter by lazy { AllStadiumsAdapter(this) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_all_stadiums, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getFavorites()
        initRecyclerView()
        getStadiums()
    }

    private fun initRecyclerView() {
        recyclerViewTopRated.adapter = adapter
        val lm = LinearLayoutManager(activity)
        recyclerViewTopRated.layoutManager = lm
    }


    // logic functions
    override fun onStadiumClick(stadium: Stadium) {
        val bundle = Bundle()
        bundle.putSerializable(STADIUM_KEY, stadium)
        val intent = Intent(activity, StadiumDetailsActivity::class.java).putExtras(bundle)
        startActivity(intent)
    }

    override fun onLikeClick(stadium: Stadium) {
        this.onLikeTapped(stadium)
        adapter.setStadiumLiked(stadium.id, stadium.isLiked)
    }

    private fun getStadiums(): Unit = run {
        auth.getCurrentUserId()?.run {
            database.getAllStadionsOnce(this) { onItemsReceived(it) }
        }
    }


    fun getFavorites() {
        auth.getCurrentUserId()?.run {
            database.listenToFavoriteStadiums(this) { onSuccessfulRequest(it) }
        }
    }

    private fun onSuccessfulRequest(stadiums: List<Stadium>) = this.setFavorites(stadiums)


    private fun onItemsReceived(list: List<Stadium>) {
        if (list.isEmpty()) this.showMessageEmptyList() else this.hideMessageEmptyList()
        this.setStadiums(list)
        auth.getCurrentUserId()?.run {
            database.getFavoriteStadionsOnce(this) { onSuccessfulRequest(it) }
        }
    }

    private fun onLikeTapped(stadium: Stadium) {
        stadium.isLiked = !stadium.isLiked
        auth.getCurrentUser()?.uid?.run {
            database.onStadiumLiked(auth.getCurrentUser()?.uid.toString(), stadium)
        }
    }

    // view functions
    override fun addStadions(stadiums: List<Stadium>) = adapter.addItems(stadiums)

    override fun setStadiums(stadiums: List<Stadium>) = adapter.setItems(stadiums)

    override fun setFavorites(favorites: List<Stadium>) = adapter.setFavorite(favorites)

    override fun showMessageEmptyList() = noStadiums.show()

    override fun hideMessageEmptyList() = noStadiums.hide()
}

