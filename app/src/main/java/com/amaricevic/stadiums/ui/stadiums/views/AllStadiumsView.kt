package com.amaricevic.stadiums.ui.stadiums.views

import com.amaricevic.stadiums.data.model.Stadium

interface AllStadiumsView {

    fun setStadiums(stadiums: List<Stadium>)

    fun addStadions(stadiums: List<Stadium>)

    fun setFavorites(favorites : List<Stadium>)

    fun showMessageEmptyList()

    fun hideMessageEmptyList()

}