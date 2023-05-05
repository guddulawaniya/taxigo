package com.example.taxigo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class powerpass_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_powerpass);

        TabLayout tabs = findViewById(R.id.tabs);
        ViewPager viewPager = findViewById(R.id.view_pager);



        Power_pass_setTablayout_Adapter viewPagerAdapter = new Power_pass_setTablayout_Adapter(getSupportFragmentManager());
        tabs.setupWithViewPager(viewPager);
        viewPager.setAdapter(viewPagerAdapter);

        // Prepare view pager
    }
}