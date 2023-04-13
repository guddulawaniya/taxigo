package com.example.taxigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class profile_replace_activity extends AppCompatActivity {
    LinearLayout cantainer;

    private LayoutInflater mInflater;
    View convertView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_replace);

        cantainer = findViewById(R.id.cantainer);
        mInflater = LayoutInflater.from(getApplicationContext());


        Intent intent = getIntent();
        int id = intent.getIntExtra("id",0);
        layoutcall(id);
    }
    void layoutcall(int id )
    {
        switch (id)
        {
            case 1:convertView = mInflater.inflate(R.layout.local_send_layout, null);
        }
    }

}