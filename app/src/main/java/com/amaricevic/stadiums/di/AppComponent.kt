package com.amaricevic.stadiums.di

import com.amaricevic.stadiums.App
import com.amaricevic.stadiums.di.module.AppModule
import com.amaricevic.stadiums.di.module.PresentationModule
import com.amaricevic.stadiums.presentation.*
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