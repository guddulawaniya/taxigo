package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class settings_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        LinearLayout profile = findViewById(R.id.profilelinear);
        LinearLayout favoritelinear = findViewById(R.id.favoritelinear);
        LinearLayout preferencelinear = findViewById(R.id.preferencelinear);
        LinearLayout languagelinear = findViewById(R.id.languagelinear);
        LinearLayout aboutlinear = findViewById(R.id.aboutlinear);
        LinearLayout betalinear = findViewById(R.id.betalinear);
        LinearLayout logoutlinear = findViewById(R.id.logoutlinear);

        TextView support = findViewById(R.id.supportsetting);

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Redirect_support_Activity.class));
            }
        });

        ImageView backbutton = findViewById(R.id.settingbackbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), profile_Activity.class));
            }
        });


    }
}