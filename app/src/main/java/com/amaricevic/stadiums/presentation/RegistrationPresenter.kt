package com.amaricevic.stadiums.presentation

import com.amaricevic.stadiums.base.BasePresenter
import com.amaricevic.stadiums.ui.registration.RegistrationView

interface RegistrationPresenter : BasePresenter<RegistrationView> {

    fun onRegistrationClick(email: String, password: String, name: String)
}