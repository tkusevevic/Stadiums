package com.amaricevic.stadiums

import android.app.Application
import android.content.SharedPreferences
import com.amaricevic.stadiums.commons.constants.PREFS_NAME
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class App : Application() {

    companion object {
        internal lateinit var instance: App
        internal lateinit var database: DatabaseReference
        internal lateinit var auth: FirebaseAuth
        internal lateinit var prefs: SharedPreferences
    }

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
        instance = this
        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance().reference
        prefs = this.getSharedPreferences(PREFS_NAME, MODE_PRIVATE)
    }
}