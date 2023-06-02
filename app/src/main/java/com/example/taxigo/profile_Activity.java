package com.example.taxigo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import com.example.taxigo.databinding.ActivityProfileBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.Calendar;

public class profile_Activity extends AppCompatActivity {

    private ActivityProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TextView mobilenumberprofile = findViewById(R.id.mobilenumberprofile);
        NestedScrollView nestedScrollView = findViewById(R.id.nestedscollview);
        LinearLayout selectgender = findViewById(R.id.selectgender);
        LinearLayout enteremail = findViewById(R.id.enteremail);
        LinearLayout logout = findViewById(R.id.logout);
        TextView email = findViewById(R.id.emailview);

        SharedPreferences preferences = getSharedPreferences("shareEmail",MODE_PRIVATE);
        String mail = preferences.getString("email",null);
        email.setText(mail);

        enteremail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Edit_email.class));

            }
        });

        selectgender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profile_Activity.this,login_Activity.class));
            }
        });



        CollapsingToolbarLayout toolbarLayout = findViewById(R.id.toolbar_layout);

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