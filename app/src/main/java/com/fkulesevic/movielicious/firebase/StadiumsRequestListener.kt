package com.fkulesevic.movielicious.firebase

import com.fkulesevic.movielicious.data.model.Stadium

interface StadiumsRequestListener {

    fun onSuccessfulRequestMovies(stadiums: List<Stadium>)

    fun onFailedRequestMovies()
}