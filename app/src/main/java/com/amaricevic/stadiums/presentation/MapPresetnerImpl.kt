package com.amaricevic.stadiums.presentation

import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.firebase.StadiumsRequestListener
import com.amaricevic.stadiums.firebase.authentication.AuthenticationHelper
import com.amaricevic.stadiums.firebase.database.DatabaseHelper
import com.amaricevic.stadiums.ui.map.MapView
import javax.inject.Inject

class MapPresetnerImpl @Inject constructor(private val authenticationHelper: AuthenticationHelper,
                       private val database: DatabaseHelper) : MapPresenter, StadiumsRequestListener {

    private lateinit var mapView: MapView


    override fun setBaseview(baseView: MapView) {
        this.mapView = baseView

    }

    override fun getStadiums() {
        val userId = authenticationHelper.getCurrentUserId()
        userId?.let { database.getAllStadionsOnce(it, { this.onSuccessfulRequest(it) }) }
    }

    override fun onSuccessfulRequest(stadiums: List<Stadium>) {
        mapView.setStadiums(stadiums)
    }

    override fun onFailedRequest() {
        //TODO couldn't load favorites
    }
}