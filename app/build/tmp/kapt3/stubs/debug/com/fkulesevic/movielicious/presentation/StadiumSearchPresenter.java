package com.fkulesevic.movielicious.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0004H&\u00a8\u0006\r"}, d2 = {"Lcom/fkulesevic/movielicious/presentation/StadiumSearchPresenter;", "Lcom/fkulesevic/movielicious/base/BasePresenter;", "Lcom/fkulesevic/movielicious/ui/search_movie/SearchMovieView;", "clearList", "", "getFavorites", "getMovies", "input", "", "onLikeTapped", "stadium", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "setAllStadiums", "app_debug"})
public abstract interface StadiumSearchPresenter extends com.fkulesevic.movielicious.base.BasePresenter<com.fkulesevic.movielicious.ui.search_movie.SearchMovieView> {
    
    public abstract void getMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String input);
    
    public abstract void setAllStadiums();
    
    public abstract void onLikeTapped(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.Stadium stadium);
    
    public abstract void getFavorites();
    
    public abstract void clearList();
}