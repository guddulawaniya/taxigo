package com.example.taxigo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Config;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Locale;

public class Languages_Activity extends AppCompatActivity {

    CardView savebutton;
    String  ln = "en";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);
        ImageView backbutton = findViewById(R.id.completeprofileback);
        savebutton = findViewById(R.id.languagesetbutton);




        ListView listView = findViewById(R.id.listview);

        String[] languagelist = {"English","हिन्दी (hindi)","मराठी (Marathi)","ಕನ್ನಡ (kannada)","ೆಲುಗು (Telugu)","ತಮಿಳು (Tamil)"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,languagelist);

        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                changelanguages(position);
                parent.getChildAt(position).setBackgroundColor(Color.YELLOW);


            }
        });



        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    void changelanguages(int id)
    {
        switch (id)
        {
            case 0:setLocale("en");
                break;
            case 1:setLocale("hi");

                break;
            case 2:setLocale("kn");

                break;
            case 3:setLocale("mr");

                break;
            case 4:setLocale("te");

                break;
            case 5:setLocale("ta");

                break;

        }

        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                recreate();
                restartActivity();


            }
        });


    }
    private void restartActivity() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);
        finish();
    }

    void setLocale(String language)
    {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        getBaseContext().getResources().updateConfiguration(configuration,getBaseContext().getResources().getDisplayMetrics());

        SharedPreferences.Editor editor = getSharedPreferences("settings",MODE_PRIVATE).edit();
        editor.putString("LANGUAGE_KEY",language);
        editor.commit();
        editor.apply();
    }


}