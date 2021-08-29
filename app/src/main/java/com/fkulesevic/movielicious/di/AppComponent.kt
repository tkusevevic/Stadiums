package com.fkulesevic.movielicious.di

import com.fkulesevic.movielicious.App
import com.fkulesevic.movielicious.di.module.AppModule
import com.fkulesevic.movielicious.di.module.PresentationModule
import com.fkulesevic.movielicious.presentation.*
import dagger.Component

@Component(modules = [PresentationModule::class, AppModule::class])
interface AppComponent {

    fun inject(app: App)

    fun registrationPresenter(): RegistrationPresenter

    fun signInPresenter(): SignInPresenter

    fun allStadiumsPresenter(): AllStadiumsPresenter

    fun favoritesPresenter(): FavoritesPresenter

    fun stadiumDetailsPresenter(): StadiumDetailsPresenter

    fun splashPresenter(): SplashPresenter

    fun stadiumSearchPresenter(): StadiumSearchPresenter

    fun mapPresenter(): MapPresenter
}