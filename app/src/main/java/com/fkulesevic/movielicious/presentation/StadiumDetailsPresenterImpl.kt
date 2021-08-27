package com.fkulesevic.movielicious.presentation

import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper
import com.fkulesevic.movielicious.firebase.database.DatabaseHelper
import com.fkulesevic.movielicious.ui.movie_details.MovieDetailsView
import javax.inject.Inject

class StadiumDetailsPresenterImpl @Inject constructor(private val authenticationHelper: AuthenticationHelper,
                                                      private val databaseHelper: DatabaseHelper) : StadiumDetailsPresenter {

    private lateinit var movieDetailsView: MovieDetailsView

    override fun setBaseview(baseView: MovieDetailsView) {
        movieDetailsView = baseView
    }

    override fun onLikeTapped(stadium: Stadium) {
        stadium.isLiked = !stadium.isLiked
        authenticationHelper.getCurrentUser()?.uid?.run {
            databaseHelper.onStadiumLiked(this, stadium)
        }
        movieDetailsView.setLike(stadium.isLiked)
    }
}