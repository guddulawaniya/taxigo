package com.example.taxigo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class select_order_adapater_setdata extends RecyclerView.Adapter<select_order_adapater_setdata.viewholder>{

    ArrayList<select_Ride_Module> list ;
    Context context;

    public select_order_adapater_setdata(ArrayList<select_Ride_Module> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ride_layout_recyclerview,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        select_Ride_Module module = list.get(position);
        holder.startaddress.setText(module.getStartaddress());
        holder.endaddress.setText(module.getEndaddress());
        holder.date.setText(module.getDate());
        holder.money.setText(module.getMoney());
        holder.mode.setText(module.getMode());
        holder.status.setText(module.getStatus());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView startaddress,endaddress,money,mode,status,date;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            startaddress = itemView.findViewById(R.id.startaddressselect);
            endaddress = itemView.findViewById(R.id.endaddressselect);
            money = itemView.findViewById(R.id.money);
            mode = itemView.findViewById(R.id.mode);
            status = itemView.findViewById(R.id.status);
            date = itemView.findViewById(R.id.date);

        }
    }
}
