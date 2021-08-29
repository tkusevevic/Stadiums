package com.amaricevic.stadiums.presentation

import com.amaricevic.stadiums.base.BasePresenter
import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.ui.stadiums.views.AllStadiumsView

interface AllStadiumsPresenter : BasePresenter<AllStadiumsView> {

    fun getStadiums()

    fun getFavorites()

    fun onLikeTapped(stadium: Stadium)
}