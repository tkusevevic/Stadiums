package com.fkulesevic.movielicious.ui.stadiums.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fkulesevic.movielicious.R
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.ui.listeners.OnItemClickListener
import com.fkulesevic.movielicious.ui.stadiums.holder.StadiumViewHolder

class StadiumAdapter(private val listener: OnItemClickListener) : RecyclerView.Adapter<StadiumViewHolder>() {

    private val stadiums: MutableList<Stadium> = mutableListOf()

    fun setList(list: List<Stadium>) {
        stadiums.clear()
        stadiums.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StadiumViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_stadium, parent, false)
        return StadiumViewHolder(listener, view)
    }

    override fun onBindViewHolder(holder: StadiumViewHolder, position: Int) {
        val stadium = stadiums[position]
        holder.run {
            setItem(stadium)
            listener.let { this }
        }
    }

    override fun getItemCount(): Int = stadiums.size

    fun setLiked(id: String, isLiked: Boolean) {
        val stadium = stadiums.find { it.id == id }

        stadium?.run {
            this.isLiked = isLiked
            notifyItemChanged(stadiums.indexOf(this))
        }
    }
}