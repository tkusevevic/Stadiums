package com.fkulesevic.movielicious.ui.movies

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
import com.fkulesevic.movielicious.presentation.TopRatedPresenter
import com.fkulesevic.movielicious.topRatedPresenter
import com.fkulesevic.movielicious.ui.listeners.OnMovieClickListener
import com.fkulesevic.movielicious.ui.movie_details.MovieDetailsActivity
import com.fkulesevic.movielicious.ui.movies.adapter.AllStadiumsAdapter
import com.fkulesevic.movielicious.ui.movies.views.TopRatedView
import kotlinx.android.synthetic.main.fragment_top_rated.*

class AllStadiumsFragment : Fragment(), OnMovieClickListener, TopRatedView {

    private val presenter: TopRatedPresenter by lazy { topRatedPresenter() }

    private val adapter by lazy { AllStadiumsAdapter(this) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_top_rated, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.setBaseview(this)
        loadFavorites()
        initRecyclerView()
        loadTopRatedMovies()
    }

    private fun initRecyclerView() {
        recyclerViewTopRated.adapter = adapter
        val lm = LinearLayoutManager(activity)
        recyclerViewTopRated.layoutManager = lm
    }

    private fun loadFavorites() = presenter.getFavorites()

    private fun loadTopRatedMovies() = presenter.getMovies()

    override fun onMovieClick(stadium: Stadium) {
        val bundle = Bundle()
        bundle.putSerializable(STADIUM_KEY, stadium)
        val intent = Intent(activity, MovieDetailsActivity::class.java).putExtras(bundle)
        startActivity(intent)
    }

    override fun onLikeClick(stadium: Stadium) {
        presenter.onLikeTapped(stadium)
        adapter.setMovieLiked(stadium.id, stadium.isLiked)
    }

    override fun addMovies(stadiums: List<Stadium>) = adapter.addMovies(stadiums)

    override fun setMovies(stadiums: List<Stadium>) = adapter.setMovies(stadiums)

    override fun setFavorites(favorites: List<Stadium>) = adapter.setFavoriteMovies(favorites)

    override fun showMessageEmptyList() = noTopRatedMovies.show()

    override fun hideMessageEmptyList() = noTopRatedMovies.hide()
}

