package com.amaricevic.stadiums.ui.stadiums.views

import com.amaricevic.stadiums.data.model.Stadium

interface FavoritesView {

    fun setFavorites(stadiums: List<Stadium>)

    fun showMessageOnScreen()

    fun hideMessageOnScreen()
}