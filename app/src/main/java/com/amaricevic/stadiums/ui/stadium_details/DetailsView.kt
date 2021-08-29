package com.amaricevic.stadiums.ui.stadium_details

import com.amaricevic.stadiums.data.model.Stadium

interface DetailsView {

    fun showData(stadium: Stadium)

    fun setLike(isLiked: Boolean)
}