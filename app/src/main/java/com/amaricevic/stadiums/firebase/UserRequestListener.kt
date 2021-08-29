package com.amaricevic.stadiums.firebase

import com.amaricevic.stadiums.data.model.User

interface UserRequestListener {

    fun onSuccessfulRequest(user: User)

    fun onFailedRequest()
}