package com.amaricevic.stadiums.presentation

import com.amaricevic.stadiums.base.BasePresenter
import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.ui.stadiums.views.FavoritesView

interface FavoritesPresenter : BasePresenter<FavoritesView> {

    fun getFavorites()

    fun onLikeTapped(stadium: Stadium)
}