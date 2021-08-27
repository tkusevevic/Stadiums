package com.fkulesevic.movielicious.ui.movies.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fkulesevic.movielicious.R
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.ui.listeners.OnMovieClickListener
import com.fkulesevic.movielicious.ui.movies.holder.StadiumViewHolder

class StadiumAdapter(private val listener: OnMovieClickListener) : RecyclerView.Adapter<StadiumViewHolder>() {

    private val stadiums: MutableList<Stadium> = mutableListOf()

    fun setMovies(list: List<Stadium>) {
        stadiums.clear()
        stadiums.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StadiumViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_movies, parent, false)
        return StadiumViewHolder(listener, view)
    }

    override fun onBindViewHolder(holder: StadiumViewHolder, position: Int) {
        val movie = stadiums[position]
        holder.run {
            setMovie(movie)
            listener.let { this }
        }
    }

    override fun getItemCount(): Int = stadiums.size

    fun setMovieLiked(id: String, isLiked: Boolean) {
        val movie = stadiums.find { it.id == id }

        movie?.run {
            this.isLiked = isLiked
            notifyItemChanged(stadiums.indexOf(this))
        }
    }
}