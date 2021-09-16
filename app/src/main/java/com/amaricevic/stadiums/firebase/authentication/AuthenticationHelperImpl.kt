package com.amaricevic.stadiums.firebase.authentication

import com.amaricevic.stadiums.commons.extensions.mapToUser
import com.amaricevic.stadiums.firebase.RegisterRequestListener
import com.amaricevic.stadiums.firebase.SignUpRequestListener
import com.amaricevic.stadiums.firebase.database.DatabaseHelper
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class AuthenticationHelperImpl constructor(
    private val firebaseAuth: FirebaseAuth,
    private val databaseHelper: DatabaseHelper
) : AuthenticationHelper {

    override fun attemptToRegisterTheUser(
        email: String,
        password: String,
        name: String,
        listener: RegisterRequestListener
    ) {
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val user = firebaseAuth.currentUser
                firebaseAuth.currentUser?.run {
                    val mappedUser = user?.mapToUser()
                    mappedUser?.userDisplayName = name
                    mappedUser?.let { databaseHelper.saveUser(it) }
                    listener.onSuccessfulRequest()
                }
            } else {
                listener.onFailedRequest()
            }
        }
    }

    override fun logTheUserIn(email: String, password: String, listener: SignUpRequestListener) {
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                firebaseAuth.currentUser?.run {
                    listener.onSuccessfulRequest(mapToUser())
                }
            } else {
                listener.onFailedRequest()
            }
        }
    }

    override fun logTheUserOut() {
        firebaseAuth.signOut()
    }

    override fun checkIfUserIsLoggedIn(): Boolean = (firebaseAuth.currentUser != null)

    override fun getCurrentUserId(): String? = firebaseAuth.currentUser?.uid

    override fun getCurrentUser(): FirebaseUser? = (firebaseAuth.currentUser)
}
