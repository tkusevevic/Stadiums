package com.fkulesevic.movielicious.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\'J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\'\u00a8\u0006#"}, d2 = {"Lcom/fkulesevic/movielicious/di/module/PresentationModule;", "", "()V", "favoritesPresenter", "Lcom/fkulesevic/movielicious/presentation/FavoritesPresenter;", "favoritesPresenterImpl", "Lcom/fkulesevic/movielicious/presentation/FavoritesPresenterImpl;", "mapPresenter", "Lcom/fkulesevic/movielicious/presentation/MapPresenter;", "mapPresenterImpl", "Lcom/fkulesevic/movielicious/presentation/MapPresetnerImpl;", "movieDetailsPresenter", "Lcom/fkulesevic/movielicious/presentation/StadiumDetailsPresenter;", "movieDetailsPresenterImpl", "Lcom/fkulesevic/movielicious/presentation/StadiumDetailsPresenterImpl;", "registrationPresenter", "Lcom/fkulesevic/movielicious/presentation/RegistrationPresenter;", "registrationPresenterImpl", "Lcom/fkulesevic/movielicious/presentation/RegistrationPresenterImpl;", "searchPresenter", "Lcom/fkulesevic/movielicious/presentation/StadiumSearchPresenter;", "movieSearchPresenterImpl", "Lcom/fkulesevic/movielicious/presentation/StadiumSearchPresenterImpl;", "signInPresenter", "Lcom/fkulesevic/movielicious/presentation/SignInPresenter;", "signInPresenterImpl", "Lcom/fkulesevic/movielicious/presentation/SignInPresenterImpl;", "splashPresenter", "Lcom/fkulesevic/movielicious/presentation/SplashPresenter;", "splashPresenterImpl", "Lcom/fkulesevic/movielicious/presentation/SplashPresenterImpl;", "topRatedPresenter", "Lcom/fkulesevic/movielicious/presentation/AllStadiumsPresenter;", "topRatedPresenterImpl", "Lcom/fkulesevic/movielicious/presentation/AllStadiumsPresenterImpl;", "app_debug"})
@dagger.Module(includes = {com.fkulesevic.movielicious.di.module.AuthenticationModule.class})
public abstract class PresentationModule {
    
    public PresentationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.fkulesevic.movielicious.presentation.RegistrationPresenter registrationPresenter(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.presentation.RegistrationPresenterImpl registrationPresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.fkulesevic.movielicious.presentation.SignInPresenter signInPresenter(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.presentation.SignInPresenterImpl signInPresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.fkulesevic.movielicious.presentation.AllStadiumsPresenter topRatedPresenter(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.presentation.AllStadiumsPresenterImpl topRatedPresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.fkulesevic.movielicious.presentation.FavoritesPresenter favoritesPresenter(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.presentation.FavoritesPresenterImpl favoritesPresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.fkulesevic.movielicious.presentation.StadiumDetailsPresenter movieDetailsPresenter(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.presentation.StadiumDetailsPresenterImpl movieDetailsPresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.fkulesevic.movielicious.presentation.SplashPresenter splashPresenter(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.presentation.SplashPresenterImpl splashPresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.fkulesevic.movielicious.presentation.StadiumSearchPresenter searchPresenter(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.presentation.StadiumSearchPresenterImpl movieSearchPresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.fkulesevic.movielicious.presentation.MapPresenter mapPresenter(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.presentation.MapPresetnerImpl mapPresenterImpl);
}