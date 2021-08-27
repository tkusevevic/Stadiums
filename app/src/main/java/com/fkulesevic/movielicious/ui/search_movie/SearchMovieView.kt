package com.fkulesevic.movielicious.ui.search_movie

import com.fkulesevic.movielicious.data.model.Stadium

interface SearchMovieView {

    fun setMovies(stadiums: List<Stadium>)

    fun addMovies(stadiums: List<Stadium>)

    fun setFavorites(favorites: List<Stadium>)

    fun clearList()
}