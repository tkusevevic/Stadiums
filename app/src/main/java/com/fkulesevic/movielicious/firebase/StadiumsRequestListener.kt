package com.fkulesevic.movielicious.firebase

import com.fkulesevic.movielicious.data.model.Stadium

interface StadiumsRequestListener {

    fun onSuccessfulRequest(stadiums: List<Stadium>)

    fun onFailedRequest()
}