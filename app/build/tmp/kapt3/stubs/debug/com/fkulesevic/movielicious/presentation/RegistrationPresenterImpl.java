package com.fkulesevic.movielicious.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0016J \u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J \u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/fkulesevic/movielicious/presentation/RegistrationPresenterImpl;", "Lcom/fkulesevic/movielicious/presentation/RegistrationPresenter;", "Lcom/fkulesevic/movielicious/firebase/EmptyRequestListener;", "authenticationHelper", "Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelper;", "(Lcom/fkulesevic/movielicious/firebase/authentication/AuthenticationHelper;)V", "regView", "Lcom/fkulesevic/movielicious/ui/registration/RegistrationView;", "chechInputEmpty", "", "email", "", "password", "name", "onFailedRequest", "onRegistrationClick", "onSuccessfulRequest", "setBaseview", "baseView", "tryToRegister", "app_debug"})
public final class RegistrationPresenterImpl implements com.fkulesevic.movielicious.presentation.RegistrationPresenter, com.fkulesevic.movielicious.firebase.EmptyRequestListener {
    private final com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper authenticationHelper = null;
    private com.fkulesevic.movielicious.ui.registration.RegistrationView regView;
    
    @javax.inject.Inject()
    public RegistrationPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.firebase.authentication.AuthenticationHelper authenticationHelper) {
        super();
    }
    
    @java.lang.Override()
    public void setBaseview(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.ui.registration.RegistrationView baseView) {
    }
    
    @java.lang.Override()
    public void onRegistrationClick(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    private final void chechInputEmpty(java.lang.String email, java.lang.String password, java.lang.String name) {
    }
    
    private final void tryToRegister(java.lang.String email, java.lang.String password, java.lang.String name) {
    }
    
    @java.lang.Override()
    public void onSuccessfulRequest() {
    }
    
    @java.lang.Override()
    public void onFailedRequest() {
    }
}