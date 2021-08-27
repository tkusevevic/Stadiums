package com.fkulesevic.movielicious.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0002J\u0016\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/fkulesevic/movielicious/presentation/StadiumSearchPresenterImpl;", "Lcom/fkulesevic/movielicious/presentation/StadiumSearchPresenter;", "Lcom/fkulesevic/movielicious/firebase/StadiumsRequestListener;", "authenticationHelper", "Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelper;", "databaseHelper", "Lcom/fkulesevic/movielicious/firebase/database/DatabaseHelper;", "(Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelper;Lcom/fkulesevic/movielicious/firebase/database/DatabaseHelper;)V", "view", "Lcom/fkulesevic/movielicious/ui/search_movie/SearchMovieView;", "clearList", "", "getFavorites", "getMovies", "input", "", "onFailedRequestMovies", "onLikeTapped", "stadium", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "onMoviesReceived", "list", "", "onSuccessfulRequestMovies", "stadiums", "setAllStadiums", "setBaseview", "baseView", "app_debug"})
public final class StadiumSearchPresenterImpl implements com.fkulesevic.movielicious.presentation.StadiumSearchPresenter, com.fkulesevic.movielicious.firebase.StadiumsRequestListener {
    private final com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper authenticationHelper = null;
    private final com.fkulesevic.movielicious.firebase.database.DatabaseHelper databaseHelper = null;
    private com.fkulesevic.movielicious.ui.search_movie.SearchMovieView view;
    
    @javax.inject.Inject()
    public StadiumSearchPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper authenticationHelper, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.database.DatabaseHelper databaseHelper) {
        super();
    }
    
    @java.lang.Override()
    public void setBaseview(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.ui.search_movie.SearchMovieView baseView) {
    }
    
    @java.lang.Override()
    public void getMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
    }
    
    @java.lang.Override()
    public void setAllStadiums() {
    }
    
    private final void onMoviesReceived(java.util.List<com.fkulesevic.movielicious.data.model.Stadium> list) {
    }
    
    @java.lang.Override()
    public void onSuccessfulRequestMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> stadiums) {
    }
    
    @java.lang.Override()
    public void onFailedRequestMovies() {
    }
    
    @java.lang.Override()
    public void clearList() {
    }
    
    @java.lang.Override()
    public void onLikeTapped(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.Stadium stadium) {
    }
    
    @java.lang.Override()
    public void getFavorites() {
    }
}