package com.amaricevic.stadiums.commons.extensions

import android.content.Context
import android.widget.Toast
import com.amaricevic.stadiums.data.model.User
import com.google.firebase.auth.FirebaseUser

fun Context?.toast(message: String) {
    this?.let { Toast.makeText(this, message, Toast.LENGTH_SHORT).show() }
}

fun FirebaseUser.mapToUser(): User = User(
    this.uid,
    this.email ?: "", this.displayName ?: "", ""
)