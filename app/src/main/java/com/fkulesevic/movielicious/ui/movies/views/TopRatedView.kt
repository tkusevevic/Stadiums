package com.fkulesevic.movielicious.ui.movies.views

import com.fkulesevic.movielicious.data.model.Stadium

interface TopRatedView {

    fun setMovies(stadiums: List<Stadium>)

    fun addMovies(stadiums: List<Stadium>)

    fun setFavorites(favorites : List<Stadium>)

    fun showMessageEmptyList()

    fun hideMessageEmptyList()

}