package com.amaricevic.stadiums.ui.stadium_details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amaricevic.stadiums.App
import com.amaricevic.stadiums.R
import com.amaricevic.stadiums.commons.constants.STADIUM_KEY
import com.amaricevic.stadiums.commons.extensions.onClick
import com.amaricevic.stadiums.data.model.Stadium
import com.amaricevic.stadiums.firebase.authentication.AuthenticationHelperImpl
import com.amaricevic.stadiums.firebase.database.DatabaseHelperImpl
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details.*
import java.io.Serializable

class StadiumDetailsActivity : AppCompatActivity(), DetailsView {

    private val auth: AuthenticationHelperImpl by lazy {
        AuthenticationHelperImpl(
            App.auth,
            DatabaseHelperImpl(App.database)
        )
    }

    private val database: DatabaseHelperImpl by lazy {
        DatabaseHelperImpl(App.database)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        getDetails()
        initListeners()
    }

    private fun initListeners() {
        backDetails.onClick { finish() }
        likeStadiumDetails.onClick {
            val intent = this.intent
            val bundle: Bundle? = intent.extras
            val stadium: Serializable? = bundle?.getSerializable(STADIUM_KEY)
            this.onLikeTapped(stadium as Stadium)
        }
    }

    // logic functions
    private fun onLikeTapped(stadium: Stadium) {
        stadium.isLiked = !stadium.isLiked
        auth.getCurrentUser()?.uid?.run {
            database.onStadiumLiked(this, stadium)
        }
        this.setLike(stadium.isLiked)
    }

    private fun getDetails() {
        val intent = this.intent
        val bundle: Bundle? = intent.extras
        val stadium: Serializable? = bundle?.getSerializable(STADIUM_KEY)
        showData(stadium as Stadium)
    }

    // view functions
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