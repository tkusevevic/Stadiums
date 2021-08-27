package com.fkulesevic.movielicious.ui.movie_details

import com.fkulesevic.movielicious.data.model.Stadium

interface MovieDetailsView {

    fun showData(stadium: Stadium)

    fun setLike(isLiked: Boolean)
}