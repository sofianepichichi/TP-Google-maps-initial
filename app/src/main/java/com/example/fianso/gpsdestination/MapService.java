package com.example.fianso.gpsdestination;

import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class MapService implements OnMapReadyCallback , MapServiceInter{

   // DirectionFinderListener
    private GoogleMap mMap;
    private FusedLocationProviderClient mFusedLocationProviderClient;
    private final LatLng mDefaultLocation = new LatLng(50.609067, 3.138029);
    private boolean mLocationPermissionGranted;
    private static final int DEFAULT_ZOOM = 15;
    private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    private Location mLastKnownLocation;
    private LatLng problemLocation = new LatLng(0, 0);
    private AppCompatActivity context;

    private List<Marker> originMarkers = new ArrayList<>();
    private List<Marker> destinationMarkers = new ArrayList<>();
    private List<Polyline> polylinePaths = new ArrayList<>();
    private ProgressDialog progressDialog;


    /**
     * consterctor
     *
     * @param context
     */
    public MapService(AppCompatActivity context) {
        this.context = context;
    }

    //* * *  ETAPE  4  initialisation de la map  * * * * * * *

    // Initialisation de la map
   
   
   


    /**
     * onMapReady
     *
     * @param googleMap
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        getLocationPermission();
        mMap = googleMap;

        // * * * ETAPE  5  Afficher appele le service google map lors d'un click maintenu * * * * * *
		

    }



    @Override
    public void getLocationPermission() {
        // * * * ETAPE  6 récupérer les permission pour la localisation * * * * * *

  
    }


// * * * ETAPE  7 recevoir la réponse des permission obtenu* * * * * *

    @Override
    public void OnrequestPermission(){
                                
    }


    @Override
    public void updateLocationUI() {
// * * * ETAPE  8 mettre à jour la posistion de l'utulisateur* * * * * *

   
    }



    @Override
    public void getDeviceLocation() {

        // * * * ETAPE  9 récuperation de la position de l'appareil utilisateur* * * * * *

    }


    @Override
    public void cleanMap() {
        if (null != this.mMap)
            this.mMap.clear();
    }



// * * * ETAPE  10 Trouver le chemin entre deux adresse sur la map* * * * * *

// Trouver une direction entre deux adresses


  
  
  
  
        // * * * ETAPE  11 Récupérer les chemins obtenus* * * * * *

    

}