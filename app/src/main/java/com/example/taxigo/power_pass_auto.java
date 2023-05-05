package com.example.taxigo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class power_pass_auto extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ArrayList<power_module> list = new ArrayList<>();
        list.add(new power_module("79","20","40","10"));
        list.add(new power_module("79","20","40","10"));
        list.add(new power_module("79","20","40","10"));
        list.add(new power_module("79","20","40","10"));
        list.add(new power_module("79","20","40","10"));
        list.add(new power_module("79","20","40","10"));

        power_bike_Adapter adapter = new power_bike_Adapter(list);
        RecyclerView recyclerView = getActivity().findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return inflater.inflate(R.layout.fragment_power_pass_auto, container, false);
    }
}