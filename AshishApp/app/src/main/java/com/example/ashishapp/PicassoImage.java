package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_image);

        ImageView image_view=findViewById(R.id.image_view);
        //String url="https://pixabay.com/photos/antibes-provence-france-europe-4210409/";
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(image_view);
    }
}
