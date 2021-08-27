package com.fkulesevic.movielicious.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010#\u001a\u00020\u000f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0016J\u0016\u0010&\u001a\u00020\u000f2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0016J\u0016\u0010(\u001a\u00020\u000f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006*"}, d2 = {"Lcom/fkulesevic/movielicious/ui/map/MapFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/fkulesevic/movielicious/ui/map/MapView;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "map", "Lcom/google/android/gms/maps/GoogleMap;", "presenter", "Lcom/fkulesevic/movielicious/presentation/MapPresenter;", "getPresenter", "()Lcom/fkulesevic/movielicious/presentation/MapPresenter;", "presenter$delegate", "Lkotlin/Lazy;", "addMarker", "", "stadium", "Lcom/fkulesevic/movielicious/data/model/Stadium;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMapReady", "googleMap", "onMarkerClick", "", "marker", "Lcom/google/android/gms/maps/model/Marker;", "onViewCreated", "view", "setPlacesToMap", "places", "", "setStadiums", "stadiums", "setToMap", "Companion", "app_debug"})
public final class MapFragment extends androidx.fragment.app.Fragment implements com.google.android.gms.maps.OnMapReadyCallback, com.fkulesevic.movielicious.ui.map.MapView, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    private final kotlin.Lazy presenter$delegate = null;
    private com.google.android.gms.maps.GoogleMap map;
    @org.jetbrains.annotations.NotNull()
    public static final com.fkulesevic.movielicious.ui.map.MapFragment.Companion Companion = null;
    private static final double DEFAULT_LAT = 45.556299;
    private static final double DEFAULT_LNG = 18.688722;
    private static final float ZOOM_CAMERA_VALUE = 6.5F;
    private static final float ZOOM_CAMERA_VALUE_CLICKED = 10.0F;
    private java.util.HashMap _$_findViewCache;
    
    public MapFragment() {
        super();
    }
    
    private final com.fkulesevic.movielicious.presentation.MapPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker marker) {
        return false;
    }
    
    @java.lang.Override()
    public void setPlacesToMap(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> places) {
    }
    
    private final void setToMap(java.util.List<com.fkulesevic.movielicious.data.model.Stadium> places) {
    }
    
    @java.lang.Override()
    public void addMarker(@org.jetbrains.annotations.NotNull()
    com.fkulesevic.movielicious.data.model.Stadium stadium) {
    }
    
    @java.lang.Override()
    public void setStadiums(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fkulesevic.movielicious.data.model.Stadium> stadiums) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/fkulesevic/movielicious/ui/map/MapFragment$Companion;", "", "()V", "DEFAULT_LAT", "", "DEFAULT_LNG", "ZOOM_CAMERA_VALUE", "", "ZOOM_CAMERA_VALUE_CLICKED", "newInstance", "Lcom/fkulesevic/movielicious/ui/map/MapFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fkulesevic.movielicious.ui.map.MapFragment newInstance() {
            return null;
        }
    }
}