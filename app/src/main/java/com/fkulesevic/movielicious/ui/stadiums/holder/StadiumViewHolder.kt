package com.fkulesevic.movielicious.ui.stadiums.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.fkulesevic.movielicious.R
import com.fkulesevic.movielicious.commons.extensions.onClick
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.ui.listeners.OnItemClickListener
import kotlinx.android.synthetic.main.holder_stadium.view.*

class StadiumViewHolder(private val listener: OnItemClickListener, itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun setItem(stadium: Stadium) = with(itemView) {
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
        onClick { listener.onStadiumClick(stadium) }
        like.onClick { listener.onLikeClick(stadium) }
    }
}