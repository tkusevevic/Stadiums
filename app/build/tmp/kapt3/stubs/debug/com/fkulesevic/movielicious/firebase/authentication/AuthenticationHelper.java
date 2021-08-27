package com.fkulesevic.movielicious.firebase.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000fH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0005H&J \u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000fH&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0005H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u000fH&\u00a8\u0006\u001a"}, d2 = {"Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelper;", "", "attemptToRegisterTheUser", "", "email", "", "password", "name", "listener", "Lcom/fkulesevic/movielicious/firebase/EmptyRequestListener;", "checkIfUserIsLoggedIn", "", "editUser", "user", "Lcom/fkulesevic/movielicious/data/model/User;", "Lcom/fkulesevic/movielicious/firebase/UserRequestListener;", "getCurrentUser", "Lcom/google/firebase/auth/FirebaseUser;", "getCurrentUserId", "logTheUserIn", "logTheUserOut", "setUserDisplayName", "username", "signInWithFacebook", "credential", "Lcom/google/firebase/auth/AuthCredential;", "app_debug"})
public abstract interface AuthenticationHelper {
    
    public abstract void logTheUserIn(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.UserRequestListener listener);
    
    public abstract void attemptToRegisterTheUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.EmptyRequestListener listener);
    
    public abstract void setUserDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    public abstract void logTheUserOut();
    
    public abstract boolean checkIfUserIsLoggedIn();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getCurrentUserId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.google.firebase.auth.FirebaseUser getCurrentUser();
    
    public abstract void editUser(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.User user, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.UserRequestListener listener);
    
    public abstract void signInWithFacebook(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.AuthCredential credential, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.UserRequestListener listener);
}