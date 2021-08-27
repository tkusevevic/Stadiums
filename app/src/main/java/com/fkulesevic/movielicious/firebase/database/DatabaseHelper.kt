package com.fkulesevic.movielicious.firebase.database

import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.data.model.User

interface DatabaseHelper {

    fun saveUser(user: User)

    fun getUser(id: String, returningUser: (User) -> Unit)

    fun onStadiumLiked(userId: String, stadium: Stadium)

    fun listenToFavoriteStadiums(userId: String, onFavoriteMoviesReceived: (List<Stadium>) -> Unit)

    fun getFavoriteStadionsOnce(userId: String, onFavoriteMoviesReceived: (List<Stadium>) -> Unit)

    fun getAllStadionsOnce(userId: String, onFavoriteMoviesReceived: (List<Stadium>) -> Unit)

    fun addFavorites(userId: String, stadiums: List<Stadium>)

    fun getUsers( onUsersRecieved: (List<User>) -> Unit)
}