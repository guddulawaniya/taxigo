package com.example.taxigo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class dropAdapter extends RecyclerView.Adapter<dropAdapter.viewholder>{

    ArrayList<modelclass> list ;
    Context context;

    public dropAdapter(ArrayList<modelclass> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.drop_suggestion_layout,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        modelclass dropmodel = list.get(position);
        holder.addresstitle.setText(dropmodel.getAddressTitle());
        holder.subtitle.setText(dropmodel.getSubTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewholder extends RecyclerView.ViewHolder {

        TextView addresstitle,subtitle;
        ImageView droplike;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            addresstitle = itemView.findViewById(R.id.addressTitle);
            subtitle = itemView.findViewById(R.id.subTitle);
            droplike = itemView.findViewById(R.id.droplike);
        }
    }

}
