package com.amaricevic.stadiums.ui.stadiums.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amaricevic.stadiums.R
import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.ui.listeners.OnItemClickListener
import com.amaricevic.stadiums.ui.stadiums.holder.StadiumViewHolder

class AllStadiumsAdapter(private val listener: OnItemClickListener) :
    RecyclerView.Adapter<StadiumViewHolder>() {

    private val stadiums: MutableList<Stadium> = mutableListOf()

    // 0 for desceding, 1 for ascending
    private var sortType = 0

    fun setItems(list: List<Stadium>) {
        stadiums.clear()
        stadiums.addAll(list)
        notifyDataSetChanged()
    }

    fun addItems(stadiums: List<Stadium>) {
        this.stadiums.addAll(stadiums)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StadiumViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.holder_stadium, parent, false)
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

    fun setStadiumLiked(id: String, isLiked: Boolean) {
        val stadium = stadiums.find { it.id == id }
        stadium?.run {
            this.isLiked = isLiked
            notifyItemChanged(stadiums.indexOf(this))
        }
    }

    fun setFavorite(favorite: List<Stadium>) {
        val favoriteIds = favorite.map { it.id }
        stadiums.forEach { it.isLiked = it.id in favoriteIds }
        notifyDataSetChanged()
    }

    private fun sortByAsc() {
        this.sortType = 1
        stadiums.sortBy { it.capacity.replace(" ","").toInt() }
        notifyDataSetChanged()
    }

    private fun sortByDesc() {
        this.sortType = 0
        stadiums.sortByDescending { it.capacity.replace(" ","").toInt() }
        notifyDataSetChanged()
    }

    fun changeSort(): Int {
        return if(sortType == 0) {
            this.sortByAsc()
            sortType
        } else {
            this.sortByDesc()
            sortType
        }
    }
}