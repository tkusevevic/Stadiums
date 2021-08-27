package com.fkulesevic.movielicious.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/fkulesevic/movielicious/presentation/StadiumDetailsPresenterImpl;", "Lcom/fkulesevic/movielicious/presentation/StadiumDetailsPresenter;", "authenticationHelper", "Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelper;", "databaseHelper", "Lcom/fkulesevic/movielicious/firebase/database/DatabaseHelper;", "(Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelper;Lcom/fkulesevic/movielicious/firebase/database/DatabaseHelper;)V", "movieDetailsView", "Lcom/fkulesevic/movielicious/ui/movie_details/MovieDetailsView;", "onLikeTapped", "", "stadium", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "setBaseview", "baseView", "app_debug"})
public final class StadiumDetailsPresenterImpl implements com.fkulesevic.movielicious.presentation.StadiumDetailsPresenter {
    private final com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper authenticationHelper = null;
    private final com.fkulesevic.movielicious.firebase.database.DatabaseHelper databaseHelper = null;
    private com.fkulesevic.movielicious.ui.movie_details.MovieDetailsView movieDetailsView;
    
    @javax.inject.Inject()
    public StadiumDetailsPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper authenticationHelper, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.database.DatabaseHelper databaseHelper) {
        super();
    }
    
    @java.lang.Override()
    public void setBaseview(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.ui.movie_details.MovieDetailsView baseView) {
    }
    
    @java.lang.Override()
    public void onLikeTapped(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.Stadium stadium) {
    }
}