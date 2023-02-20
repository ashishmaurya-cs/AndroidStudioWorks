package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
private ArrayList<ModelItem> mModelList;

    public static class CustomViewHolder extends RecyclerView.ViewHolder{
            public ImageView mimageView;
            public   TextView mtextView1;
            public TextView mtextView2;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            mimageView=itemView.findViewById(R.id.imageView);
            mtextView1=itemView.findViewById(R.id.textView);
            mtextView2=itemView.findViewById(R.id.textView2);
        }
    }
    public CustomAdapter(ArrayList<ModelItem> modelList){
        mModelList=modelList;
    }
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.particular,parent,false);
        CustomViewHolder customViewHolder=new CustomViewHolder(v);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        ModelItem currentItem=mModelList.get(position);
        holder.mimageView.setImageResource(currentItem.getImage());
        holder.mtextView1.setText(currentItem.getText1());
        holder.mtextView2.setText(currentItem.getText2());
    }

    @Override
    public int getItemCount() {
        return mModelList.size();
    }


}
