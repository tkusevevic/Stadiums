package com.fkulesevic.movielicious.ui.stadium_details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fkulesevic.movielicious.R
import com.fkulesevic.movielicious.commons.constants.STADIUM_KEY
import com.fkulesevic.movielicious.commons.extensions.onClick
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.stadiumDetailsPresenter
import com.fkulesevic.movielicious.presentation.StadiumDetailsPresenter
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details.*
import java.io.Serializable

class StadiumDetailsActivity : AppCompatActivity(), DetailsView {

    private val presenter: StadiumDetailsPresenter by lazy { stadiumDetailsPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        initPresenter()
        getDetails()
        initListeners()
    }

    private fun initListeners() {
        backDetails.onClick { finish() }
        likeStadiumDetails.onClick {
            val intent = this.intent
            val bundle: Bundle? = intent.extras
            val stadium: Serializable? = bundle?.getSerializable(STADIUM_KEY)
            presenter.onLikeTapped(stadium as Stadium)
        }
    }

    private fun initPresenter() = presenter.setBaseview(this)

    private fun getDetails() {
        val intent = this.intent
        val bundle: Bundle? = intent.extras
        val stadium: Serializable? = bundle?.getSerializable(STADIUM_KEY)
        showData(stadium as Stadium)
    }

    override fun showData(stadium: Stadium) {
        Picasso.get()
                .load(stadium.imageUrl)
                .resize(180, 180)
                .centerCrop()
                .into(imageDetails)

        if (stadium.isLiked) {
            likeStadiumDetails.setImageResource(R.drawable.like_red_fill)
        } else {
            likeStadiumDetails.setImageResource(R.drawable.like_red)
        }
        capacityStadiumDetails.text = String.format("Capacity: " + stadium.capacity)
        cityStaidumDetails.text = String.format("City: " + stadium.city)
        titleStadiumDetails.text = String.format("Name: " + stadium.name)
        descriptionStadiumDetails.text = stadium.description
    }

    override fun setLike(isLiked: Boolean) {
        if (isLiked) likeStadiumDetails.setImageResource(R.drawable.like_red_fill)
        else likeStadiumDetails.setImageResource(R.drawable.like_red)
    }
}