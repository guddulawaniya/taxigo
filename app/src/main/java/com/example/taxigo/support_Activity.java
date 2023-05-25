package com.example.taxigo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class support_Activity extends AppCompatActivity {

    CardView safety,payment,ride,referral,account,power,services;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        ImageView supportback = findViewById(R.id.supportbackbutton);
        TextView viewallride = findViewById(R.id.viewallride);
        TextView viewalltickets = findViewById(R.id.viewalltickets);
        TextView searchissuebar = findViewById(R.id.searchissuebar);
        TextView gethelptext = findViewById(R.id.gethelptext);

        safety = findViewById(R.id.safety);
        payment = findViewById(R.id.payments);
        ride = findViewById(R.id.ridebilling);
        referral = findViewById(R.id.referrals);
        account = findViewById(R.id.accountapp);
        power = findViewById(R.id.powerpass);
        services = findViewById(R.id.services);
        safety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startactivity(1);
            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startactivity(2);
            }
        });
        ride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startactivity(3);
            }
        });
        referral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startactivity(4);
            }
        });
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startactivity(5);
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startactivity(6);
            }
        });
        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startactivity(7);
            }
        });

        gethelptext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.rapido.bike/";


                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        searchissuebar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), search_issue_activity.class));
            }
        });


        viewalltickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Ticket_Activity.class));
            }
        });
        viewallride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),select_an_order_Activity.class));
            }
        });
        supportback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    void startactivity(int id )
    {
        Intent intent = new Intent(getApplicationContext(), Redirect_support_Activity.class);
        intent.putExtra("id",id);
        startActivity(intent);
    }
}