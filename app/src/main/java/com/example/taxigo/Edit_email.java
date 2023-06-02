package com.example.taxigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import java.util.regex.Pattern;

public class Edit_email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_email);
        TextInputEditText updatetext = findViewById(R.id.updatetext);

        Button updateemailbutton = findViewById(R.id.updateemailbutton);
        updateemailbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!updatetext.getText().toString().isEmpty() && Patterns.EMAIL_ADDRESS.matcher(updatetext.getText().toString()).matches())
                {
                    SharedPreferences.Editor editor = getSharedPreferences("shareEmail",MODE_PRIVATE).edit();
                    editor.putString("email",updatetext.getText().toString());
                    editor.commit();

                }
            }
        });
    }
}