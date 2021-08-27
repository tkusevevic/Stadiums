package com.fkulesevic.movielicious.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0003H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/fkulesevic/movielicious/di/module/AppModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "firebaseReference", "Lcom/google/firebase/database/DatabaseReference;", "preferenceHelper", "Lcom/fkulesevic/movielicious/preferences/PreferencesHelper;", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideContext", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final android.content.Context context = null;
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.firebase.database.FirebaseDatabase firebaseDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.firebase.database.DatabaseReference firebaseReference(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.FirebaseDatabase firebaseDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.firebase.auth.FirebaseAuth firebaseAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.SharedPreferences sharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.fkulesevic.movielicious.preferences.PreferencesHelper preferenceHelper(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
}