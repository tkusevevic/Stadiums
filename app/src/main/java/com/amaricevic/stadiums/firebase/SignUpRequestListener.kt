package com.amaricevic.stadiums.firebase

import com.amaricevic.stadiums.data.model.User

interface SignUpRequestListener {

    fun onSuccessfulRequest(user: User)

    fun onFailedRequest()
}