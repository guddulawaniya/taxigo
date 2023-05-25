package com.example.taxigo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class select_language extends AppCompatActivity {

    SharedPreferences preferences;
    CardView en,hi,mr,te,ta,kn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);
         en= findViewById(R.id.englishlang);
         hi = findViewById(R.id.hindi);
         mr = findViewById(R.id.marathilang);
         te = findViewById(R.id.telugulang);
         ta = findViewById(R.id.tamillang);
         kn = findViewById(R.id.kannadalang);
         preferences = getSharedPreferences("settings", MODE_PRIVATE);



        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changecolor(en,"en");

            }
        });
        hi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changecolor(hi,"hi");

            }
        });
        mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changecolor(mr,"mr");

            }
        });   ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changecolor(ta,"ta");

            }
        });   te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changecolor(te,"te");

            }
        });   kn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changecolor(kn,"kn");

            }
        });

    }

    void changecolor(CardView card,String lang)
    {
        card.setCardBackgroundColor(Color.YELLOW);
        SharedPreferences.Editor editor = getSharedPreferences("settings",MODE_PRIVATE).edit();
        editor.putString("LANGUAGE_KEY",lang);
        editor.commit();
        editor.apply();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();


    }

    @Override
    protected void onStart() {
       String value = preferences.getString("LANGUAGE_KEY","");

        if (value!="")
        {
             startActivity(new Intent(getApplicationContext(), MainActivity.class));
             finish();
        }
        super.onStart();

    }
}