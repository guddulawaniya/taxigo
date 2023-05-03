package com.example.taxigo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.taxigo.databinding.FragmentRidesBinding;

import java.util.ArrayList;


public class Rides_Fragment extends Fragment {


FragmentRidesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRidesBinding.inflate(inflater,container,false);

        ArrayList<select_Ride_Module> list = new ArrayList<>();
        RecyclerView view = binding.riderecyclerview;
        view.setLayoutManager(new LinearLayoutManager(getContext()));
        select_order_adapater_setdata adapter = new select_order_adapater_setdata(list,getContext());
        view.setAdapter(adapter);
        list.add(new select_Ride_Module("140, Ghanshyam vihar , Panchyawala , jaipur  Rajsthan..","140, Ghanshyam vihar , Panchyawala , jaipur  Rajsthan..","₹ 76.00","Cash","Dropped","03-05-2023 2hr Ago"));
        list.add(new select_Ride_Module("140, Ghanshyam vihar , Panchyawala , jaipur  Rajsthan..","140, Ghanshyam vihar , Panchyawala , jaipur  Rajsthan..","₹ 76.00","Cash","Dropped","03-05-2023 2hr Ago"));
        list.add(new select_Ride_Module("140, Ghanshyam vihar , Panchyawala , jaipur  Rajsthan..","140, Ghanshyam vihar , Panchyawala , jaipur  Rajsthan..","₹ 76.00","Cash","Dropped","03-05-2023 2hr Ago"));
        list.add(new select_Ride_Module("140, Ghanshyam vihar , Panchyawala , jaipur  Rajsthan..","140, Ghanshyam vihar , Panchyawala , jaipur  Rajsthan..","₹ 76.00","Cash","Dropped","03-05-2023 2hr Ago"));
        list.add(new select_Ride_Module("140, Ghanshyam vihar , Panchyawala , jaipur  Rajsthan..","140, Ghanshyam vihar , Panchyawala , jaipur  Rajsthan..","₹ 76.00","Cash","Dropped","03-05-2023 2hr Ago"));
        list.add(new select_Ride_Module("140, Ghanshyam vihar , Panchyawala , jaipur  Rajsthan..","140, Ghanshyam vihar , Panchyawala , jaipur  Rajsthan..","₹ 76.00","Cash","Dropped","03-05-2023 2hr Ago"));



        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}