package com.fkulesevic.movielicious.ui.stadiums.views

import com.fkulesevic.movielicious.data.model.Stadium

interface FavoritesView {

    fun setFavorites(stadiums: List<Stadium>)

    fun showMessageOnScreen()

    fun hideMessageOnScreen()
}