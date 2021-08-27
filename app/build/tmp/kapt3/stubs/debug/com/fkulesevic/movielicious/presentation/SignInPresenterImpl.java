package com.fkulesevic.movielicious.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/fkulesevic/movielicious/presentation/SignInPresenterImpl;", "Lcom/fkulesevic/movielicious/presentation/SignInPresenter;", "Lcom/fkulesevic/movielicious/firebase/UserRequestListener;", "authenticationHelper", "Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelper;", "preferencesHelper", "Lcom/fkulesevic/movielicious/preferences/PreferencesHelper;", "(Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelper;Lcom/fkulesevic/movielicious/preferences/PreferencesHelper;)V", "signView", "Lcom/fkulesevic/movielicious/ui/signIn/SignInView;", "checkInputEmpty", "", "email", "", "password", "onFailedRequest", "onSignInClick", "onSuccessfulRequest", "user", "Lcom/fkulesevic/movielicious/data/model/User;", "setBaseview", "baseView", "tryToSignIn", "app_debug"})
public final class SignInPresenterImpl implements com.fkulesevic.movielicious.presentation.SignInPresenter, com.fkulesevic.movielicious.firebase.UserRequestListener {
    private final com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper authenticationHelper = null;
    private final com.fkulesevic.movielicious.preferences.PreferencesHelper preferencesHelper = null;
    private com.fkulesevic.movielicious.ui.signIn.SignInView signView;
    
    @javax.inject.Inject()
    public SignInPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper authenticationHelper, @org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.preferences.PreferencesHelper preferencesHelper) {
        super();
    }
    
    @java.lang.Override()
    public void setBaseview(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.ui.signIn.SignInView baseView) {
    }
    
    @java.lang.Override()
    public void onSignInClick(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    private final void tryToSignIn(java.lang.String email, java.lang.String password) {
    }
    
    private final void checkInputEmpty(java.lang.String email, java.lang.String password) {
    }
    
    @java.lang.Override()
    public void onSuccessfulRequest(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.User user) {
    }
    
    @java.lang.Override()
    public void onFailedRequest() {
    }
}