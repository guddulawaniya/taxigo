package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
        ConstraintLayout profileActivity = findViewById(R.id.profile);
        ImageView earnmoney = findViewById(R.id.earnmoney_arrow);

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






        CardView startdestination = findViewById(R.id.startaddress);
        CardView enddestination = findViewById(R.id.destination);
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




        ArrayList<modelclass> droplist = new ArrayList<>();

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