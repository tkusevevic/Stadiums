package com.fkulesevic.movielicious.presentation

import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.firebase.StadiumsRequestListener
import com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper
import com.fkulesevic.movielicious.firebase.database.DatabaseHelper
import com.fkulesevic.movielicious.ui.stadiums.views.AllStadiumsView
import javax.inject.Inject

class AllStadiumsPresenterImpl @Inject constructor(private val authenticationHelper: AuthenticationHelper,
                                                   private val databaseHelper: DatabaseHelper) : AllStadiumsPresenter, StadiumsRequestListener {

    private lateinit var topRatedView: AllStadiumsView

    override fun setBaseview(baseView: AllStadiumsView) {
        this.topRatedView = baseView
    }

    override fun getStadiums(): Unit = run {
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.getAllStadionsOnce(this) { onItemsReceived(it) }
        }
    }


    override fun getFavorites() {
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.listenToFavoriteStadiums(this) { onSuccessfulRequest(it) }
        }
    }

    override fun onSuccessfulRequest(stadiums: List<Stadium>) = topRatedView.setFavorites(stadiums)


    override fun onFailedRequest() {
        //TODO couldn't load favorites
    }

    private fun onItemsReceived(list: List<Stadium>) {
        if (list.isEmpty()) topRatedView.showMessageEmptyList() else topRatedView.hideMessageEmptyList()
        topRatedView.setStadiums(list)
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.getFavoriteStadionsOnce(this) { onSuccessfulRequest(it) }
        }
    }

    override fun onLikeTapped(stadium: Stadium) {
        stadium.isLiked = !stadium.isLiked
        authenticationHelper.getCurrentUser()?.uid?.run {
            databaseHelper.onStadiumLiked(this, stadium)
        }
    }
}