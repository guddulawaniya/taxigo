package com.example.taxigo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class settings_Activity extends AppCompatActivity {

    TextView langNamehint;
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
        langNamehint = findViewById(R.id.langNamehint);
        setlangHint();
        logoutlinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        aboutlinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), About_Activity.class));
            }
        });
        languagelinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Languages_Activity.class));
            }
        });
        preferencelinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), preference_activity.class));
            }
        });
        favoritelinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), favorites_Activity.class));

            }
        });


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


    void setlangHint()
    {
        SharedPreferences preferences = getSharedPreferences("settings",MODE_PRIVATE);

        switch (preferences.getString("LANGUAGE_KEY",null))
        {
            case "en":langNamehint.setText("English");
            break;
            case "hi":langNamehint.setText("हिन्दी (hindi)");
            break;
            case "kn":langNamehint.setText("मराठी (Marathi)");
            break;
            case "mr":langNamehint.setText("ಕನ್ನಡ (kannada)");
            break;
            case "te":langNamehint.setText("ೆಲುಗು (Telugu)");
            break;
            case "ta":langNamehint.setText("हತಮಿಳು (Tamil)");
            break;
        }
    }
}