package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetail extends AppCompatActivity {
ImageView img;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        img=findViewById(R.id.img);
        txt=findViewById(R.id.txt);

        img.setImageResource(getIntent().getIntExtra("image",0));
        txt.setText(getIntent().getStringExtra("movie_name"));
    }
}
