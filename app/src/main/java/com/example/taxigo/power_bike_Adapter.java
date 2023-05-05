package com.example.taxigo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class power_bike_Adapter extends RecyclerView.Adapter<power_bike_Adapter.viewholder> {

    ArrayList<power_module> list ;

    public power_bike_Adapter(ArrayList<power_module> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.power_bike_card_layout,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        power_module module = list.get(position);
        holder.price.setText(module.getPrice());
        holder.discount.setText(module.getDiscount());
        holder.savingprice.setText(module.getSavingprice());
        holder.rides.setText(module.getRides());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewholder extends RecyclerView.ViewHolder {

        TextView price,discount,savingprice,rides;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            price = itemView.findViewById(R.id.price);
            discount = itemView.findViewById(R.id.discountprice);
            savingprice = itemView.findViewById(R.id.savingprice);
            rides = itemView.findViewById(R.id.rides);
        }
    }
}

class power_module{
    String price,discount,savingprice,rides;

    public power_module(String price, String discount, String savingprice, String rides) {
        this.price = price;
        this.discount = discount;
        this.savingprice = savingprice;
        this.rides = rides;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getSavingprice() {
        return savingprice;
    }

    public void setSavingprice(String savingprice) {
        this.savingprice = savingprice;
    }

    public String getRides() {
        return rides;
    }

    public void setRides(String rides) {
        this.rides = rides;
    }
}
