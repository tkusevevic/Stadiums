package com.fkulesevic.movielicious.ui.signIn;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/fkulesevic/movielicious/ui/signIn/SignInView;", "", "hideEmailError", "", "hidePasswordError", "hideProgressAndShowOther", "showEmailError", "showMessage", "message", "", "showPasswordError", "showProgressAndHideOther", "startMoviesActivity", "user", "Lcom/fkulesevic/movielicious/data/model/User;", "app_debug"})
public abstract interface SignInView {
    
    public abstract void showEmailError();
    
    public abstract void showPasswordError();
    
    public abstract void hideEmailError();
    
    public abstract void hidePasswordError();
    
    public abstract void showProgressAndHideOther();
    
    public abstract void hideProgressAndShowOther();
    
    public abstract void startMoviesActivity(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.User user);
    
    public abstract void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
}