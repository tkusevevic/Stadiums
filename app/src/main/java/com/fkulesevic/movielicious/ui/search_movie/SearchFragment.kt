package com.fkulesevic.movielicious.ui.search_movie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fkulesevic.movielicious.R
import com.fkulesevic.movielicious.commons.constants.STADIUM_KEY
import com.fkulesevic.movielicious.commons.extensions.onClick
import com.fkulesevic.movielicious.commons.extensions.onTextChange
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.movieSearchPresenter
import com.fkulesevic.movielicious.presentation.StadiumSearchPresenter
import com.fkulesevic.movielicious.ui.listeners.OnMovieClickListener
import com.fkulesevic.movielicious.ui.movie_details.MovieDetailsActivity
import com.fkulesevic.movielicious.ui.movies.adapter.AllStadiumsAdapter
import kotlinx.android.synthetic.main.activity_search_movies.*

class SearchFragment : Fragment(), OnMovieClickListener, SearchMovieView {

    private val adapter by lazy { AllStadiumsAdapter(this) }

    private val presenter: StadiumSearchPresenter by lazy { movieSearchPresenter() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_search_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.setBaseview(this)
        initRecyclerView()
        initListener()
        setAllStadiums()
    }

    private fun initListener() {
        clearSearch.onClick {
            searchInput.text.clear()
            presenter.clearList()
        }

        searchInput.onTextChange {
            presenter.getMovies(searchInput.text.toString())
            if (searchInput.text.toString().isEmpty() || searchInput.text.toString().isBlank()) {
                presenter.clearList()
            }
        }
    }

    private fun setAllStadiums() {
        presenter.setAllStadiums()
    }

    private fun initRecyclerView() {
        recyclerViewSearch.adapter = adapter
        val lm = LinearLayoutManager(activity)
        recyclerViewSearch.layoutManager = lm
    }

    override fun setMovies(stadiums: List<Stadium>) = adapter.setMovies(stadiums)

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

    override fun setFavorites(favorites: List<Stadium>) = adapter.setFavoriteMovies(favorites)

    override fun clearList() = adapter.clearMovies()
}