package com.fkulesevic.movielicious.ui.movies.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/fkulesevic/movielicious/ui/movies/adapter/StadiumAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/fkulesevic/movielicious/ui/movies/holder/StadiumViewHolder;", "listener", "Lcom/fkulesevic/movielicious/ui/listeners/OnMovieClickListener;", "(Lcom/fkulesevic/movielicious/ui/listeners/OnMovieClickListener;)V", "stadiums", "", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMovieLiked", "id", "", "isLiked", "", "setMovies", "list", "", "app_debug"})
public final class StadiumAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.fkulesevic.movielicious.ui.movies.holder.StadiumViewHolder> {
    private final com.fkulesevic.movielicious.ui.listeners.OnMovieClickListener listener = null;
    private final java.util.List<com.fkulesevic.movielicious.data.model.Stadium> stadiums = null;
    
    public StadiumAdapter(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.ui.listeners.OnMovieClickListener listener) {
        super();
    }
    
    public final void setMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.fkulesevic.movielicious.ui.movies.holder.StadiumViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.ui.movies.holder.StadiumViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setMovieLiked(@org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean isLiked) {
    }
}