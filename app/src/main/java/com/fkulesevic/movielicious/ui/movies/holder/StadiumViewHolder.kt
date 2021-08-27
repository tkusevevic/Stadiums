package com.fkulesevic.movielicious.ui.movies.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.fkulesevic.movielicious.R
import com.fkulesevic.movielicious.commons.extensions.onClick
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.ui.listeners.OnMovieClickListener
import kotlinx.android.synthetic.main.holder_movies.view.*

class StadiumViewHolder(private val listener: OnMovieClickListener, itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun setMovie(stadium: Stadium) = with(itemView) {
        if (stadium.isLiked) {
            like.setImageResource(R.drawable.like_red_fill)
        } else {
            like.setImageResource(R.drawable.like_red)
        }
        Picasso.get()
                .load(stadium.imageUrl)
                .resize(720, 720)
                .centerCrop()
                .into(image)
        title.text = stadium.name
        city.text = String.format("City: %s", stadium.city)
        capacity.text = String.format("Capacity: %s", stadium.capacity)
        onClick { listener.onMovieClick(stadium) }
        like.onClick { listener.onLikeClick(stadium) }
    }
}