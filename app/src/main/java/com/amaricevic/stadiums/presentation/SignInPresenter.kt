package com.amaricevic.stadiums.presentation

import com.amaricevic.stadiums.base.BasePresenter
import com.amaricevic.stadiums.ui.signIn.SignInView

interface SignInPresenter : BasePresenter<SignInView> {

    fun onSignInClick(email: String, password: String)
}