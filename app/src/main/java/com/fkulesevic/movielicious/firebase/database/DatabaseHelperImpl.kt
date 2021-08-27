package com.fkulesevic.movielicious.firebase.database

import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.data.model.User
import javax.inject.Inject

class DatabaseHelperImpl @Inject constructor(private val reference: DatabaseReference) : DatabaseHelper {

    override fun saveUser(user: User) {
        reference.child("users").child(user.id).setValue(user)
    }

    override fun getUser(id: String, returningUser: (User) -> Unit) {
        reference.child("users").child(id).addValueEventListener(object : ValueEventListener {
            override fun onCancelled(error: DatabaseError) {}

            override fun onDataChange(snapshot: DataSnapshot) {
                snapshot.run {
                    val user: User? = getValue(User::class.java)
                    user?.run {
                        returningUser(user)
                    }
                }
            }

        })
    }

    override fun addFavorites(userId: String, stadiums: List<Stadium>) {
        stadiums.forEach { movie ->
            val userMovie = reference.child("users").child(userId).child("stadiums").child(movie.id.toString())
            userMovie.setValue(movie)
        }
    }

    override fun onStadiumLiked(userId: String, stadium: Stadium) {
        val userMovies = reference.child("users").child(userId).child("stadiums").child(stadium.id.toString())
        userMovies.setValue(if (!stadium.isLiked) null else stadium)
    }

    override fun listenToFavoriteStadiums(userId: String, onFavoriteMoviesReceived: (List<Stadium>) -> Unit) {
        reference.child("users").child(userId).child("stadiums").addValueEventListener(object : ValueEventListener {
            override fun onCancelled(error: DatabaseError) {}

            override fun onDataChange(datasnapshot: DataSnapshot) {
                val values = if (datasnapshot.hasChildren()) datasnapshot.children.map { it.getValue(Stadium::class.java) } else listOf()

                onFavoriteMoviesReceived(values.filterNotNull())
            }
        })
    }

    override fun getFavoriteStadionsOnce(userId: String, onFavoriteMoviesReceived: (List<Stadium>) -> Unit) {
        reference.child("users").child(userId).child("stadiums").addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onCancelled(error: DatabaseError) {}

            override fun onDataChange(datasnapshot: DataSnapshot) {
                val values = if (datasnapshot.hasChildren()) datasnapshot.children.map { it.getValue(Stadium::class.java) } else listOf<Stadium>()
                onFavoriteMoviesReceived(values.filterNotNull())
            }
        })
    }

    override fun getAllStadionsOnce(userId: String, onFavoriteMoviesReceived: (List<Stadium>) -> Unit) {
        reference.child("stadiums").addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onCancelled(error: DatabaseError) {}

            override fun onDataChange(datasnapshot: DataSnapshot) {
                val values = if (datasnapshot.hasChildren()) datasnapshot.children.map { it.getValue(Stadium::class.java) } else listOf<Stadium>()
                onFavoriteMoviesReceived(values.filterNotNull())
            }
        })
    }

    override fun getUsers(onUsersRecieved: (List<User>) -> Unit) {
        reference.child("users").addListenerForSingleValueEvent(object : ValueEventListener{
            override fun onDataChange(data: DataSnapshot) {
                val values = if(data.hasChildren()) data.children.map { it.getValue(User::class.java) } else mutableListOf()
                onUsersRecieved(values.filterNotNull())
            }

            override fun onCancelled(error: DatabaseError) {}

        })
    }
}