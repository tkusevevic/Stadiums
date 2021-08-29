package com.amaricevic.stadiums.di.module

import com.amaricevic.stadiums.firebase.database.DatabaseHelper
import com.amaricevic.stadiums.firebase.database.DatabaseHelperImpl
import dagger.Binds
import dagger.Module

@Module
abstract class DatabaseModule {

    @Binds
    abstract fun firebaseDatabase(databaseHelperImpl: DatabaseHelperImpl): DatabaseHelper
}