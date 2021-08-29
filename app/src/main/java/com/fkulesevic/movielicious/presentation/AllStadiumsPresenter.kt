package com.fkulesevic.movielicious.presentation

import com.fkulesevic.movielicious.base.BasePresenter
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.ui.stadiums.views.AllStadiumsView

interface AllStadiumsPresenter : BasePresenter<AllStadiumsView> {

    fun getStadiums()

    fun getFavorites()

    fun onLikeTapped(stadium: Stadium)
}