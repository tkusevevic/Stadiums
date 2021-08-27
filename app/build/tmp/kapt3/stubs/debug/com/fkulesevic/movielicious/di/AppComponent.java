package com.fkulesevic.movielicious.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&\u00a8\u0006\u0016"}, d2 = {"Lcom/fkulesevic/movielicious/di/AppComponent;", "", "favoritesPresenter", "Lcom/fkulesevic/movielicious/presentation/FavoritesPresenter;", "inject", "", "app", "Lcom/fkulesevic/movielicious/App;", "mapPresenter", "Lcom/fkulesevic/movielicious/presentation/MapPresenter;", "movieDetailsPresenter", "Lcom/fkulesevic/movielicious/presentation/StadiumDetailsPresenter;", "movieSearchPresenter", "Lcom/fkulesevic/movielicious/presentation/StadiumSearchPresenter;", "registrationPresenter", "Lcom/fkulesevic/movielicious/presentation/RegistrationPresenter;", "signInPresenter", "Lcom/fkulesevic/movielicious/presentation/SignInPresenter;", "splashPresenter", "Lcom/fkulesevic/movielicious/presentation/SplashPresenter;", "topRatedPresenter", "Lcom/fkulesevic/movielicious/presentation/TopRatedPresenter;", "app_debug"})
@dagger.Component(modules = {com.fkulesevic.movielicious.di.module.PresentationModule.class, com.fkulesevic.movielicious.di.module.AppModule.class})
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.App app);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fkulesevic.movielicious.presentation.RegistrationPresenter registrationPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fkulesevic.movielicious.presentation.SignInPresenter signInPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fkulesevic.movielicious.presentation.TopRatedPresenter topRatedPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fkulesevic.movielicious.presentation.FavoritesPresenter favoritesPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fkulesevic.movielicious.presentation.StadiumDetailsPresenter movieDetailsPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fkulesevic.movielicious.presentation.SplashPresenter splashPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fkulesevic.movielicious.presentation.StadiumSearchPresenter movieSearchPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fkulesevic.movielicious.presentation.MapPresenter mapPresenter();
}