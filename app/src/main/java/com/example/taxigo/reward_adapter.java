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

public class reward_adapter extends RecyclerView.Adapter<reward_adapter.viewholder>{

    ArrayList<reward_module> list ;
    Context context;

    public reward_adapter(ArrayList<reward_module> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.reward_layout,parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        reward_module module = list.get(position);
        holder.rewardimage.setImageResource(module.getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewholder extends RecyclerView.ViewHolder {

        ImageView rewardimage;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            rewardimage = itemView.findViewById(R.id.reward_image);

        }
    }

}
class reward_module{
    int image;

    public reward_module(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
