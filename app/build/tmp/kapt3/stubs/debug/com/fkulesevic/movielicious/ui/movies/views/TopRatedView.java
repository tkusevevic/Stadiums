package com.fkulesevic.movielicious.ui.movies.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lcom/fkulesevic/movielicious/ui/movies/views/TopRatedView;", "", "addMovies", "", "stadiums", "", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "hideMessageEmptyList", "setFavorites", "favorites", "setMovies", "showMessageEmptyList", "app_debug"})
public abstract interface TopRatedView {
    
    public abstract void setMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> stadiums);
    
    public abstract void addMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> stadiums);
    
    public abstract void setFavorites(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> favorites);
    
    public abstract void showMessageEmptyList();
    
    public abstract void hideMessageEmptyList();
}