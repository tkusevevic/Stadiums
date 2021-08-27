package com.fkulesevic.movielicious.data.model

import java.io.Serializable

class Stadium(
        val id: String = "0",
        val city: String = "",
        val capacity: String = "",
        var isLiked: Boolean = false,
        var description: String = "",
        var imageUrl: String = "",
        var long: String = "",
        var lat: String = "",
        var name: String = ""
) : Serializable