package com.example.taxigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.taxigo.databinding.FragmentAutoClaimsBinding;

public class Auto_fragment_claims extends Fragment {

    FragmentAutoClaimsBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAutoClaimsBinding.inflate(inflater,container,false);

        binding.emailredirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, "guddulawaniya123@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Testing");
                intent.putExtra(Intent.EXTRA_TEXT, "Welcome to Taxigo App");
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Email"));
            }
        });
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}