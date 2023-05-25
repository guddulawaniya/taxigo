package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.AppBarLayout;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class myreward_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myreward);

        TextView support = findViewById(R.id.support);
        ArrayList<reward_module> list = new ArrayList<>();
        list.add(new reward_module(R.drawable.image1));
        list.add(new reward_module(R.drawable.image2));
        list.add(new reward_module(R.drawable.image3));
        list.add(new reward_module(R.drawable.image2));
        list.add(new reward_module(R.drawable.image1));
        RecyclerView rewardrecyclerview = findViewById(R.id.rewardrecyclerview);
        rewardrecyclerview.setLayoutManager(new GridLayoutManager(this,2));
        reward_adapter adapter = new reward_adapter(list,this);
        rewardrecyclerview.setAdapter(adapter);
        TextView message = findViewById(R.id.messagereward);

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Redirect_support_Activity.class);
                intent.putExtra("id",7);
                startActivity(intent);
            }
        });

        AppBarLayout appBarLayout = findViewById(R.id.app_bar);

        ImageView back = findViewById(R.id.completeprofileback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }

}