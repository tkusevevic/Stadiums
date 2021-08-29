package com.amaricevic.stadiums.ui.signIn

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.amaricevic.stadiums.R
import com.amaricevic.stadiums.commons.constants.*
import com.amaricevic.stadiums.commons.extensions.hide
import com.amaricevic.stadiums.commons.extensions.onClick
import com.amaricevic.stadiums.commons.extensions.show
import com.amaricevic.stadiums.data.model.User
import com.amaricevic.stadiums.presentation.SignInPresenter
import com.amaricevic.stadiums.signInPresenter
import com.amaricevic.stadiums.ui.stadiums.StadiumsActivity
import com.amaricevic.stadiums.ui.registration.RegistrationActivity
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity(), SignInView {

    private val presenter: SignInPresenter by lazy { signInPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        initPresenter()
        initListeners()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    private fun initPresenter() = presenter.setBaseview(this)

    private fun initListeners() {
        signIn.onClick { presenter.onSignInClick(emailSignIn.text.toString(), passwordSignIn.text.toString()) }

        goToRegistration.onClick { startActivity(Intent(this, RegistrationActivity::class.java)) }
    }

    override fun hidePasswordError() {
        layoutPasswordSign.isErrorEnabled = false
    }

    override fun hideEmailError() {
        layoutEmailSign.isErrorEnabled = false
    }

    override fun showPasswordError() {
        layoutPasswordSign.error = PASSWORD_ERROR
    }

    override fun showEmailError() {
        layoutEmailSign.error = EMAIL_ERROR
    }

    override fun showProgressAndHideOther() {
        progressSign.show()
        layoutWithoutImageSign.hide()
    }

    override fun hideProgressAndShowOther() {
        progressSign.hide()
        layoutWithoutImageSign.show()
    }

    override fun startStadiumActivity(user: User) {
        val intent = Intent(this, StadiumsActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun showMessage(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
