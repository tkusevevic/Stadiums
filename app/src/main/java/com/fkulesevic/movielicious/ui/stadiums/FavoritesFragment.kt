package com.fkulesevic.movielicious.ui.stadiums

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fkulesevic.movielicious.R
import com.fkulesevic.movielicious.commons.constants.STADIUM_KEY
import com.fkulesevic.movielicious.commons.extensions.hide
import com.fkulesevic.movielicious.commons.extensions.show
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.favoritesPresenter
import com.fkulesevic.movielicious.presentation.FavoritesPresenter
import com.fkulesevic.movielicious.ui.listeners.OnItemClickListener
import com.fkulesevic.movielicious.ui.stadium_details.StadiumDetailsActivity
import com.fkulesevic.movielicious.ui.stadiums.adapter.StadiumAdapter
import com.fkulesevic.movielicious.ui.stadiums.views.FavoritesView
import kotlinx.android.synthetic.main.fragment_favorites.*

class FavoritesFragment : Fragment(), OnItemClickListener, FavoritesView {

    private val presenter: FavoritesPresenter by lazy { favoritesPresenter() }

    private val adapter by lazy { StadiumAdapter(this) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initPresenter()
        initRecycler()
        loadFavorites()
    }

    private fun initPresenter() = presenter.setBaseview(this)

    private fun initRecycler() {
        recyclerViewFavorites.adapter = adapter
        val lm = LinearLayoutManager(activity)
        recyclerViewFavorites.layoutManager = lm
    }

    private fun loadFavorites() = presenter.getFavorites()

    override fun setFavorites(stadiums: List<Stadium>) = adapter.setList(stadiums)

    override fun onStadiumClick(stadium: Stadium) {
        val bundle = Bundle()
        bundle.putSerializable(STADIUM_KEY, stadium)
        val intent = Intent(activity, StadiumDetailsActivity::class.java).putExtras(bundle)
        startActivity(intent)
    }

    override fun onLikeClick(stadium: Stadium) {
        presenter.onLikeTapped(stadium)
        adapter.setLiked(stadium.id, stadium.isLiked)
    }

    override fun showMessageOnScreen() = noFavorites.show()

    override fun hideMessageOnScreen() = noFavorites.hide()
}