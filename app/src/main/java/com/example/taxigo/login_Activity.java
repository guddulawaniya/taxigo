package com.example.taxigo;

import android.Manifest;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.text.DecimalFormat;
import java.util.Random;

public class login_Activity extends AppCompatActivity {
    private static final int REQUEST_PERMISSION_CODE = 101;
    private NotificationManagerCompat notificationManagerCompat;
    private Notification notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInputEditText mobilenumber = findViewById(R.id.inputmobileNo);
        TextInputLayout mobileinputlayout = findViewById(R.id.mobilenumberlayout);
        Button nextbutton = findViewById(R.id.nextbutton);

        if ((ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS))!=PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, REQUEST_PERMISSION_CODE);
        }



        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mobilenumber.getText().toString().trim().isEmpty()) {
                    mobileinputlayout.setBoxStrokeColor(Color.RED);
                    mobileinputlayout.setHelperText("Required*");
                    mobileinputlayout.setHelperTextColor(ColorStateList.valueOf(Color.RED));
                    mobileinputlayout.setHintTextColor(ColorStateList.valueOf(Color.RED));
                    mobileinputlayout.requestFocus();

                } else {
                    String sendotp = new DecimalFormat("0000").format(new Random().nextInt(9999));
                    addNotification(sendotp);
                    Toast.makeText(login_Activity.this, "SMS Sent Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), otp_Activtiy.class);
                    intent.putExtra("number", mobilenumber.getText().toString());
                    intent.putExtra("otp", sendotp);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }

//    protected void sendSMSMessage() {
//
//        if ((ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) &&
//                (ActivityCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED)) {
//            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
//                    android.Manifest.permission.SEND_SMS)) {
//
//                SmsManager smsManager = SmsManager.getDefault();
//                smsManager.sendTextMessage("7037282643", null, "message", null, null);
//                Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
//
//            } else {
//                ActivityCompat.requestPermissions(this,
//                        new String[]{Manifest.permission.SEND_SMS},
//                        MY_PERMISSIONS_REQUEST_SEND_SMS);
//            }
//        }
//    }

    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQUEST_PERMISSION_CODE: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage("7037282643", null, "verify otp ", null, null);
                    Toast.makeText(getApplicationContext(), "SMS sent.",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "SMS faild, please try again.", Toast.LENGTH_LONG).show();
                }
            }
        }
    }




    void addNotification(String otp) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("mych", "My Channel", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "mych")
                .setSmallIcon(R.drawable.scooter)
                .setContentTitle("Taxigo OTP Verify")
                .setContentText("One Time Password : " + otp);
        notification = builder.build();
        notificationManagerCompat = NotificationManagerCompat.from(this);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.POST_NOTIFICATIONS}, REQUEST_PERMISSION_CODE);
            return;
        }
        notificationManagerCompat.notify(1, notification);
    }
}