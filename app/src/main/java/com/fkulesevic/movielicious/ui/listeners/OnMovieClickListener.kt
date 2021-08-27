package com.fkulesevic.movielicious.ui.listeners

import com.fkulesevic.movielicious.data.model.Stadium

interface OnMovieClickListener {

    fun onMovieClick(stadium: Stadium)

    fun onLikeClick(stadium: Stadium)
}