package com.fkulesevic.movielicious.presentation

import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.firebase.StadiumsRequestListener
import com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper
import com.fkulesevic.movielicious.firebase.database.DatabaseHelper
import com.fkulesevic.movielicious.ui.map.MapView
import javax.inject.Inject

class MapPresetnerImpl @Inject constructor(private val authenticationHelper: AuthenticationHelper,
                       private val database: DatabaseHelper) : MapPresenter, StadiumsRequestListener {

    private lateinit var mapView: MapView


    override fun setBaseview(baseView: MapView) {
        this.mapView = baseView
    }

    override fun getStadiums() {
        val userId = authenticationHelper.getCurrentUserId()
        userId?.let { database.getAllStadionsOnce(it, { this.onSuccessfulRequestMovies(it) }) }
    }

    override fun onSuccessfulRequestMovies(stadiums: List<Stadium>) {
        mapView.setStadiums(stadiums)
    }

    override fun onFailedRequestMovies() {
        //TODO couldn't load favorites movies
    }
}