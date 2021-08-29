package com.amaricevic.stadiums.ui.signIn

import com.amaricevic.stadiums.data.model.User

interface SignInView {

    fun showEmailError()

    fun showPasswordError()

    fun hideEmailError()

    fun hidePasswordError()

    fun showProgressAndHideOther()

    fun hideProgressAndShowOther()

    fun startStadiumActivity(user: User)

    fun showMessage(message: String)
}