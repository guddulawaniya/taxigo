package com.example.taxigo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Ticket_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        ArrayList<ticket_module> list = new ArrayList<>();

        ImageView backbutton = findViewById(R.id.completeprofileback);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        RecyclerView recyclerView = findViewById(R.id.ticketrecyclerview);

        list.add(new ticket_module("Bike | Booked: Mar 26 , 2023,12:22 PM","Opened: Mar 26, 2023, 12:30 PM"));
        list.add(new ticket_module("Bike | Booked: Mar 26 , 2023,12:22 PM","Opened: Mar 26, 2023, 12:30 PM"));
        list.add(new ticket_module("Bike | Booked: Mar 26 , 2023,12:22 PM","Opened: Mar 26, 2023, 12:30 PM"));
        list.add(new ticket_module("Bike | Booked: Mar 26 , 2023,12:22 PM","Opened: Mar 26, 2023, 12:30 PM"));
        list.add(new ticket_module("Bike | Booked: Mar 26 , 2023,12:22 PM","Opened: Mar 26, 2023, 12:30 PM"));
        list.add(new ticket_module("Bike | Booked: Mar 26 , 2023,12:22 PM","Opened: Mar 26, 2023, 12:30 PM"));
        list.add(new ticket_module("Bike | Booked: Mar 26 , 2023,12:22 PM","Opened: Mar 26, 2023, 12:30 PM"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Ticket_Adapter adapter = new Ticket_Adapter(list,this);
        recyclerView.setAdapter(adapter);
    }
}