package com.fkulesevic.movielicious.ui.movie_details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fkulesevic.movielicious.R
import com.fkulesevic.movielicious.commons.constants.STADIUM_KEY
import com.fkulesevic.movielicious.commons.extensions.onClick
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.movieDetailsPresenter
import com.fkulesevic.movielicious.presentation.StadiumDetailsPresenter
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_details.*
import java.io.Serializable

class MovieDetailsActivity : AppCompatActivity(), MovieDetailsView {

    private val presenter: StadiumDetailsPresenter by lazy { movieDetailsPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        initPresenter()
        getMoviesInformation()
        initListeners()
    }

    private fun initListeners() {
        backDetails.onClick { finish() }
        likeMovieDetails.onClick {
            val intent = this.intent
            val bundle: Bundle? = intent.extras
            val movie: Serializable? = bundle?.getSerializable(STADIUM_KEY)
            presenter.onLikeTapped(movie as Stadium)
        }
    }

    private fun initPresenter() = presenter.setBaseview(this)

    private fun getMoviesInformation() {
        val intent = this.intent
        val bundle: Bundle? = intent.extras
        val movie: Serializable? = bundle?.getSerializable(STADIUM_KEY)
        showData(movie as Stadium)
    }

    override fun showData(stadium: Stadium) {
        Picasso.get()
                .load(stadium.imageUrl)
                .resize(180, 180)
                .centerCrop()
                .into(imageMovieDetails)

        if (stadium.isLiked) {
            likeMovieDetails.setImageResource(R.drawable.like_red_fill)
        } else {
            likeMovieDetails.setImageResource(R.drawable.like_red)
        }
        capacityStadiumDetails.text = String.format("Capacity: " + stadium.capacity)
        cityStaidumDetails.text = String.format("City: " + stadium.city)
        titleStadiumDetails.text = String.format("Name: " + stadium.name)
        descriptionStadiumDetails.text = stadium.description
    }

    override fun setLike(isLiked: Boolean) {
        if (isLiked) likeMovieDetails.setImageResource(R.drawable.like_red_fill)
        else likeMovieDetails.setImageResource(R.drawable.like_red)
    }
}