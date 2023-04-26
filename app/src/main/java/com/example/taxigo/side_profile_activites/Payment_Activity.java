package com.example.taxigo.side_profile_activites;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.taxigo.R;

public class Payment_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        TextView selectappbottomsheet = findViewById(R.id.selectappbottomsheet);
        ImageView paymentbackarrow = findViewById(R.id.paymentbackarrow);






        LinearLayout bottomsheetselectapp = findViewById(R.id.selectappsheetlinear);



        paymentbackarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        selectappbottomsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bottomsheetselectapp.getVisibility()==View.VISIBLE)
                {
                    bottomsheetselectapp.setVisibility(View.GONE);

                }
                else
                {
                    bottomsheetselectapp.setVisibility(View.VISIBLE);

                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}