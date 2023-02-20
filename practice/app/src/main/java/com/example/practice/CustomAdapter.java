package com.example.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    int[] img;
    String[] movie_name;
    Context context;
    LayoutInflater inflater;

    public CustomAdapter( Context context,int[] img,String[] movie_name){
        this.context=context;
        this.img=img;
        this.movie_name=movie_name;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return movie_name.length;
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
        View  view=inflater.inflate(R.layout.particularlayoutxml,null);
            //binding vparticular xml
        ImageView image_view=(ImageView) view.findViewById(R.id.image_view);
        TextView text_view=(TextView) view.findViewById(R.id.text_view);
        image_view.setImageResource(img[position]);
        text_view.setText(movie_name[position]);
        return view;
    }
}
