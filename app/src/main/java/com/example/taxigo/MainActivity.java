package com.example.taxigo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.taxigo.Adapters.dropAdapter;
import com.example.taxigo.Adapters.searching_location_Adapter;
import com.example.taxigo.ModuleClasses.modelclass;
import com.example.taxigo.side_profile_activites.Local_send_items_activity;
import com.example.taxigo.side_profile_activites.Notification_Activity;
import com.example.taxigo.side_profile_activites.Payment_Activity;
import com.example.taxigo.side_profile_activites.claim_activity;
import com.example.taxigo.side_profile_activites.complete_profile_Activity;
import com.example.taxigo.side_profile_activites.myreward_Activity;
import com.example.taxigo.side_profile_activites.myride_Activity;
import com.example.taxigo.side_profile_activites.powerpass_Activity;
import com.example.taxigo.side_profile_activites.profile_Activity;
import com.example.taxigo.side_profile_activites.referearn_Activity;
import com.example.taxigo.side_profile_activites.ridewin_Activity;
import com.example.taxigo.side_profile_activites.settings_Activity;
import com.example.taxigo.side_profile_activites.support_Activity;
import com.example.taxigo.side_profile_activites.taxigocoin_Activity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        LinearLayout settings = findViewById(R.id.settings);
        LinearLayout support = findViewById(R.id.support);
        LinearLayout completeprofile = findViewById(R.id.completeprofile);
        LinearLayout profile = findViewById(R.id.profile);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, profile_Activity.class));
            }
        });

        CardView startdestination = findViewById(R.id.startaddress);
        CardView enddestination = findViewById(R.id.destination);

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
        enddestination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Search_Activity.class));
            }
        });




        ArrayList<modelclass> droplist = new ArrayList<>();


        searching_location_Adapter sadapter = new searching_location_Adapter(droplist,this);
        droplist.add(new modelclass("Meridean Overseas Education Consultants","Vaishali Marg, Ganga Sagar-B,Nemi Nagar Exaxhange"));
        droplist.add(new modelclass("Jaipur","Rajsthan,India"));
        droplist.add(new modelclass("Sitapur","Jaipur Rajasthan,India"));
        droplist.add(new modelclass("Jaipur Junction ","Station Road ,Gopalbari,Jaipur,Rajasthan,India"));
        RecyclerView dropreyclerview = findViewById(R.id.dropreyclerview);
        dropAdapter adapter = new dropAdapter(droplist,this);

        dropreyclerview.setLayoutManager(new LinearLayoutManager(this));
        dropreyclerview.setAdapter(adapter);


        localsenditems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Local_send_items_activity.class));


            }
        });
        ridewin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ridewin_Activity.class));


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
                startActivity(new Intent(MainActivity.this, myride_Activity.class));
            }
        });
        referearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, referearn_Activity.class));
            }
        });
        myreward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, myreward_Activity.class));
            }
        });
        taxigocoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, taxigocoin_Activity.class));
            }
        });
        powerpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, powerpass_Activity.class));

            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Notification_Activity.class));
            }
        });
        claim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, claim_activity.class));
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, settings_Activity.class));
            }
        });
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, support_Activity.class));
            }
        });


        CardView menubutton = findViewById(R.id.menubutton);
        DrawerLayout drawerLayout = findViewById(R.id.drawer);
        menubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

    }
}