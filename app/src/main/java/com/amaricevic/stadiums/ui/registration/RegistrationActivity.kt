package com.amaricevic.stadiums.ui.registration

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.amaricevic.stadiums.App
import com.amaricevic.stadiums.R
import com.amaricevic.stadiums.commons.constants.*
import com.amaricevic.stadiums.commons.extensions.hide
import com.amaricevic.stadiums.commons.extensions.onClick
import com.amaricevic.stadiums.commons.extensions.show
import com.amaricevic.stadiums.commons.utils.checkEmailEmpty
import com.amaricevic.stadiums.commons.utils.checkNameEmpty
import com.amaricevic.stadiums.commons.utils.checkPasswordEmpty
import com.amaricevic.stadiums.commons.utils.isValidEmail
import com.amaricevic.stadiums.firebase.EmptyRequestListener
import com.amaricevic.stadiums.firebase.authentication.AuthenticationHelperImpl
import com.amaricevic.stadiums.firebase.database.DatabaseHelperImpl
import com.amaricevic.stadiums.ui.signIn.SignInActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity(), RegistrationView, EmptyRequestListener {

    private val auth: AuthenticationHelperImpl by lazy {
        AuthenticationHelperImpl(
            App.auth,
            DatabaseHelperImpl(App.database)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        initListeners()
    }

    private fun initListeners() {
        registrationBtn.onClick {
            this.onRegistrationClick(
                email.text.toString(), password.text.toString(), name.text.toString()
            )
        }
    }

    // logic functions
    private fun onRegistrationClick(email: String, password: String, name: String) {
        this.showProgressAndHideOther()
        if (!email.isEmpty() && !password.isEmpty() && password.length > 5)
            tryToRegister(email, password, name)
        else
            this.hideProgressAndShowOther()
        chechInputEmpty(email, password, name)
    }

    private fun chechInputEmpty(email: String, password: String, name: String) {
        if (checkEmailEmpty(email.trim()) || !isValidEmail(email.trim())) this.showEmailError() else this.hideEmailError()

        if (checkPasswordEmpty(password.trim()) || password.trim().length < 6) this.showPasswordError() else this.hidePasswordError()

        if (checkNameEmpty(name.trim())) this.showNameError() else this.hideNameError()
    }

    private fun tryToRegister(email: String, password: String, name: String) {
        auth.attemptToRegisterTheUser(email, password, name, this)
    }

    override fun onSuccessfulRequest() {
        this.hideProgressAndShowOther()
        this.showMessage(SUCCESS_REGISTRATION)
        this.startSignIn()
    }

    override fun onFailedRequest() {
        this.hideProgressAndShowOther()
        this.showMessage(FAILED_REGISRATION)
    }

    // view functions
    override fun showProgressAndHideOther() {
        progress.show()
        layoutWithoutImage.hide()
    }

    override fun hideProgressAndShowOther() {
        progress.hide()
        layoutWithoutImage.show()
    }

    override fun showEmailError() {
        layoutEmail.error = EMAIL_ERROR
    }

    override fun hideEmailError() {
        layoutEmail.isErrorEnabled = false
    }

    override fun showPasswordError() {
        layoutPassword.error = PASSWORD_ERROR
    }

    override fun hidePasswordError() {
        layoutPassword.isErrorEnabled = false
    }

    override fun showNameError() {
        layoutName.error = NO_NAME_ERROR
    }

    override fun hideNameError() {
        layoutName.isErrorEnabled = false
    }

    override fun startSignIn() = startActivity(Intent(this, SignInActivity::class.java))

    override fun showMessage(message: String) =
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

