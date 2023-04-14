package com.example.taxigo.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxigo.R;
import com.example.taxigo.ModuleClasses.modelclass;

import java.util.ArrayList;

public class searching_location_Adapter extends RecyclerView.Adapter<searching_location_Adapter.viewholder>{

    ArrayList<modelclass> list ;
    Context context;

    public searching_location_Adapter(ArrayList<modelclass> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.searching_layout,null);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        modelclass modelclass = list.get(position);
        holder.addresstitle.setText(modelclass.getAddressTitle());
        holder.subtitle.setText(modelclass.getSubTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewholder extends RecyclerView.ViewHolder {

        TextView addresstitle,subtitle;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            addresstitle = itemView.findViewById(R.id.searchaddressTitle);
            subtitle = itemView.findViewById(R.id.searchsubTitle);
        }
    }
}
