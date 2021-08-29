package com.amaricevic.stadiums.firebase

import com.amaricevic.stadiums.data.model.Stadium

interface StadiumsRequestListener {

    fun onSuccessfulRequest(stadiums: List<Stadium>)

    fun onFailedRequest()
}