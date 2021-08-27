package com.fkulesevic.movielicious.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&\u00a8\u0006\t"}, d2 = {"Lcom/fkulesevic/movielicious/presentation/RegistrationPresenter;", "Lcom/fkulesevic/movielicious/base/BasePresenter;", "Lcom/fkulesevic/movielicious/ui/registration/RegistrationView;", "onRegistrationClick", "", "email", "", "password", "name", "app_debug"})
public abstract interface RegistrationPresenter extends com.fkulesevic.movielicious.base.BasePresenter<com.fkulesevic.movielicious.ui.registration.RegistrationView> {
    
    public abstract void onRegistrationClick(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String name);
}