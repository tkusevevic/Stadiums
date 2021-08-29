package com.amaricevic.stadiums.ui.stadiums

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amaricevic.stadiums.R
import com.amaricevic.stadiums.ui.map.MapFragment
import com.amaricevic.stadiums.ui.stadiums.pager.CustomPagerAdapter
import com.amaricevic.stadiums.ui.search_movie.SearchFragment
import kotlinx.android.synthetic.main.activity_stadiums.*

class StadiumsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stadiums)
        initAdapter()
        initListeners()
    }

    private fun initAdapter() {
        val navigationPagerAdapter = CustomPagerAdapter(supportFragmentManager)
        navigationPagerAdapter.addFragment(AllStadiumsFragment())
        navigationPagerAdapter.addFragment(SearchFragment())
        navigationPagerAdapter.addFragment(FavoritesFragment())
        navigationPagerAdapter.addFragment(MapFragment())

        viewPager.adapter = navigationPagerAdapter
        viewPager.offscreenPageLimit = 4

    }

    private fun initListeners() {
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_all_stadiums -> viewPager.currentItem = 0
                R.id.action_search -> viewPager.currentItem = 1
                R.id.action_favorites -> viewPager.currentItem = 2
                R.id.action_map -> viewPager.currentItem = 3
            }
            true
        }
    }
}