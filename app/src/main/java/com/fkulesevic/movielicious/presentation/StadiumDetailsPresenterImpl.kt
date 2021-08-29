package com.fkulesevic.movielicious.presentation

import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper
import com.fkulesevic.movielicious.firebase.database.DatabaseHelper
import com.fkulesevic.movielicious.ui.stadium_details.DetailsView
import javax.inject.Inject

class StadiumDetailsPresenterImpl @Inject constructor(private val authenticationHelper: AuthenticationHelper,
                                                      private val databaseHelper: DatabaseHelper) : StadiumDetailsPresenter {

    private lateinit var detailsView: DetailsView

    override fun setBaseview(baseView: DetailsView) {
        detailsView = baseView
    }

    override fun onLikeTapped(stadium: Stadium) {
        stadium.isLiked = !stadium.isLiked
        authenticationHelper.getCurrentUser()?.uid?.run {
            databaseHelper.onStadiumLiked(this, stadium)
        }
        detailsView.setLike(stadium.isLiked)
    }
}