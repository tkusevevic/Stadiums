package com.amaricevic.stadiums.presentation

import com.amaricevic.stadiums.commons.constants.ERROR_EMAIL_OR_PASSWORD
import com.amaricevic.stadiums.commons.utils.checkEmailEmpty
import com.amaricevic.stadiums.commons.utils.checkPasswordEmpty
import com.amaricevic.stadiums.commons.utils.isValidEmail
import com.amaricevic.stadiums.data.model.User
import com.amaricevic.stadiums.firebase.UserRequestListener
import com.amaricevic.stadiums.firebase.authentication.AuthenticationHelper
import com.amaricevic.stadiums.preferences.PreferencesHelper
import com.amaricevic.stadiums.ui.signIn.SignInView
import javax.inject.Inject

class SignInPresenterImpl @Inject constructor(private val authenticationHelper: AuthenticationHelper,
                                              private val preferencesHelper: PreferencesHelper) : SignInPresenter, UserRequestListener {

    private lateinit var signView: SignInView

    override fun setBaseview(baseView: SignInView) {
        this.signView = baseView
    }

    override fun onSignInClick(email: String, password: String) {
        signView.showProgressAndHideOther()
        if (!email.isEmpty() && !password.isEmpty() && password.length > 5) {
            tryToSignIn(email, password)
        } else {
            signView.hideProgressAndShowOther()
        }
        checkInputEmpty(email, password)
    }

    private fun tryToSignIn(email: String, password: String) {
        authenticationHelper.logTheUserIn(email, password, this)
    }

    private fun checkInputEmpty(email: String, password: String) {
        if (checkEmailEmpty(email.trim()) || !isValidEmail(email.trim()))
            signView.showEmailError()
        else signView.hideEmailError()

        if (checkPasswordEmpty(password.trim()) || password.trim().length < 6)
            signView.showPasswordError()
        else signView.hidePasswordError()
    }

    override fun onSuccessfulRequest(user: User) {
        preferencesHelper.saveId(user.id)
        signView.startStadiumActivity(user)
        signView.hideProgressAndShowOther()
    }

    override fun onFailedRequest() {
        signView.hideProgressAndShowOther()
        signView.showMessage(ERROR_EMAIL_OR_PASSWORD)
    }
}