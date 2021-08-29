package com.amaricevic.stadiums.preferences

interface PreferencesHelper {

    fun getId() : String

    fun removeId()

    fun saveId(userId: String)

    fun userIdExists() : Boolean
}