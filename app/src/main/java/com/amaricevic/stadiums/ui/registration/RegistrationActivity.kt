package com.amaricevic.stadiums.ui.registration

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.amaricevic.stadiums.R
import com.amaricevic.stadiums.commons.constants.EMAIL_ERROR
import com.amaricevic.stadiums.commons.constants.NO_NAME_ERROR
import com.amaricevic.stadiums.commons.constants.PASSWORD_ERROR
import com.amaricevic.stadiums.commons.extensions.hide
import com.amaricevic.stadiums.commons.extensions.onClick
import com.amaricevic.stadiums.commons.extensions.show
import com.amaricevic.stadiums.presentation.RegistrationPresenter
import com.amaricevic.stadiums.registrationPresenter
import com.amaricevic.stadiums.ui.signIn.SignInActivity
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity(), RegistrationView {

    private val presenter: RegistrationPresenter by lazy { registrationPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        initPresenter()
        initListeners()
    }

    private fun initPresenter() = presenter.setBaseview(this)

    private fun initListeners() {
        registrationBtn.onClick {
            presenter.onRegistrationClick(
                    email.text.toString()
                    , password.text.toString()
                    , name.text.toString())
        }
    }

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

    override fun showMessage(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

