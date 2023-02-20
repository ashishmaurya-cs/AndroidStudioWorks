package com.example.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter2 extends BaseAdapter {
    int[] img;
    String[] name;
    Context ctx;
    LayoutInflater inflater;
    CustomAdapter2(Context ctx,int[] img,String[] name){
        this.img=img;
        this.name=name;
        this.ctx=ctx;
        inflater=LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return img.length;
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
        ImageView img1=(ImageView) view.findViewById(R.id.img_view);
        TextView txt=(TextView) view.findViewById(R.id.txt_view);
        img1.setImageResource(img[position]);
        txt.setText(name[position]);
        return view;
    }
}
