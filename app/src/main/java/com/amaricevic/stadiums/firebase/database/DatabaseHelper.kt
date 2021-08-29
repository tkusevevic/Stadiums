package com.amaricevic.stadiums.firebase.database

import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.data.model.User

interface DatabaseHelper {

    fun saveUser(user: User)

    fun getUser(id: String, returningUser: (User) -> Unit)

    fun onStadiumLiked(userId: String, stadium: Stadium)

    fun listenToFavoriteStadiums(userId: String, onFavoriteReceived: (List<Stadium>) -> Unit)

    fun getFavoriteStadionsOnce(userId: String, onFavoriteReceived: (List<Stadium>) -> Unit)

    fun getAllStadionsOnce(userId: String, onFavoritesReceived: (List<Stadium>) -> Unit)

    fun addFavorites(userId: String, stadiums: List<Stadium>)

    fun getUsers( onUsersRecieved: (List<User>) -> Unit)
}