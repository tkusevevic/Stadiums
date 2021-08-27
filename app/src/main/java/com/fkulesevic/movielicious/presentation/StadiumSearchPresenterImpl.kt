package com.fkulesevic.movielicious.presentation

import android.util.Log
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.firebase.StadiumsRequestListener
import com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper
import com.fkulesevic.movielicious.firebase.database.DatabaseHelper
import com.fkulesevic.movielicious.ui.search_movie.SearchMovieView
import javax.inject.Inject

class StadiumSearchPresenterImpl @Inject constructor(private val authenticationHelper: AuthenticationHelper,
                                                     private val databaseHelper: DatabaseHelper) : StadiumSearchPresenter, StadiumsRequestListener {

    private lateinit var view: SearchMovieView

    override fun setBaseview(baseView: SearchMovieView) {
        view = baseView
    }

    override fun getMovies(input: String): Unit = run {
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.getAllStadionsOnce(this) { onMoviesReceived(it.filter { it.name.lowercase().startsWith(input.lowercase()) }) }
        }
    }

    override fun setAllStadiums(): Unit = run {
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.getAllStadionsOnce(this) { onMoviesReceived(it) }
        }
    }

    private fun onMoviesReceived(list: List<Stadium>) {
        Log.d("TOMANAA", list.toString())
        view.setMovies(list)
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.getFavoriteStadionsOnce(this) { onSuccessfulRequestMovies(it) }
        }
    }

    override fun onSuccessfulRequestMovies(stadiums: List<Stadium>) = view.setFavorites(stadiums)

    override fun onFailedRequestMovies() {
        //TODO FAILED FETCH
    }

    override fun clearList() = view.clearList()

    override fun onLikeTapped(stadium: Stadium) {
        stadium.isLiked = !stadium.isLiked
        authenticationHelper.getCurrentUser()?.uid?.run {
            databaseHelper.onStadiumLiked(this, stadium)
        }
    }

    override fun getFavorites() {
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.listenToFavoriteStadiums(this, { onSuccessfulRequestMovies(it) })
        }
    }
}