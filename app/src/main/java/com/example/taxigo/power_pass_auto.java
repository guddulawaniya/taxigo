package com.example.taxigo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxigo.databinding.FragmentPowerPassAutoBinding;

import java.util.ArrayList;


public class power_pass_auto extends Fragment {

    FragmentPowerPassAutoBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentPowerPassAutoBinding.inflate(inflater,container,false);
        // Inflate the layout for this fragment
        ArrayList<power_module> list = new ArrayList<>();
        list.add(new power_module("79","20","40","10"));
        list.add(new power_module("79","20","40","10"));
        list.add(new power_module("79","20","40","10"));
        list.add(new power_module("79","20","40","10"));
        list.add(new power_module("79","20","40","10"));
        list.add(new power_module("79","20","40","10"));


        power_bike_Adapter adapter = new power_bike_Adapter(list);
        RecyclerView recyclerView = binding.recyclerview;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return binding.getRoot();
    }
}