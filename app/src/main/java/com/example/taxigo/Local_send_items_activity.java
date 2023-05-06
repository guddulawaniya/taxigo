package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import com.smarteist.autoimageslider.SliderView;

public class Local_send_items_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_send_items);
        SliderView sliderView = findViewById(R.id.image_slider);

        TextView adddetailslocal = findViewById(R.id.adddetailslocal);
        TextView localtext = findViewById(R.id.localtext);
        TextView adddetailsend = findViewById(R.id.adddetailsend);
        CardView localmenubutton = findViewById(R.id.localmenubutton);
        TextView localbuttomsheettext = findViewById(R.id.localbuttomsheettext);

        LinearLayout localsenditems = findViewById(R.id.localsend);
        LinearLayout ridewin = findViewById(R.id.ridewin);
        LinearLayout payment = findViewById(R.id.payment);
        LinearLayout myride = findViewById(R.id.myrides);
        LinearLayout referearn = findViewById(R.id.referearn);
        LinearLayout myreward = findViewById(R.id.rewards);
        LinearLayout taxigocoin = findViewById(R.id.taxigocoin);
        LinearLayout powerpass = findViewById(R.id.powerpass);
        LinearLayout notification = findViewById(R.id.notification);
        LinearLayout claim = findViewById(R.id.claim);
        LinearLayout settings = findViewById(R.id.settings);
        LinearLayout support = findViewById(R.id.support);
        LinearLayout completeprofile = findViewById(R.id.completeprofile);
        ConstraintLayout profileActivity = findViewById(R.id.profile);
        ImageView earnmoney = findViewById(R.id.earnmoney_arrow);

        localbuttomsheettext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                local_bottom_sheet sheet = new local_bottom_sheet();
                sheet.show(getSupportFragmentManager(),"myfragfment");
            }
        });




        String msm = "By continuing, you agree to our T&C and there are no restricted items in the " +
                "package. Taxigo shall not be liable for any theft/loass/misplacement/damegas to the item in any manner whatover.";
        localtext.setText(msm);
        adddetailslocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Search_Activity.class));
            }
        });
        DrawerLayout drawerLayout = findViewById(R.id.drawer);
        localmenubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        adddetailsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Search_Activity.class));
            }
        });


        int image[] = {R.drawable.image1,R.drawable.image2,R.drawable.image3};

        SliderAdapter sliderAdapter = new SliderAdapter(image);
        sliderView.setSliderAdapter(sliderAdapter);









        profileActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), profile_Activity.class));
            }
        });
        completeprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), complete_profile_Activity.class));
            }
        });

        earnmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Earn_money.class));
            }
        });

        localsenditems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Local_send_items_activity.class));


            }
        });
        ridewin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ridewin_Activity.class));


            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Payment_Activity.class));

            }
        });
        myride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),myride_Activity.class));
            }
        });
        referearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),referearn_Activity.class));
            }
        });
        myreward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),myreward_Activity.class));
            }
        });
        taxigocoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),taxigocoin_Activity.class));
            }
        });
        powerpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),powerpass_Activity.class));

            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Notification_Activity.class));
            }
        });
        claim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),claim_activity.class));
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),settings_Activity.class));
            }
        });
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),support_Activity.class));
            }
        });

    }
}