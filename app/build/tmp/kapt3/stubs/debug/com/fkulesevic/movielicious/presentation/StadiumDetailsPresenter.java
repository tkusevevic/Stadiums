package com.fkulesevic.movielicious.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/fkulesevic/movielicious/presentation/StadiumDetailsPresenter;", "Lcom/fkulesevic/movielicious/base/BasePresenter;", "Lcom/fkulesevic/movielicious/ui/stadium_details/DetailsView;", "onLikeTapped", "", "stadium", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "app_debug"})
public abstract interface StadiumDetailsPresenter extends com.fkulesevic.movielicious.base.BasePresenter<com.fkulesevic.movielicious.ui.stadium_details.DetailsView> {
    
    public abstract void onLikeTapped(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.Stadium stadium);
}