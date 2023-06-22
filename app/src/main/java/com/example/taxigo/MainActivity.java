package com.example.taxigo;

import android.Manifest;
import android.Manifest.permission;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;



public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    Location currentLocation ;
    FusedLocationProviderClient fusedLocationProviderClient;
    private static final int REQUEST_CODE = 101;
    ArrayList<modelclass> droplist;
    RecyclerView dropreyclerview;
    TextView startaddresstext;
    ImageView startaddress_favorate_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        loadlang();

        startaddress_favorate_icon = findViewById(R.id.startaddress_favorate_icon);
        LinearLayout localsenditems = findViewById(R.id.localsend);
        LinearLayout ridewin = findViewById(R.id.ridewin);
        LinearLayout payment = findViewById(R.id.payment);
        LinearLayout myride = findViewById(R.id.myrides);
        LinearLayout referearn = findViewById(R.id.referearn);
        LinearLayout myreward = findViewById(R.id.rewards);
        LinearLayout taxigocoin = findViewById(R.id.taxigocoin);
        LinearLayout powerpass = findViewById(R.id.powerpass);
        LinearLayout notification = findViewById(R.id.notification);
        LinearLayout claim = findViewById(R.id.claim);
        RelativeLayout starlayout = findViewById(R.id.rating);
        LinearLayout settings = findViewById(R.id.settings);
        LinearLayout support = findViewById(R.id.support);
        LinearLayout completeprofile = findViewById(R.id.completeprofile);
        ConstraintLayout profileActivity = findViewById(R.id.profile);
        ImageView earnmoney = findViewById(R.id.earnmoney_arrow);
        CardView getcurrentlocation = findViewById(R.id.getcurrentlocation);
        CardView startdestination = findViewById(R.id.startaddress);
        CardView enddestination = findViewById(R.id.destination);
        CardView menubutton = findViewById(R.id.menubutton);
        DrawerLayout drawerLayout = findViewById(R.id.drawer);
        startaddresstext = findViewById(R.id.startaddresstext);
        startaddresstext.setText("Your Current Loaction");



        starlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Rating_activity.class));
            }
        });



        fetchLocation();
        getcurrentlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchLocation();

            }
        });


        startaddress_favorate_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectapp_bottom_sheet sheet = new selectapp_bottom_sheet();
                sheet.show(getSupportFragmentManager(),"bottom");



            }
        });





        droplist = new ArrayList<>();

//        droplist.add(new modelclass("Meridean Overseas Education Consultants","Vaishali Marg, Ganga Sagar-B,Nemi Nagar Exaxhange"));
//        droplist.add(new modelclass("Jaipur","Rajsthan,India"));
//        droplist.add(new modelclass("Sitapur","Jaipur Rajasthan,India"));
//        droplist.add(new modelclass("Jaipur Junction ","Station Road ,Gopalbari,Jaipur,Rajasthan,India"));
        dropreyclerview  = findViewById(R.id.dropreyclerview);


        profileActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, profile_Activity.class));
            }
        });
        completeprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, complete_profile_Activity.class));
            }
        });

        startdestination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Search_Activity.class));
            }
        });
        earnmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Earn_money.class));
            }
        });
        enddestination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Search_Activity.class));
            }
        });

        localsenditems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Local_send_items_activity.class));


            }
        });
        ridewin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ridewin_Activity.class));


            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Payment_Activity.class));

            }
        });
        myride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,myride_Activity.class));
            }
        });
        referearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,referearn_Activity.class));
            }
        });
        myreward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,myreward_Activity.class));
            }
        });
        taxigocoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,taxigocoin_Activity.class));
            }
        });
        powerpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,powerpass_Activity.class));

            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Notification_Activity.class));
            }
        });
        claim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,claim_activity.class));
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,settings_Activity.class));
            }
        });
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,support_Activity.class));
            }
        });



        menubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

    }





    private void fetchLocation()
    {
        if (ContextCompat.checkSelfPermission(this, permission.ACCESS_FINE_LOCATION)!=PackageManager.PERMISSION_GRANTED &&
        ContextCompat.checkSelfPermission(this, permission.ACCESS_COARSE_LOCATION)!=PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this,new String[]{permission.ACCESS_FINE_LOCATION},REQUEST_CODE);
            return;
        }
        Task<Location> task =fusedLocationProviderClient.getLastLocation();
        task.addOnSuccessListener(new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if (location != null) {
                    Geocoder gc = new Geocoder(MainActivity.this,Locale.getDefault());


                    List<Address> addresses = null;
                    try {
                        addresses = gc.getFromLocation(location.getLatitude(),location.getLongitude(),1);

                        startaddresstext.setText(addresses.get(0).getAddressLine(0));
                        SharedPreferences.Editor editor = getSharedPreferences("location",MODE_PRIVATE).edit();
                        editor.putString("add",addresses.get(0).getAddressLine(0));
                        editor.commit();

                        droplist.add(new modelclass(addresses.get(0).getAddressLine(0),addresses.get(0).getLocality()));

                        dropAdapter adapter = new  dropAdapter(droplist,MainActivity.this);


                        dropreyclerview.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        dropreyclerview.setAdapter(adapter);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }


                    currentLocation = location;
                    Toast.makeText(getApplicationContext(),"You are Here", Toast.LENGTH_SHORT).show();
                    SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
                    assert supportMapFragment != null;
                    supportMapFragment.getMapAsync(MainActivity.this);
                }
            }
        });
    }


    void loadlang()
    {
        SharedPreferences preferences = getSharedPreferences("settings", MODE_PRIVATE);
        String ln = preferences.getString("LANGUAGE_KEY",null);
        setLocale(ln);
    }
    void setLocale(String language)
    {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        getBaseContext().getResources().updateConfiguration(configuration,getBaseContext().getResources().getDisplayMetrics());
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng latLng = new LatLng(currentLocation.getLatitude(),currentLocation.getLongitude());

        MarkerOptions markerOptions = new MarkerOptions().position(latLng).title("I am here!");
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 16f));
        googleMap.addMarker(markerOptions);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode==REQUEST_CODE) {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    fetchLocation();

                }
                else
                {
                    Toast.makeText(this, "Required Permissions", Toast.LENGTH_SHORT).show();
                }
        }
    }


}