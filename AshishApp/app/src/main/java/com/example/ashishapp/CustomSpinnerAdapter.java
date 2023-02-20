package com.example.ashishapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class CustomSpinnerAdapter extends BaseAdapter {

    String[] bookName;
    int[] img;
    Context ctx;
    LayoutInflater inflater;

    public CustomSpinnerAdapter(Context ctx,String[] bookName, int[] img) {
        this.bookName = bookName;
        this.img = img;
        this.ctx = ctx;
        inflater=LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return  bookName.length;
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
        View v1=inflater.inflate(R.layout.customadapterspinner,null);
         ImageView imgv1=(ImageView) v1.findViewById(R.id.imgv);
        TextView txt1=(TextView) v1.findViewById(R.id.txt);
        imgv1.setImageResource(img[position]);
        txt1.setText(bookName[position]);
        return v1;
    }
}
