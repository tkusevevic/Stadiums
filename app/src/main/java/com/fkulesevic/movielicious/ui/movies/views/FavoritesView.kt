package com.fkulesevic.movielicious.ui.movies.views

import com.fkulesevic.movielicious.data.model.Stadium

interface FavoritesView {

    fun setMovies(stadiums: List<Stadium>)

    fun showMessageOnScreen()

    fun hideMessageOnScreen()
}