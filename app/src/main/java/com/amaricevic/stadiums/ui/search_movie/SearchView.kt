package com.amaricevic.stadiums.ui.search_movie

import com.amaricevic.stadiums.data.model.Stadium

interface SearchView {

    fun setStadiums(stadiums: List<Stadium>)

    fun addStadiums(stadiums: List<Stadium>)

    fun setFavorites(favorites: List<Stadium>)

    fun clearList()
}