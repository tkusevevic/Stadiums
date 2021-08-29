package com.amaricevic.stadiums.ui.listeners

import com.amaricevic.stadiums.data.model.Stadium

interface OnItemClickListener {

    fun onStadiumClick(stadium: Stadium)

    fun onLikeClick(stadium: Stadium)
}