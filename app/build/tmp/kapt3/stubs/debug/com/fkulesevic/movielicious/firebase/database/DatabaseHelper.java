package com.fkulesevic.movielicious.firebase.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J*\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u00030\u000bH&J*\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u00030\u000bH&J$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u000bH&J\"\u0010\u0012\u001a\u00020\u00032\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0007\u0012\u0004\u0012\u00020\u00030\u000bH&J*\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u00030\u000bH&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\bH&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0011H&\u00a8\u0006\u0019"}, d2 = {"Lcom/fkulesevic/movielicious/firebase/database/DatabaseHelper;", "", "addFavorites", "", "userId", "", "stadiums", "", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "getAllStadionsOnce", "onFavoritesReceived", "Lkotlin/Function1;", "getFavoriteStadionsOnce", "onFavoriteReceived", "getUser", "id", "returningUser", "Lcom/fkulesevic/movielicious/data/model/User;", "getUsers", "onUsersRecieved", "listenToFavoriteStadiums", "onStadiumLiked", "stadium", "saveUser", "user", "app_debug"})
public abstract interface DatabaseHelper {
    
    public abstract void saveUser(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.User user);
    
    public abstract void getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fkulesevic.movielicious.data.model.User, kotlin.Unit> returningUser);
    
    public abstract void onStadiumLiked(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.Stadium stadium);
    
    public abstract void listenToFavoriteStadiums(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fkulesevic.movielicious.data.model.Stadium>, kotlin.Unit> onFavoriteReceived);
    
    public abstract void getFavoriteStadionsOnce(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fkulesevic.movielicious.data.model.Stadium>, kotlin.Unit> onFavoriteReceived);
    
    public abstract void getAllStadionsOnce(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fkulesevic.movielicious.data.model.Stadium>, kotlin.Unit> onFavoritesReceived);
    
    public abstract void addFavorites(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> stadiums);
    
    public abstract void getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fkulesevic.movielicious.data.model.User>, kotlin.Unit> onUsersRecieved);
}