package com.fkulesevic.movielicious;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/fkulesevic/movielicious/App;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final com.fkulesevic.movielicious.App.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy appComponent$delegate = null;
    public static com.fkulesevic.movielicious.App instance;
    
    public App() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/fkulesevic/movielicious/App$Companion;", "", "()V", "appComponent", "Lcom/fkulesevic/movielicious/di/AppComponent;", "getAppComponent", "()Lcom/fkulesevic/movielicious/di/AppComponent;", "appComponent$delegate", "Lkotlin/Lazy;", "instance", "Lcom/fkulesevic/movielicious/App;", "getInstance$app_debug", "()Lcom/fkulesevic/movielicious/App;", "setInstance$app_debug", "(Lcom/fkulesevic/movielicious/App;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fkulesevic.movielicious.di.AppComponent getAppComponent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fkulesevic.movielicious.App getInstance$app_debug() {
            return null;
        }
        
        public final void setInstance$app_debug(@org.jetbrains.annotations.NotNull()
        com.fkulesevic.movielicious.App p0) {
        }
    }
}