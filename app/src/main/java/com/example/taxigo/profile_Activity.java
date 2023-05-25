package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import com.example.taxigo.databinding.ActivityProfileBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class profile_Activity extends AppCompatActivity {

    private ActivityProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TextView mobilenumberprofile = findViewById(R.id.mobilenumberprofile);
        NestedScrollView nestedScrollView = findViewById(R.id.nestedscollview);

        binding.completeprofileback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        binding.supporttext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Redirect_support_Activity.class);
                intent.putExtra("id",7);
                startActivity(intent);

            }
        });
    }
}