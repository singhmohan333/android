package com.example.mohan.asmtech;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng p1 = new LatLng(28.449289699999998, 77.05928300000005);
        mMap.addMarker(new MarkerOptions().position(p1).title("My Place"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(p1));

        LatLng p2 = new LatLng(28.258592, 77.459488);
        mMap.addMarker(new MarkerOptions().position(p2).title("home"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(p2));

        LatLng p3 = new LatLng(28.263913, 77.457712);
        mMap.addMarker(new MarkerOptions().position(p3).title("Site 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(p3));


        LatLng p4 = new LatLng(28.255647, 77.464424);
        mMap.addMarker(new MarkerOptions().position(p4).title("Village"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(p4));

        LatLng p5 = new LatLng(28.324677, 77.346239);
        mMap.addMarker(new MarkerOptions().position(p5).title("Faridabad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(p5));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(p2, 12.0f));


    }
}
