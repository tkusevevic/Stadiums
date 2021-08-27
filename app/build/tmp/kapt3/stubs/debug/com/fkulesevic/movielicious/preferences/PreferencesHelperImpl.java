package com.fkulesevic.movielicious.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/fkulesevic/movielicious/preferences/PreferencesHelperImpl;", "Lcom/fkulesevic/movielicious/preferences/PreferencesHelper;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getId", "", "removeId", "", "saveId", "userId", "userIdExists", "", "app_debug"})
public final class PreferencesHelperImpl implements com.fkulesevic.movielicious.preferences.PreferencesHelper {
    private final android.content.SharedPreferences preferences = null;
    
    @javax.inject.Inject()
    public PreferencesHelperImpl(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    @java.lang.Override()
    public void removeId() {
    }
    
    @java.lang.Override()
    public void saveId(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    @java.lang.Override()
    public boolean userIdExists() {
        return false;
    }
}