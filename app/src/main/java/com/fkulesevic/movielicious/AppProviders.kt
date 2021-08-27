package com.fkulesevic.movielicious

import com.fkulesevic.movielicious.presentation.*

fun topRatedPresenter(): TopRatedPresenter = App.appComponent.topRatedPresenter()

fun registrationPresenter(): RegistrationPresenter = App.appComponent.registrationPresenter()

fun signInPresenter(): SignInPresenter = App.appComponent.signInPresenter()

fun favoritesPresenter(): FavoritesPresenter = App.appComponent.favoritesPresenter()

fun movieDetailsPresenter(): StadiumDetailsPresenter = App.appComponent.movieDetailsPresenter()

fun splashPresenter(): SplashPresenter = App.appComponent.splashPresenter()

fun movieSearchPresenter(): StadiumSearchPresenter = App.appComponent.movieSearchPresenter()

fun mapPresenter(): MapPresenter = App.appComponent.mapPresenter()

