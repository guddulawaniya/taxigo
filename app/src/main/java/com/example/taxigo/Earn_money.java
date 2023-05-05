package com.example.taxigo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Earn_money extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earn_money);
        TextView supporttext = findViewById(R.id.earnmoneysupport);
        TextView callbutton = findViewById(R.id.callbutton);
        TextView whastappbutton = findViewById(R.id.whatsappbuttton);

        callbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri u = Uri.parse("tel:" +"7037282643");
                Intent intent = new Intent(Intent.ACTION_DIAL,u);

                try
                {
                    // Launch the Phone app's dialer with a phone
                    // number to dial a call.
                    startActivity(intent);
                }
                catch (SecurityException s)
                {
                    // show() method display the toast with
                    // exception message.
                    Toast.makeText(Earn_money.this, "An error occurred", Toast.LENGTH_LONG).show();
                }
            }
        });
        whastappbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                sendIntent.setPackage("com.whatsapp");
                startActivity(Intent.createChooser(sendIntent, ""));
                startActivity(sendIntent);
            }
        });

        ImageView backbutton = findViewById(R.id.completeprofileback);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        supporttext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Earn_money.this, Redirect_support_Activity.class));
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}