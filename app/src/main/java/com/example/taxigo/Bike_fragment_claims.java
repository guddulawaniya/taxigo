package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.taxigo.databinding.FragmentBikeClaimsBinding;

public class Bike_fragment_claims extends Fragment {

    FragmentBikeClaimsBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBikeClaimsBinding.inflate(inflater,container,false);

        binding.claiminsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),select_an_order_Activity.class));

            }
        });

        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}