package com.fkulesevic.movielicious.ui.stadium_details

import com.fkulesevic.movielicious.data.model.Stadium

interface DetailsView {

    fun showData(stadium: Stadium)

    fun setLike(isLiked: Boolean)
}