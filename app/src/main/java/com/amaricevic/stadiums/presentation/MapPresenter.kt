package com.amaricevic.stadiums.presentation

import com.amaricevic.stadiums.base.BasePresenter
import com.amaricevic.stadiums.ui.map.MapView

interface MapPresenter : BasePresenter<MapView> {

    fun getStadiums()

}