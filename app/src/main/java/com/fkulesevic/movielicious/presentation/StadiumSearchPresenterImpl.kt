package com.fkulesevic.movielicious.presentation

import android.util.Log
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.firebase.StadiumsRequestListener
import com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper
import com.fkulesevic.movielicious.firebase.database.DatabaseHelper
import com.fkulesevic.movielicious.ui.search_movie.SearchView
import javax.inject.Inject

class StadiumSearchPresenterImpl @Inject constructor(private val authenticationHelper: AuthenticationHelper,
                                                     private val databaseHelper: DatabaseHelper) : StadiumSearchPresenter, StadiumsRequestListener {

    private lateinit var view: SearchView

    override fun setBaseview(baseView: SearchView) {
        view = baseView
    }

    override fun getStadiums(input: String): Unit = run {
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.getAllStadionsOnce(this) { onItemsReceived(it.filter { it.name.lowercase().startsWith(input.lowercase()) }) }
        }
    }

    override fun setAllStadiums(): Unit = run {
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.getAllStadionsOnce(this) { onItemsReceived(it) }
        }
    }

    private fun onItemsReceived(list: List<Stadium>) {
        view.setStadiums(list)
        authenticationHelper.getCurrentUserId()?.run {
            databaseHelper.getFavoriteStadionsOnce(this) { onSuccessfulRequest(it) }
        }
    }

    override fun onSuccessfulRequest(stadiums: List<Stadium>) = view.setFavorites(stadiums)

    override fun onFailedRequest() {
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
            databaseHelper.listenToFavoriteStadiums(this, { onSuccessfulRequest(it) })
        }
    }
}