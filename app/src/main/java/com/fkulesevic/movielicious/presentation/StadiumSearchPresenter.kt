package com.fkulesevic.movielicious.presentation

import com.fkulesevic.movielicious.base.BasePresenter
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.ui.search_movie.SearchView

interface StadiumSearchPresenter : BasePresenter<SearchView> {

    fun getStadiums(input: String)

    fun setAllStadiums()

    fun onLikeTapped(stadium: Stadium)

    fun getFavorites()

    fun clearList()
}