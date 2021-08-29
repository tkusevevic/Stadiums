package com.amaricevic.stadiums.presentation

import com.amaricevic.stadiums.base.BasePresenter
import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.ui.search_movie.SearchView

interface StadiumSearchPresenter : BasePresenter<SearchView> {

    fun getStadiums(input: String)

    fun setAllStadiums()

    fun onLikeTapped(stadium: Stadium)

    fun getFavorites()

    fun clearList()
}