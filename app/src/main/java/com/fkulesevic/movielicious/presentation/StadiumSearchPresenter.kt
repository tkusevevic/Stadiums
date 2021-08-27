package com.fkulesevic.movielicious.presentation

import com.fkulesevic.movielicious.base.BasePresenter
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.ui.search_movie.SearchMovieView

interface StadiumSearchPresenter : BasePresenter<SearchMovieView> {

    fun getMovies(input: String)

    fun setAllStadiums()

    fun onLikeTapped(stadium: Stadium)

    fun getFavorites()

    fun clearList()
}