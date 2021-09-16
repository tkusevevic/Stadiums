package com.amaricevic.stadiums.ui.stadiums.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.amaricevic.stadiums.R
import com.amaricevic.stadiums.commons.extensions.onClick
import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.ui.listeners.OnItemClickListener
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.holder_stadium.view.*

class StadiumViewHolder(private val listener: OnItemClickListener, itemView: View) :
    RecyclerView.ViewHolder(itemView) {


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