package com.example.taxigo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.SmsManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class splash_screen extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;


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
                Intent intent = new Intent(splash_screen.this, login_Activity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);





    }

//    void somepermissions(){
//        if (AppCompatActivity.checkSelfPermission(getApplicationContext(), Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED)
//            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
//                if (ActivityCompat.shouldShowRequestPermissionRationale(this,
//                        Manifest.permission.SEND_SMS)) {
//
//
//
//                } else {
//                    ActivityCompat.requestPermissions(this,
//                            new String[]{Manifest.permission.SEND_SMS},
//                            MY_PERMISSIONS_REQUEST_SEND_SMS);
//                }
//            }
//    }

}