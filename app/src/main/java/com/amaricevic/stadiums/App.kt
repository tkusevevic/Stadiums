package com.amaricevic.stadiums

import android.app.Application
import com.google.firebase.FirebaseApp
import com.amaricevic.stadiums.di.AppComponent
import com.amaricevic.stadiums.di.DaggerAppComponent
import com.amaricevic.stadiums.di.module.AppModule

class App : Application() {

    companion object {
        val appComponent: AppComponent by lazy { DaggerAppComponent.builder().appModule(AppModule(instance)).build() }

        internal lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
        instance = this
        appComponent.inject(this)
    }
}