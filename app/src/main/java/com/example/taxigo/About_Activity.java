package com.example.taxigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class About_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ImageView backbutton = findViewById(R.id.completeprofileback);
        TextView  support = findViewById(R.id.support);

        ListView listView = findViewById(R.id.listview);

        String[] itemlistname = {"Privacy Policy","Term and Conditions","Join the team","Blog","Software Licenses"};


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.show_list_item_layout,itemlistname);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setarraydata(position);
                Toast.makeText(About_Activity.this, "position : "+position, Toast.LENGTH_SHORT).show();
            }
        });
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Redirect_support_Activity.class));
            }
        });
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
    void setarraydata(int id )
    {
        switch (id)
        {
            case 0:
                Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case 1:
                Uri uri1 = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
                Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(intent1);
                break;
            case 2:
                Uri uri2 = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent2);
                break;
            case 3:
                Uri uri3 = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
                Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                startActivity(intent3);
                break;
            case 4:
                startActivity(new Intent(About_Activity.this, claim_activity.class));
                break;

        }

    }
}