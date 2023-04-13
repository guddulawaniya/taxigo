package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TextView appname = findViewById(R.id.appname);
        Animation textanim = AnimationUtils.loadAnimation(this,R.anim.left_to_right);
        appname.startAnimation(textanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash_screen.this,login_Activity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}