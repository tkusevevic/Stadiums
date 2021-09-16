package com.amaricevic.stadiums.firebase.authentication

import com.amaricevic.stadiums.firebase.RegisterRequestListener
import com.amaricevic.stadiums.firebase.SignUpRequestListener
import com.google.firebase.auth.FirebaseUser

interface AuthenticationHelper {

    fun logTheUserIn(email: String, password: String, listener: SignUpRequestListener)

    fun attemptToRegisterTheUser(
        email: String,
        password: String,
        name: String,
        listener: RegisterRequestListener
    )

    fun logTheUserOut()

    fun checkIfUserIsLoggedIn(): Boolean

    fun getCurrentUserId(): String?

    fun getCurrentUser(): FirebaseUser?
}