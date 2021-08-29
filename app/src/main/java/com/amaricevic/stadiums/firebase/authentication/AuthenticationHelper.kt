package com.amaricevic.stadiums.firebase.authentication

import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FirebaseUser
import com.amaricevic.stadiums.data.model.User
import com.amaricevic.stadiums.firebase.EmptyRequestListener
import com.amaricevic.stadiums.firebase.UserRequestListener

interface AuthenticationHelper {

    fun logTheUserIn(email: String, password: String, listener: UserRequestListener)

    fun attemptToRegisterTheUser(email: String, password: String, name: String, listener: EmptyRequestListener)

    fun setUserDisplayName(username: String)

    fun logTheUserOut()

    fun checkIfUserIsLoggedIn(): Boolean

    fun getCurrentUserId(): String?

    fun getCurrentUser(): FirebaseUser?

    fun editUser(user: User, listener: UserRequestListener)

    fun signInWithFacebook(credential : AuthCredential, listener: UserRequestListener)
}