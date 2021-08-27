package com.fkulesevic.movielicious.ui.movies.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/fkulesevic/movielicious/ui/movies/views/FavoritesView;", "", "hideMessageOnScreen", "", "setMovies", "stadiums", "", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "showMessageOnScreen", "app_debug"})
public abstract interface FavoritesView {
    
    public abstract void setMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> stadiums);
    
    public abstract void showMessageOnScreen();
    
    public abstract void hideMessageOnScreen();
}