package com.fkulesevic.movielicious.firebase.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J*\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00060\u000eH\u0016J*\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00060\u000eH\u0016J$\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u000eH\u0016J\"\u0010\u0015\u001a\u00020\u00062\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n\u0012\u0004\u0012\u00020\u00060\u000eH\u0016J*\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00060\u000eH\u0016J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/fkulesevic/movielicious/firebase/database/DatabaseHelperImpl;", "Lcom/fkulesevic/movielicious/firebase/database/DatabaseHelper;", "reference", "Lcom/google/firebase/database/DatabaseReference;", "(Lcom/google/firebase/database/DatabaseReference;)V", "addFavorites", "", "userId", "", "stadiums", "", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "getAllStadionsOnce", "onFavoritesReceived", "Lkotlin/Function1;", "getFavoriteStadionsOnce", "onFavoriteReceived", "getUser", "id", "returningUser", "Lcom/fkulesevic/movielicious/data/model/User;", "getUsers", "onUsersRecieved", "listenToFavoriteStadiums", "onStadiumLiked", "stadium", "saveUser", "user", "app_debug"})
public final class DatabaseHelperImpl implements com.fkulesevic.movielicious.firebase.database.DatabaseHelper {
    private final com.google.firebase.database.DatabaseReference reference = null;
    
    @javax.inject.Inject()
    public DatabaseHelperImpl(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseReference reference) {
        super();
    }
    
    @java.lang.Override()
    public void saveUser(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.User user) {
    }
    
    @java.lang.Override()
    public void getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fkulesevic.movielicious.data.model.User, kotlin.Unit> returningUser) {
    }
    
    @java.lang.Override()
    public void addFavorites(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> stadiums) {
    }
    
    @java.lang.Override()
    public void onStadiumLiked(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.Stadium stadium) {
    }
    
    @java.lang.Override()
    public void listenToFavoriteStadiums(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fkulesevic.movielicious.data.model.Stadium>, kotlin.Unit> onFavoriteReceived) {
    }
    
    @java.lang.Override()
    public void getFavoriteStadionsOnce(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fkulesevic.movielicious.data.model.Stadium>, kotlin.Unit> onFavoriteReceived) {
    }
    
    @java.lang.Override()
    public void getAllStadionsOnce(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fkulesevic.movielicious.data.model.Stadium>, kotlin.Unit> onFavoritesReceived) {
    }
    
    @java.lang.Override()
    public void getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fkulesevic.movielicious.data.model.User>, kotlin.Unit> onUsersRecieved) {
    }
}