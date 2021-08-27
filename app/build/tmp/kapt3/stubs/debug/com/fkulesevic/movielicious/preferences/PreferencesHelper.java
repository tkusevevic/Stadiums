package com.fkulesevic.movielicious.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/fkulesevic/movielicious/preferences/PreferencesHelper;", "", "getId", "", "removeId", "", "saveId", "userId", "userIdExists", "", "app_debug"})
public abstract interface PreferencesHelper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getId();
    
    public abstract void removeId();
    
    public abstract void saveId(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    public abstract boolean userIdExists();
}