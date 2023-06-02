package com.example.taxigo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.chaos.view.PinView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class otp_Activtiy extends AppCompatActivity {

    final String sms = "Hello ! The One Time Password " +
            "to login for Staff panel is "+"sendotp"+" This OTP will expire in 10 minutes Regards, Taxigo";

    PinView pinView;
    TextView resendotp;

    String sendotp;
    boolean rdcheck = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_activtiy);
        pinView=findViewById(R.id.pinview);
        Button verifybutton = findViewById(R.id.verifybuttonotp);
        TextView showmessage = findViewById(R.id.textView11);
        Intent intent = getIntent();
        String number = intent.getStringExtra("number");
        sendotp = intent.getStringExtra("otp");
        resendotp = findViewById(R.id.resendotp);
        InternetConnection nt = new InternetConnection(getApplicationContext());



        showmessage.setText("We will send you an One Time Password on this number +91- "+number);
        timecounter();
        resendotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (rdcheck)
                {
                    rdcheck=false;
                    sendotp= new DecimalFormat("0000").format(new Random().nextInt(9999));
                   // String s = url + number + "&message=" + sms;
                    timecounter();
//                    sendotpnumbers sm = new sendotpnumbers(getApplication());
//                    sm.execute(s);

                }




            }
        });

        verifybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String enterotpinboxs=pinView.getText().toString();
                startActivity(new Intent(getApplicationContext(), select_language.class));
                finish();

                if (sendotp.equals(enterotpinboxs) && nt.isConnected())
                {


                    Toast.makeText(getApplicationContext(), "Verified", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), select_language.class));
                    finish();
                } else if (!nt.isConnected()) {

                    Toast.makeText(otp_Activtiy.this, "Please check Internet Connection", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
    void timecounter()
    {

        new CountDownTimer(30000,1000)
        {

            @Override
            public void onTick(long l) {


                NumberFormat format = new DecimalFormat("00");
                long sec = (l/1000) % 60;
                resendotp.setText("00 : "+format.format(sec));



            }

            @Override
            public void onFinish() {
                resendotp.setText("Resend");
                rdcheck = true;


            }
        }.start();
    }

}