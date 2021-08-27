package com.fkulesevic.movielicious.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/fkulesevic/movielicious/presentation/SplashPresenterImpl;", "Lcom/fkulesevic/movielicious/presentation/SplashPresenter;", "preferencesHelper", "Lcom/fkulesevic/movielicious/preferences/PreferencesHelper;", "(Lcom/fkulesevic/movielicious/preferences/PreferencesHelper;)V", "splashView", "Lcom/fkulesevic/movielicious/ui/splash/SplashView;", "checkPrefs", "", "setBaseview", "baseView", "app_debug"})
public final class SplashPresenterImpl implements com.fkulesevic.movielicious.presentation.SplashPresenter {
    private final com.fkulesevic.movielicious.preferences.PreferencesHelper preferencesHelper = null;
    private com.fkulesevic.movielicious.ui.splash.SplashView splashView;
    
    @javax.inject.Inject()
    public SplashPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.preferences.PreferencesHelper preferencesHelper) {
        super();
    }
    
    @java.lang.Override()
    public void setBaseview(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.ui.splash.SplashView baseView) {
    }
    
    @java.lang.Override()
    public void checkPrefs() {
    }
}