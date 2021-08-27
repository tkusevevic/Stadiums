package com.fkulesevic.movielicious.firebase.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0014H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0016J \u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelperImpl;", "Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelper;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "databaseHelper", "Lcom/fkulesevic/movielicious/firebase/database/DatabaseHelper;", "(Lcom/google/firebase/auth/FirebaseAuth;Lcom/fkulesevic/movielicious/firebase/database/DatabaseHelper;)V", "attemptToRegisterTheUser", "", "email", "", "password", "name", "listener", "Lcom/fkulesevic/movielicious/firebase/EmptyRequestListener;", "checkIfUserIsLoggedIn", "", "editUser", "user", "Lcom/fkulesevic/movielicious/data/model/User;", "Lcom/fkulesevic/movielicious/firebase/UserRequestListener;", "getCurrentUser", "Lcom/google/firebase/auth/FirebaseUser;", "getCurrentUserId", "logTheUserIn", "logTheUserOut", "setUserDisplayName", "username", "signInWithFacebook", "credential", "Lcom/google/firebase/auth/AuthCredential;", "app_debug"})
public final class AuthenticationHelperImpl implements com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper {
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    private final com.fkulesevic.movielicious.firebase.database.DatabaseHelper databaseHelper = null;
    
    @javax.inject.Inject()
    public AuthenticationHelperImpl(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth firebaseAuth, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.database.DatabaseHelper databaseHelper) {
        super();
    }
    
    @java.lang.Override()
    public void editUser(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.User user, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.UserRequestListener listener) {
    }
    
    @java.lang.Override()
    public void attemptToRegisterTheUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.EmptyRequestListener listener) {
    }
    
    @java.lang.Override()
    public void logTheUserIn(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.UserRequestListener listener) {
    }
    
    @java.lang.Override()
    public void setUserDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    @java.lang.Override()
    public void signInWithFacebook(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.AuthCredential credential, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.UserRequestListener listener) {
    }
    
    @java.lang.Override()
    public void logTheUserOut() {
    }
    
    @java.lang.Override()
    public boolean checkIfUserIsLoggedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getCurrentUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.firebase.auth.FirebaseUser getCurrentUser() {
        return null;
    }
}