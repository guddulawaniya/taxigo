package com.example.taxigo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class Ticket_Adapter extends RecyclerView.Adapter<Ticket_Adapter.viewholder>{

    ArrayList<ticket_module> list ;
    Context context;

    public Ticket_Adapter(ArrayList<ticket_module> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.drop_suggestion_layout,null);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        ticket_module module = list.get(position);
        holder.bookingdate.setText(module.getBookingdate());
        holder.openbooking.setText(module.getOepnbooking());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, Ticket_Details_Activity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewholder extends RecyclerView.ViewHolder {

        TextView bookingdate,openbooking;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            bookingdate = itemView.findViewById(R.id.bookingdate);
            openbooking = itemView.findViewById(R.id.bookingOpen);
        }
    }

}

class  ticket_module
{
    String bookingdate,oepnbooking;

    public ticket_module(String bookingdate, String oepnbooking) {
        this.bookingdate = bookingdate;
        this.oepnbooking = oepnbooking;
    }

    public String getBookingdate() {
        return bookingdate;
    }

    public void setBookingdate(String bookingdate) {
        this.bookingdate = bookingdate;
    }

    public String getOepnbooking() {
        return oepnbooking;
    }

    public void setOepnbooking(String oepnbooking) {
        this.oepnbooking = oepnbooking;
    }
}
