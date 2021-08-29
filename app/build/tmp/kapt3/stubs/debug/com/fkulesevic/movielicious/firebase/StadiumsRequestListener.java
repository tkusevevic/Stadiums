package com.fkulesevic.movielicious.firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/fkulesevic/movielicious/firebase/StadiumsRequestListener;", "", "onFailedRequest", "", "onSuccessfulRequest", "stadiums", "", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "app_debug"})
public abstract interface StadiumsRequestListener {
    
    public abstract void onSuccessfulRequest(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> stadiums);
    
    public abstract void onFailedRequest();
}