package com.amaricevic.stadiums.ui.splash

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.amaricevic.stadiums.App
import com.amaricevic.stadiums.preferences.PreferencesHelperImpl
import com.amaricevic.stadiums.ui.signIn.SignInActivity
import com.amaricevic.stadiums.ui.stadiums.StadiumsActivity

class SplashActivity : Activity(), SplashView {


    private val prefs: PreferencesHelperImpl by lazy {
        PreferencesHelperImpl(App.prefs)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (prefs.userIdExists())
            this.startApp()
        else
            this.startSignIn()
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