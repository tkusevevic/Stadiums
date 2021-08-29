package com.amaricevic.stadiums.ui.map

import com.amaricevic.stadiums.data.model.Stadium

interface MapView {

    fun setStadiums(stadiums: List<Stadium>)

    fun setPlacesToMap(places: List<Stadium>)

    fun addMarker(stadium: Stadium)
}