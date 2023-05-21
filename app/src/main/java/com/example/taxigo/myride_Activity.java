package com.example.taxigo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

public class myride_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_an_order);
        CollapsingToolbarLayout title = findViewById(R.id.toolbar_layout);

        title.setTitle(getString(R.string.orders));

        TabLayout tabs = findViewById(R.id.selectordertabs);
        ViewPager viewPager = findViewById(R.id.select_view_pager);
        select_order_Adapter viewPagerAdapter = new select_order_Adapter(getSupportFragmentManager());
        tabs.setupWithViewPager(viewPager);
        viewPager.setAdapter(viewPagerAdapter);
        ImageView backbutton = findViewById(R.id.completeprofileback);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}