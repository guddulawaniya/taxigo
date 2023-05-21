package com.example.taxigo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Redirect_support_Activity extends AppCompatActivity {


    String[] profilesupport = {"Safety & Security","Billing/Ride Ralated Issues","Account & App","Referrals","Payment & Wallets","Power Pass","Other Issues"};

    String[] safety = {"Covid-19 Safety","Ride Insurance","Ride Safety"};
        String[] covid19 = {"My captain didn't follow safety measures"};
        String[] Ride_Insurance = {"I am unable to make an Insurance claim for a ride"};
        String[] Ride_Safety = {"My Captain was drunk","My captain was harassing me","I was involved in an accident"};

    String[] Billing_rated_issues = {"Delivery Related Issues","Billing Ralated Issues","I want to report an issue about a Captainn"};
        String[] Delivery_Related = {"My order was not delivered","item are damaged","Few items are missing from my order","I am unable to contact the captain","I have an issue with the payment","My issue is not mentioned above"};
        String[] Billing_Ralated_Issues = {"I have been charged higher then the estimated fare","I have been charged a cancellation fee","I am unable to appy a  coupon",
        "I applied a coupon code,but  didn't get the benefit","I have a power pass , but i did not get expected pass benefit for a ride ","I didn't take the ride but i was charged for the same ","I have been charged higher than the usual fare","I didn't receive cashback in my wallet"};
        String[]  want_about_a_Captainn = {"Captain was rude or unprofessional","Captain was driving dangerously","Captain asked me to cancle the ride","Cpatain was demanding extra cash","Captain / Vehicle details didn't match","I have an issue with the given helmet/haircap","My captain wasn't","wearing a back shield for my Plus ride"};
    String[] Account_app = {"How do I deactivate my account?","I am unable to request a ride","My app is crashing suddenly","I am not able to find a captain for my ride"};
    String[] referrals = {"I didn't get any referral credits"};

    String[] payemnt_wallets = {"Payment & wallets","Rapido Coins"};
        String[] Payment_wallets1  = {"I am not able to charge my payment method",""};
        String[] Rapido_Coins  = {""};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redirect_support);

        ImageView backimage = findViewById(R.id.backarrow);
        backimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}