package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.taxigo.databinding.ActivityCompleteProfileBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class complete_profile_Activity extends AppCompatActivity {

    private ActivityCompleteProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCompleteProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.completeprofileback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }
}