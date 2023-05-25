package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Redirect_support_Activity extends AppCompatActivity {


    ListView listView,secondarylist;
    ArrayAdapter<String> adapter;
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
        String[] Payment_wallets1  = {"I am not able to charge my payment method","I am not able to use a particular wallet","My wallet balance is not updated after recharging ","There is an unexplained deduction from my wallet "};
        String[] Rapido_Coins  = {"I have an issue with Rapido Coins"};
    String[] power_pass = {"I want to cancel my power pass","I am not able to purchase rapido power pass","I have purchased a power pass but it's not reflecting in my account","i have a power pass, but I did not get expected pass benefit","I am not able to view my power pass "};
    String[] Other_issues  = {"My issue is not mentioned above"};
    String[] claimlist  = {"When does the Insurance kick in?","What are the term and Conditions valid on my Insurance plan?","I want to claim Insurance for a ride","I am unable to make an Insurance claim for a ride"};
    String[] supportpaymentlist  = {"What is Taxigo power pass?","how can I buy a Taxigo power pass","How can I renew my Power pass?","I am not able to purchase Taxigo Power pass","I have purchased a power pass but it's not reflectinh in my account","I have Power Pass, but I did not get expected pass benefit","I am not able to view my Power pass","I want to cancle my Power pass"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redirect_support);

        ImageView backimage = findViewById(R.id.backarrow);

        Intent intent = getIntent();
        int id = intent.getIntExtra("id",0);
        switch (id)
        {
            case 1: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,safety);
            break;
            case 2: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,payemnt_wallets);
            break;
            case 3: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,Ride_Safety);
            break;
            case 4: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,referrals);
            break;
            case 5: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,Account_app);
            break;
            case 6: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,power_pass);
            break;
            case 7: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,profilesupport);
            break;
            case 8: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,supportpaymentlist);
            break;
            case 9: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,claimlist);
            break;
        }

      listView = findViewById(R.id.listview);

        //adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,profilesupport);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                changecontentonclick(position);
            }
        });
        backimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    void changecontentonclick(int id)
    {
        switch (id)
        {
            case 0: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,safety);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position)
                    {
                        case 0:adapter = new ArrayAdapter<>(getApplicationContext(),R.layout.show_list_item_layout,covid19);
                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                switch (position)
                                {
                                    case 0:adapter = new ArrayAdapter<>(getApplicationContext(),R.layout.show_list_item_layout,covid19);
                                }
                            }
                        });
                            break;
                        case 1:adapter = new ArrayAdapter<>(getApplicationContext(),R.layout.show_list_item_layout,Ride_Insurance);
                            break;
                        case 2:adapter = new ArrayAdapter<>(getApplicationContext(),R.layout.show_list_item_layout,Ride_Safety);
                            break;
                    }
                }
            });

            break;
            case 1: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,Billing_rated_issues);

                switch (id)
                {
                    case 0:adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,Delivery_Related);
                        break;
                    case 1:adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,Billing_Ralated_Issues);
                        break;
                    case 2:adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,want_about_a_Captainn);
                        break;
                }
            break;
            case 2: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,Account_app);

            break;
            case 3: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,referrals);

            break;
            case 4: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,payemnt_wallets);


                switch (id)
                {
                    case 0:adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,Payment_wallets1);
                        break;
                    case 1:adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,Rapido_Coins);
                        break;
                }

            break;
            case 5: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,power_pass);

            break;
            case 6: adapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,Other_issues);

            break;

        }
        listView.setAdapter(adapter);
    }
}