package com.amaricevic.stadiums.presentation

import com.amaricevic.stadiums.base.BasePresenter
import com.amaricevic.stadiums.ui.splash.SplashView

interface SplashPresenter: BasePresenter<SplashView> {

    fun checkPrefs()
}