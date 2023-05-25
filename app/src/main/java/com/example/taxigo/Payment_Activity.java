package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import org.w3c.dom.Text;

public class Payment_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        TextView selectappbottomsheet = findViewById(R.id.selectappbottomsheet);
        ImageView backbutton = findViewById(R.id.completeprofileback);
        TextView  support = findViewById(R.id.support);
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Redirect_support_Activity.class);
                intent.putExtra("id",2);
            }
        });
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        CollapsingToolbarLayout toolbar = findViewById(R.id.toolbar_layout);





        LinearLayout bottomsheetselectapp = findViewById(R.id.selectappsheetlinear);

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