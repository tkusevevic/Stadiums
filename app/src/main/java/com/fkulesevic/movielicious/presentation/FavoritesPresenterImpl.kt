package com.fkulesevic.movielicious.presentation

import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.firebase.StadiumsRequestListener
import com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper
import com.fkulesevic.movielicious.firebase.database.DatabaseHelper
import com.fkulesevic.movielicious.ui.stadiums.views.FavoritesView
import javax.inject.Inject

class FavoritesPresenterImpl @Inject constructor(private val authenticationHelper: AuthenticationHelper,
                                                 private val database: DatabaseHelper) : FavoritesPresenter, StadiumsRequestListener {

    private lateinit var favoritesView: FavoritesView

    override fun setBaseview(baseView: FavoritesView) {
        this.favoritesView = baseView
    }

    override fun getFavorites() {
        val userId = authenticationHelper.getCurrentUserId()
        userId?.let { database.listenToFavoriteStadiums(it, { this.onSuccessfulRequest(it) }) }
    }

    override fun onSuccessfulRequest(stadiums: List<Stadium>) {
        if (stadiums.isEmpty()) {
            favoritesView.showMessageOnScreen()
        } else {
            favoritesView.hideMessageOnScreen()
        }
        favoritesView.setFavorites(stadiums)
    }

    override fun onFailedRequest() {
        //TODO couldn't load favorites
    }

    override fun onLikeTapped(stadium: Stadium) {
        stadium.isLiked = !stadium.isLiked
        authenticationHelper.getCurrentUser()?.uid?.run {
            database.onStadiumLiked(this, stadium)
        }
    }
}