package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Notification_Activity extends AppCompatActivity {

    ArrayList<noti_module> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

       list = new ArrayList<>();
        ImageView backbutton = findViewById(R.id.completeprofileback);
        ImageView menubutton = findViewById(R.id.menuicon);



        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        RecyclerView recyclerView = findViewById(R.id.notificationrecyclerview);

        list.add(new noti_module("Coins Expiring","all your 10 coins expire within 3 days. Use them now! book a ride"));
        list.add(new noti_module("Please meet your captain","all your 10 coins expire within 3 days. Use them now! book a ride"));
        list.add(new noti_module("rapido Coins Credited","all your 10 coins expire within 3 days. Use them now! book a ride"));
        list.add(new noti_module("Coins Expiring","all your 10 coins expire within 3 days. Use them now! book a ride"));
        list.add(new noti_module("Coins Expiring","all your 10 coins expire within 3 days. Use them now! book a ride"));
        list.add(new noti_module("Coins Expiring","all your 10 coins expire within 3 days. Use them now! book a ride"));
        list.add(new noti_module("Coins Expiring","all your 10 coins expire within 3 days. Use them now! book a ride"));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Notification_Adapter adapter = new Notification_Adapter(list);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.notification_clear,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.clear:
                list.clear();
                break;
        }

        return true;
    }
}