package com.fkulesevic.movielicious.ui.listeners;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/fkulesevic/movielicious/ui/listeners/OnMovieClickListener;", "", "onLikeClick", "", "stadium", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "onMovieClick", "app_debug"})
public abstract interface OnMovieClickListener {
    
    public abstract void onMovieClick(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.Stadium stadium);
    
    public abstract void onLikeClick(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.Stadium stadium);
}