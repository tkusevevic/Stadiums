package com.amaricevic.stadiums.di.module

import com.amaricevic.stadiums.firebase.authentication.AuthenticationHelper
import com.amaricevic.stadiums.firebase.authentication.AuthenticationHelperImpl
import dagger.Binds
import dagger.Module

@Module(includes = arrayOf(DatabaseModule::class))
abstract class AuthenticationModule {

    @Binds
    abstract fun authenticationHelper(authenticationHelperImpl: AuthenticationHelperImpl): AuthenticationHelper
}