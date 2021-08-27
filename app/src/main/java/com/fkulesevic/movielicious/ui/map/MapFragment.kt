package com.fkulesevic.movielicious.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.fkulesevic.movielicious.R
import com.fkulesevic.movielicious.data.model.Stadium
import com.fkulesevic.movielicious.mapPresenter
import com.fkulesevic.movielicious.presentation.MapPresenter
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapFragment : Fragment(), OnMapReadyCallback,
        MapView, GoogleMap.OnMarkerClickListener {

    private val presenter: MapPresenter by lazy { mapPresenter() }
    private var map: GoogleMap? = null


    companion object {
        fun newInstance(): MapFragment = MapFragment()
        private const val DEFAULT_LAT = 45.556299
        private const val DEFAULT_LNG = 18.688722
        private const val ZOOM_CAMERA_VALUE = 6.5f
        private const val ZOOM_CAMERA_VALUE_CLICKED = 10f
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.setBaseview(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_map, container, false)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.getStadiums();
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        googleMap?.setOnMarkerClickListener(this)
        googleMap?.run {
            map = this
            mapType = GoogleMap.MAP_TYPE_NORMAL
            uiSettings.isMapToolbarEnabled = false
            moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(DEFAULT_LAT, DEFAULT_LNG), ZOOM_CAMERA_VALUE))
        }
    }

    override fun onMarkerClick(marker: Marker): Boolean {
        map?.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(marker.position.latitude, marker.position.longitude), ZOOM_CAMERA_VALUE_CLICKED))
        Toast.makeText(this.activity, marker.title, Toast.LENGTH_SHORT).show()
        return true
    }

    override fun setPlacesToMap(places: List<Stadium>) = setToMap(places)

    private fun setToMap(places: List<Stadium>) = places.forEach { addMarker(it) }

    override fun addMarker(stadium: Stadium) {
        map?.run {
            val position = LatLng(stadium.lat.toDouble(), stadium.long.toDouble())
            this.addMarker(
                    MarkerOptions()
                            .position(position)
                            .title(stadium.name)
            )
        }
    }

    override fun setStadiums(stadiums: List<Stadium>) {
        this.setPlacesToMap(stadiums)
    }
}

