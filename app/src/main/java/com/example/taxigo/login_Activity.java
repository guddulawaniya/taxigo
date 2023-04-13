package com.example.taxigo;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class login_Activity extends AppCompatActivity {


    SliderView sliderView;
    int[] images = {R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sliderView = findViewById(R.id.image_slider);

        TextInputEditText mobilenumber = findViewById(R.id.inputmobileNo);
        TextInputLayout mobileinputlayout = findViewById(R.id.mobilenumberlayout);
        Button nextbutton = findViewById(R.id.nextbutton);


        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();



        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mobilenumber.getText().toString().trim().isEmpty())
                {
                    mobileinputlayout.setBoxStrokeColor(Color.RED);
                    mobileinputlayout.setHelperText("Required*");

                    mobileinputlayout.setHelperTextColor(ColorStateList.valueOf(Color.RED));
                    mobileinputlayout.setHintTextColor(ColorStateList.valueOf(Color.RED));
                    mobileinputlayout.requestFocus();


                }
                else
                {
                    startActivity(new Intent(login_Activity.this,otp_Activtiy.class));
                    finish();
                }
            }
        });

    }
}