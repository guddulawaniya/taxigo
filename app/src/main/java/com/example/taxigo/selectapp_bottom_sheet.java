package com.example.taxigo;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.taxigo.databinding.FragmentSelectappBottomSheetBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class selectapp_bottom_sheet extends BottomSheetDialogFragment {

    FragmentSelectappBottomSheetBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSelectappBottomSheetBinding.inflate(inflater,container,false);

        SharedPreferences preferences = getContext().getSharedPreferences("location",MODE_PRIVATE);

        String currentaddress = preferences.getString("add",null);
        String homeaddress = preferences.getString("home",null);
        String officeaddress = preferences.getString("office",null);
        if (homeaddress!="" || officeaddress!="")
        {
            binding.homeaddress.setText(homeaddress);
            binding.officeaddbutton.setText("Replace");
            binding.homeaddbutton.setText("Replace");
            binding.  officeaddress.setText(officeaddress);
        }


        binding.homeaddbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.homeaddress.setText(currentaddress);
                binding.homeaddbutton.setText("Replace");
                SharedPreferences.Editor editor = getContext().getSharedPreferences("location",MODE_PRIVATE).edit();
                editor.putString("home",currentaddress);
                editor.commit();
            }
        });
       binding. officeaddbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              binding.  officeaddress.setText(currentaddress);
              binding.officeaddbutton.setText("Replace");
                SharedPreferences.Editor editor = getContext().getSharedPreferences("location",MODE_PRIVATE).edit();
                editor.putString("office",currentaddress);
                editor.commit();
            }
        });


        // Inflate the layout for this fragment
        return binding.getRoot();
    }


}