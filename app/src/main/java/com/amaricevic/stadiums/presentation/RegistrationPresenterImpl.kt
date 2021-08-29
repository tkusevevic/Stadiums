package com.amaricevic.stadiums.presentation

import com.amaricevic.stadiums.commons.constants.FAILED_REGISRATION
import com.amaricevic.stadiums.commons.constants.SUCCESS_REGISTRATION
import com.amaricevic.stadiums.commons.utils.checkEmailEmpty
import com.amaricevic.stadiums.commons.utils.checkNameEmpty
import com.amaricevic.stadiums.commons.utils.checkPasswordEmpty
import com.amaricevic.stadiums.commons.utils.isValidEmail
import com.amaricevic.stadiums.firebase.EmptyRequestListener
import com.amaricevic.stadiums.firebase.authentication.AuthenticationHelper
import com.amaricevic.stadiums.ui.registration.RegistrationView
import javax.inject.Inject

class RegistrationPresenterImpl @Inject constructor(private val authenticationHelper: AuthenticationHelper) : RegistrationPresenter, EmptyRequestListener {

    private lateinit var regView: RegistrationView

    override fun setBaseview(baseView: RegistrationView) {
        this.regView = baseView
    }

    override fun onRegistrationClick(email: String, password: String, name: String) {
        regView.showProgressAndHideOther()
        if (!email.isEmpty() && !password.isEmpty() && password.length > 5)
            tryToRegister(email, password, name)
        else
            regView.hideProgressAndShowOther()
        chechInputEmpty(email, password, name)
    }

    private fun chechInputEmpty(email: String, password: String, name: String) {
        if (checkEmailEmpty(email.trim()) || !isValidEmail(email.trim())) regView.showEmailError() else regView.hideEmailError()

        if (checkPasswordEmpty(password.trim()) || password.trim().length < 6) regView.showPasswordError() else regView.hidePasswordError()

        if (checkNameEmpty(name.trim())) regView.showNameError() else regView.hideNameError()
    }

    private fun tryToRegister(email: String, password: String, name: String) {
        authenticationHelper.attemptToRegisterTheUser(email, password, name, this)
    }

    override fun onSuccessfulRequest() {
        regView.hideProgressAndShowOther()
        regView.showMessage(SUCCESS_REGISTRATION)
        regView.startSignIn()
    }

    override fun onFailedRequest() {
        regView.hideProgressAndShowOther()
        regView.showMessage(FAILED_REGISRATION)
    }
}

