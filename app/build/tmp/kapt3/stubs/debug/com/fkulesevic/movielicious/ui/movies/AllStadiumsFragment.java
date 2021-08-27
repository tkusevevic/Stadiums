package com.fkulesevic.movielicious.ui.movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0014H\u0016J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0014H\u0016J\u001a\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0016\u0010&\u001a\u00020\u00112\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0016\u0010(\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010)\u001a\u00020\u0011H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e\u00a8\u0006*"}, d2 = {"Lcom/fkulesevic/movielicious/ui/movies/AllStadiumsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/fkulesevic/movielicious/ui/listeners/OnMovieClickListener;", "Lcom/fkulesevic/movielicious/ui/movies/views/TopRatedView;", "()V", "adapter", "Lcom/fkulesevic/movielicious/ui/movies/adapter/AllStadiumsAdapter;", "getAdapter", "()Lcom/fkulesevic/movielicious/ui/movies/adapter/AllStadiumsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "presenter", "Lcom/fkulesevic/movielicious/presentation/TopRatedPresenter;", "getPresenter", "()Lcom/fkulesevic/movielicious/presentation/TopRatedPresenter;", "presenter$delegate", "addMovies", "", "stadiums", "", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "hideMessageEmptyList", "initRecyclerView", "loadFavorites", "loadTopRatedMovies", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onLikeClick", "stadium", "onMovieClick", "onViewCreated", "view", "setFavorites", "favorites", "setMovies", "showMessageEmptyList", "app_debug"})
public final class AllStadiumsFragment extends androidx.fragment.app.Fragment implements com.fkulesevic.movielicious.ui.listeners.OnMovieClickListener, com.fkulesevic.movielicious.ui.movies.views.TopRatedView {
    private final kotlin.Lazy presenter$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public AllStadiumsFragment() {
        super();
    }
    
    private final com.fkulesevic.movielicious.presentation.TopRatedPresenter getPresenter() {
        return null;
    }
    
    private final com.fkulesevic.movielicious.ui.movies.adapter.AllStadiumsAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void loadFavorites() {
    }
    
    private final void loadTopRatedMovies() {
    }
    
    @java.lang.Override()
    public void onMovieClick(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.Stadium stadium) {
    }
    
    @java.lang.Override()
    public void onLikeClick(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.Stadium stadium) {
    }
    
    @java.lang.Override()
    public void addMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> stadiums) {
    }
    
    @java.lang.Override()
    public void setMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> stadiums) {
    }
    
    @java.lang.Override()
    public void setFavorites(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> favorites) {
    }
    
    @java.lang.Override()
    public void showMessageEmptyList() {
    }
    
    @java.lang.Override()
    public void hideMessageEmptyList() {
    }
}