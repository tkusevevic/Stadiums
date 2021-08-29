package com.fkulesevic.movielicious.ui.listeners

import com.fkulesevic.movielicious.data.model.Stadium

interface OnItemClickListener {

    fun onStadiumClick(stadium: Stadium)

    fun onLikeClick(stadium: Stadium)
}