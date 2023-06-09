package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Search_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        ArrayList<modelclass> searchinglocationlist = new ArrayList<>();
        RecyclerView searchingrecyclerview = findViewById(R.id.searchingrecyclerview);
        searchingrecyclerview.setLayoutManager(new LinearLayoutManager(this));

        searchinglocationlist.add(new modelclass("Meridean Overseas Education Consultants","Vaishali Marg, Ganga Sagar-B,Nemi Nagar Exaxhange"));
        searchinglocationlist.add(new modelclass("Jaipur","Rajsthan,India"));
        searchinglocationlist.add(new modelclass("Sitapur","Jaipur Rajasthan,India"));
        searchinglocationlist.add(new modelclass("Jaipur Junction ","Station Road ,Gopalbari,Jaipur,Rajasthan,India"));

        ImageView searchingbackimage = findViewById(R.id.completeprofileback);
        ImageView selectmapicon = findViewById(R.id.selectmapicon);
        TextView selectmap = findViewById(R.id.selectmap);

        selectmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Search_Activity.this, MapsActivity.class));
            }
        });
        selectmapicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Search_Activity.this, MapsActivity.class));
            }
        });

        ImageView backbutton = findViewById(R.id.completeprofileback);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        searchingbackimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        searching_location_Adapter sadapter = new searching_location_Adapter(searchinglocationlist,this);
        searchingrecyclerview.setAdapter(sadapter);

    }
}