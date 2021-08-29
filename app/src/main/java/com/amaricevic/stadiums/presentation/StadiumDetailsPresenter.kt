package com.amaricevic.stadiums.presentation

import com.amaricevic.stadiums.base.BasePresenter
import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.ui.stadium_details.DetailsView

interface StadiumDetailsPresenter : BasePresenter<DetailsView> {

    fun onLikeTapped(stadium: Stadium)
}