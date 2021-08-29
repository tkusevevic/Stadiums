package com.fkulesevic.movielicious.di.module

import com.fkulesevic.movielicious.presentation.*
import dagger.Binds
import dagger.Module

@Module(includes = arrayOf(AuthenticationModule::class))
abstract class PresentationModule {

    @Binds
    abstract fun registrationPresenter(registrationPresenterImpl: RegistrationPresenterImpl): RegistrationPresenter

    @Binds
    abstract fun signInPresenter(signInPresenterImpl: SignInPresenterImpl): SignInPresenter

    @Binds
    abstract fun topRatedPresenter(topRatedPresenterImpl: AllStadiumsPresenterImpl): AllStadiumsPresenter

    @Binds
    abstract fun favoritesPresenter(favoritesPresenterImpl: FavoritesPresenterImpl): FavoritesPresenter

    @Binds
    abstract fun movieDetailsPresenter(movieDetailsPresenterImpl: StadiumDetailsPresenterImpl): StadiumDetailsPresenter

    @Binds
    abstract fun splashPresenter(splashPresenterImpl: SplashPresenterImpl): SplashPresenter

    @Binds
    abstract fun searchPresenter(movieSearchPresenterImpl: StadiumSearchPresenterImpl): StadiumSearchPresenter

    @Binds
    abstract fun mapPresenter(mapPresenterImpl: MapPresetnerImpl): MapPresenter
}