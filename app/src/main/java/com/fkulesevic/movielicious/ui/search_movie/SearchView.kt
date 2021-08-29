package com.fkulesevic.movielicious.ui.search_movie

import com.fkulesevic.movielicious.data.model.Stadium

interface SearchView {

    fun setStadiums(stadiums: List<Stadium>)

    fun addStadiums(stadiums: List<Stadium>)

    fun setFavorites(favorites: List<Stadium>)

    fun clearList()
}