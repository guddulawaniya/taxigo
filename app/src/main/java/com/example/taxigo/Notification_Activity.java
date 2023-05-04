package com.example.taxigo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Notification_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        ArrayList<noti_module> list = new ArrayList<>();

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
}