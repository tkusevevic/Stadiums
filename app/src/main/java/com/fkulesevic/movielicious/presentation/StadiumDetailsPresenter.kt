package com.fkulesevic.movielicious.presentation

import com.fkulesevic.movielicious.base.BasePresenter
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.ui.movie_details.MovieDetailsView

interface StadiumDetailsPresenter : BasePresenter<MovieDetailsView> {

    fun onLikeTapped(stadium: Stadium)
}