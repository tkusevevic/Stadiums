package com.fkulesevic.movielicious.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fkulesevic.movielicious.presentation.SplashPresenter
import com.fkulesevic.movielicious.splashPresenter
import com.fkulesevic.movielicious.ui.stadiums.StadiumsActivity
import com.fkulesevic.movielicious.ui.signIn.SignInActivity

class SplashActivity : AppCompatActivity(), SplashView {

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