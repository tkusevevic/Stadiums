package com.amaricevic.stadiums.ui.stadiums.pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.amaricevic.stadiums.commons.constants.ALL_STADIUMS
import com.amaricevic.stadiums.commons.constants.FAVORITES
import com.amaricevic.stadiums.commons.constants.MAP
import com.amaricevic.stadiums.commons.constants.SEARCH

class CustomPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    private val fragments: MutableList<Fragment> = mutableListOf()

    fun addFragment(fragment: Fragment) {
        fragments.add(fragment)
        notifyDataSetChanged()
    }

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int = fragments.size

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> ALL_STADIUMS
            1 -> FAVORITES
            2 -> MAP
            else -> null
        }
    }
}