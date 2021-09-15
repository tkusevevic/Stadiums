package com.amaricevic.stadiums.presentation

import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.firebase.StadiumsRequestListener
import com.amaricevic.stadiums.firebase.authentication.AuthenticationHelper
import com.amaricevic.stadiums.firebase.database.DatabaseHelper
import com.amaricevic.stadiums.ui.stadiums.views.AllStadiumsView
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
            databaseHelper.onStadiumLiked(authenticationHelper.getCurrentUser()?.uid.toString(), stadium)
        }
    }
}