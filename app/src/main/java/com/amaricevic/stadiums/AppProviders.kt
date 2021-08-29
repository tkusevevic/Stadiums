package com.amaricevic.stadiums

import com.amaricevic.stadiums.presentation.*

fun topRatedPresenter(): AllStadiumsPresenter = App.appComponent.allStadiumsPresenter()

fun registrationPresenter(): RegistrationPresenter = App.appComponent.registrationPresenter()

fun signInPresenter(): SignInPresenter = App.appComponent.signInPresenter()

fun favoritesPresenter(): FavoritesPresenter = App.appComponent.favoritesPresenter()

fun stadiumDetailsPresenter(): StadiumDetailsPresenter = App.appComponent.stadiumDetailsPresenter()

fun splashPresenter(): SplashPresenter = App.appComponent.splashPresenter()

fun searchPresenter(): StadiumSearchPresenter = App.appComponent.stadiumSearchPresenter()

fun mapPresenter(): MapPresenter = App.appComponent.mapPresenter()

