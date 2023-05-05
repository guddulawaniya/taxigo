package com.example.taxigo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Notification_Adapter extends RecyclerView.Adapter<Notification_Adapter.viewholder> {

    ArrayList<noti_module> list ;

    public Notification_Adapter(ArrayList<noti_module> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_layout_card,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        noti_module module = list.get(position);
        holder.title.setText(module.getNotifi_title());
        holder.message.setText(module.getNotifi_message());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewholder extends RecyclerView.ViewHolder {

        TextView title,message;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.notification_title);
            message = itemView.findViewById(R.id.notifi_message);
        }
    }
}

class noti_module{
    String notifi_title,notifi_message;

    public noti_module(String notifi_title, String notifi_message) {
        this.notifi_title = notifi_title;
        this.notifi_message = notifi_message;
    }

    public String getNotifi_title() {
        return notifi_title;
    }

    public void setNotifi_title(String notifi_title) {
        this.notifi_title = notifi_title;
    }

    public String getNotifi_message() {
        return notifi_message;
    }

    public void setNotifi_message(String notifi_message) {
        this.notifi_message = notifi_message;
    }
}
