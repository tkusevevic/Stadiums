package com.fkulesevic.movielicious.ui.map

import com.fkulesevic.movielicious.data.model.Stadium

interface MapView {

    fun setStadiums(stadiums: List<Stadium>)

    fun setPlacesToMap(places: List<Stadium>)

    fun addMarker(stadium: Stadium)
}