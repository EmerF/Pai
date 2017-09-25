package br.com.proximojogo.pai;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        LatLng marilandia = new LatLng(-23.743, -51.3142);
        LatLng ivaipora = new LatLng(-24.249 ,-51.6759 );
        LatLng ariranha = new LatLng(-24.377, -51.5983);
        LatLng londrina = new LatLng(-23.2927, -51.1732);
        LatLng curitiba = new LatLng(-25.4284, -49.2733 );
        LatLng colombo = new LatLng(-25.293 ,-49.2266);
        LatLng garuva = new LatLng(-26.0266, -48.8551);
        LatLng antonina = new LatLng(-25.4328, -48.7162);
        LatLng brasilia = new LatLng(-15.7801, -47.9292);


        mMap.addMarker(new MarkerOptions().position(marilandia).title("Aqui ele nasceu, mas o nome era Araruva! Fizeram o homem e jogaram a forma fora"));
        mMap.addMarker(new MarkerOptions().position(londrina).title("Em Londrina nasceu um grande vendedor..."));
        mMap.addMarker(new MarkerOptions().position(ariranha).title("No Ariranha se divertia com os brother!"));
        mMap.addMarker(new MarkerOptions().position(ivaipora).title("No Alto do Ivaí casou-se e nasceu o Frango!"));
        mMap.addMarker(new MarkerOptions().position(curitiba).title("Na vila São Pedro conheceu a feiura de Curitiba"));
        mMap.addMarker(new MarkerOptions().position(colombo).title("No São Sebastiao morou no OUTRO NÃO e nasceu seu filho mais bonito: Célio kkk.."));
        mMap.addMarker(new MarkerOptions().position(antonina).title("Onde ele se desliga do mundo e recarrega as baterias!!"));
        mMap.addMarker(new MarkerOptions().position(garuva).title("Aqui virou pescador profissional, ficou famoso e foi para no Facebook!!!"));
        mMap.addMarker(new MarkerOptions().position(brasilia).title("Pai, muito obrigado por tudo. Só cheguei tão longe inspirado em você. Te amo!!"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marilandia));

    }
}
