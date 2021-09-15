package com.amaricevic.stadiums.ui.splash

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.amaricevic.stadiums.presentation.SplashPresenter
import com.amaricevic.stadiums.splashPresenter
import com.amaricevic.stadiums.ui.stadiums.StadiumsActivity
import com.amaricevic.stadiums.ui.signIn.SignInActivity

class SplashActivity : Activity(), SplashView {

    private val presenter: SplashPresenter by lazy { splashPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.setBaseview(this)
        presenter.checkPrefs()
    }

    override fun startApp() {
        startActivity(Intent(this, StadiumsActivity::class.java))
        finish()
    }

    override fun startSignIn() {
        startActivity(Intent(this, SignInActivity::class.java))
        finish()
    }
}