package com.example.roomrental;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.roomrental.model.Data;
import com.example.roomrental.model.UserAccountSettings;

public class ListAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.room,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return Data.location.length;

    }
    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mItemText;
        private ImageView mItemImage;
     public ListViewHolder(View itemView){
     super(itemView);
     mItemText = (TextView)itemView.findViewById(R.id.location);
     mItemText =(TextView)itemView.findViewById(R.id.owner_name);
     mItemText = (TextView)itemView.findViewById(R.id.price);
     mItemImage = (ImageView) itemView.findViewById(R.id.room_image);
     mItemImage = (ImageView) itemView.findViewById(R.id.user_profile);
     itemView.setOnClickListener(this);
 }
 public void bindView (int position){
     mItemText.setText(Data.location[position]);
     mItemText.setText(Data.ownername[position]);
     mItemText.setText(Data.price[position]);
     mItemImage.setImageResource(Data.profile[position]);
     mItemImage.setImageResource(Data.room_image[position]);



 }
 public void onClick(View view){

 }

    }
}
