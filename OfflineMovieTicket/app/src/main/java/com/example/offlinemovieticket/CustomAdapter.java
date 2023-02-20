package com.example.offlinemovieticket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater inflater;
    List<MovieModel> modelList;
    List<MovieModel> temp_modelList;

    public CustomAdapter(Context ctx, List<MovieModel> modelList) {
        this.ctx=ctx;
        inflater= LayoutInflater.from(ctx);
        this.modelList=modelList;
        this.temp_modelList=new ArrayList<>();
        temp_modelList.addAll(modelList);

    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=inflater.inflate(R.layout.particular,null);
        ImageView img1= (ImageView) view.findViewById(R.id.img);
        TextView txt_movie_name=(TextView) view.findViewById(R.id.txt_movie_name);
        TextView txt_location=(TextView) view.findViewById(R.id.txt_location);
        img1.setImageResource(modelList.get(position).getImg());
        txt_movie_name.setText(modelList.get(position).getMovieName());
        txt_location.setText(modelList.get(position).getLocation());
        return view;
    }

    public void filter(String newText) {
        String text=newText.toLowerCase();
        modelList.clear();
        if(text.length()==0){
            modelList.addAll(temp_modelList);
        }
        else {
            for (MovieModel movieModel:temp_modelList){
                if(movieModel.getMovieName().toLowerCase().contains(text)){
                    modelList.add(movieModel);
                }
            }
        }

    }
}
