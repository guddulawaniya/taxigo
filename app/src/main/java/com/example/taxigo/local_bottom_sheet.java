package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.taxigo.databinding.FragmentLocalBottomSheetBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class local_bottom_sheet extends BottomSheetDialogFragment {


    FragmentLocalBottomSheetBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLocalBottomSheetBinding.inflate(inflater,container,false);

        binding.backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        binding.proceedbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.foodbox.isChecked() ||binding.electronicsbox.isChecked() || binding.clothesbox.isChecked() ||
                binding.groceriesbox.isChecked() || binding.medicinesbox.isChecked() || binding.documentbox.isChecked())
                {
                    startActivity(new Intent(getContext(),Search_Activity.class));
                }
            }
        });
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}