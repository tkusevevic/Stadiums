package com.fkulesevic.movielicious.ui.signIn;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\"\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\""}, d2 = {"Lcom/fkulesevic/movielicious/ui/signIn/SignInActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/fkulesevic/movielicious/ui/signIn/SignInView;", "()V", "presenter", "Lcom/fkulesevic/movielicious/presentation/SignInPresenter;", "getPresenter", "()Lcom/fkulesevic/movielicious/presentation/SignInPresenter;", "presenter$delegate", "Lkotlin/Lazy;", "hideEmailError", "", "hidePasswordError", "hideProgressAndShowOther", "initListeners", "initPresenter", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showEmailError", "showMessage", "message", "", "showPasswordError", "showProgressAndHideOther", "startMoviesActivity", "user", "Lcom/fkulesevic/movielicious/data/model/User;", "app_debug"})
public final class SignInActivity extends androidx.appcompat.app.AppCompatActivity implements com.fkulesevic.movielicious.ui.signIn.SignInView {
    private final kotlin.Lazy presenter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public SignInActivity() {
        super();
    }
    
    private final com.fkulesevic.movielicious.presentation.SignInPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void initPresenter() {
    }
    
    private final void initListeners() {
    }
    
    @java.lang.Override()
    public void hidePasswordError() {
    }
    
    @java.lang.Override()
    public void hideEmailError() {
    }
    
    @java.lang.Override()
    public void showPasswordError() {
    }
    
    @java.lang.Override()
    public void showEmailError() {
    }
    
    @java.lang.Override()
    public void showProgressAndHideOther() {
    }
    
    @java.lang.Override()
    public void hideProgressAndShowOther() {
    }
    
    @java.lang.Override()
    public void startMoviesActivity(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.User user) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
}