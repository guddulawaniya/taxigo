package com.example.taxigo;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class referearn_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referearn);
        CardView backbutton = findViewById(R.id.completeprofileback);

        ImageView copyimage = findViewById(R.id.copyimage);
        TextView copytext = findViewById(R.id.copytext);
        TextView invitetext = findViewById(R.id.invitefriend);
        TextView invite = findViewById(R.id.refernowbutton);

        copyimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code = copytext.getText().toString();
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                clipboard.setText(code);
                Toast.makeText(referearn_Activity.this, "Copied..", Toast.LENGTH_SHORT).show();
            }
        });

        invite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}