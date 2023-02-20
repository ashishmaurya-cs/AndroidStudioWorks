package com.example.ashishapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class CustomGalleryAdapter extends BaseAdapter {
    private Context context;
    private  int[] country_images;

    public CustomGalleryAdapter(Context context,int[] country_images) {
        this.context=context;
        this.country_images=country_images;
    }
//for this 2 java and 1 xml file.
    @Override
    public int getCount() {
        return country_images.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //created imageview by program.
        ImageView imageView=new ImageView(context);
        imageView.setImageResource(country_images[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(200,200));
        return imageView;
    }
}
