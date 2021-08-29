package com.fkulesevic.movielicious.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/fkulesevic/movielicious/presentation/FavoritesPresenterImpl;", "Lcom/fkulesevic/movielicious/presentation/FavoritesPresenter;", "Lcom/fkulesevic/movielicious/firebase/StadiumsRequestListener;", "authenticationHelper", "Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelper;", "database", "Lcom/fkulesevic/movielicious/firebase/database/DatabaseHelper;", "(Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelper;Lcom/fkulesevic/movielicious/firebase/database/DatabaseHelper;)V", "favoritesView", "Lcom/fkulesevic/movielicious/ui/stadiums/views/FavoritesView;", "getFavorites", "", "onFailedRequest", "onLikeTapped", "stadium", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "onSuccessfulRequest", "stadiums", "", "setBaseview", "baseView", "app_debug"})
public final class FavoritesPresenterImpl implements com.fkulesevic.movielicious.presentation.FavoritesPresenter, com.fkulesevic.movielicious.firebase.StadiumsRequestListener {
    private final com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper authenticationHelper = null;
    private final com.fkulesevic.movielicious.firebase.database.DatabaseHelper database = null;
    private com.fkulesevic.movielicious.ui.stadiums.views.FavoritesView favoritesView;
    
    @javax.inject.Inject()
    public FavoritesPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper authenticationHelper, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.database.DatabaseHelper database) {
        super();
    }
    
    @java.lang.Override()
    public void setBaseview(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.ui.stadiums.views.FavoritesView baseView) {
    }
    
    @java.lang.Override()
    public void getFavorites() {
    }
    
    @java.lang.Override()
    public void onSuccessfulRequest(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> stadiums) {
    }
    
    @java.lang.Override()
    public void onFailedRequest() {
    }
    
    @java.lang.Override()
    public void onLikeTapped(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.Stadium stadium) {
    }
}