package com.fkulesevic.movielicious.presentation

import android.util.Log
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.firebase.StadiumsRequestListener
import com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper
import com.fkulesevic.movielicious.firebase.database.DatabaseHelper
import com.fkulesevic.movielicious.ui.movies.views.TopRatedView
import javax.inject.Inject

class TopRatedPresenterImpl @Inject constructor(private val authenticationHelper: AuthenticationHelper,
                                                private val databaseHelper: DatabaseHelper) : TopRatedPresenter, StadiumsRequestListener {

    private lateinit var topRatedView: TopRatedView

    override fun setBaseview(baseView: TopRatedView) {
        this.topRatedView = baseView
    }

    override fun getMovies(): Unit = run {
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.getAllStadionsOnce(this) { onMoviesReceived(it) }
        }
    }


    override fun getFavorites() {
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.listenToFavoriteStadiums(this) { onSuccessfulRequestMovies(it) }
        }
    }

    override fun onSuccessfulRequestMovies(stadiums: List<Stadium>) = topRatedView.setFavorites(stadiums)


    override fun onFailedRequestMovies() {
        //TODO couldn't load favorite movies
    }

    private fun onMoviesReceived(list: List<Stadium>) {
        Log.d("VISNJAA", list.toString())
        if (list.isEmpty()) topRatedView.showMessageEmptyList() else topRatedView.hideMessageEmptyList()
        topRatedView.setMovies(list)
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.getFavoriteStadionsOnce(this) { onSuccessfulRequestMovies(it) }
        }
    }

    override fun onLikeTapped(stadium: Stadium) {
        stadium.isLiked = !stadium.isLiked
        authenticationHelper.getCurrentUser()?.uid?.run {
            databaseHelper.onStadiumLiked(this, stadium)
        }
    }
}