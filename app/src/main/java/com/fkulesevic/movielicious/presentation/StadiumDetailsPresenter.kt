package com.fkulesevic.movielicious.presentation

import com.fkulesevic.movielicious.base.BasePresenter
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.ui.stadium_details.DetailsView

interface StadiumDetailsPresenter : BasePresenter<DetailsView> {

    fun onLikeTapped(stadium: Stadium)
}