package com.amaricevic.stadiums.base

interface BasePresenter<in T> {

    fun setBaseview(baseView: T)
}