package com.example.taxigo;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Languages_Activity extends AppCompatActivity {

    TextView english,hindi,telugu,marathi,kannada,tamil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);
        ImageView backbutton = findViewById(R.id.completeprofileback);

        english = findViewById(R.id.english);
        hindi = findViewById(R.id.hindi);
        telugu = findViewById(R.id.telugu);
        marathi = findViewById(R.id.marathi);
        kannada = findViewById(R.id.kannada);
        tamil = findViewById(R.id.tamil);



        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                english.setTextColor(Color.parseColor("#00ff00"));
            }
        });

        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hindi.setTextColor(Color.parseColor("#00ff00"));
            }
        });

        telugu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telugu.setTextColor(Color.parseColor("#00ff00"));
            }
        });
        marathi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marathi.setTextColor(Color.parseColor("#00ff00"));
            }
        });
        kannada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kannada.setTextColor(Color.parseColor("#00ff00"));
            }
        });
        tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tamil.setTextColor(Color.parseColor("#00ff00"));
            }
        });
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.english:changecolor(english);
            case R.id.hindi:changecolor(hindi);
            case R.id.marathi:changecolor(marathi);
            case R.id.telugu:changecolor(telugu);
            case R.id.kannada:changecolor(kannada);
            case R.id.tamil:changecolor(tamil);
        }
    }


    void changecolor(TextView languagename)
    {
        languagename.setTextColor(Color.parseColor("#00ff00"));
    }

}