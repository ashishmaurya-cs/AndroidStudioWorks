package com.example.ashishapp;

import android.media.Image;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main9Activity extends AppCompatActivity{
    Spinner spn;
    String[] bookName={"c","Java","Android","Physics","Math","DAA","SQL"};
    int[] img={R.drawable.c,R.drawable.java,R.drawable.android,R.drawable.physics,R.drawable.math,R.drawable.daa,R.drawable.sql};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        //binding

        spn=(Spinner) findViewById(R.id.spn) ;
        CustomSpinnerAdapter customSpinnerAdapter=new CustomSpinnerAdapter(this,bookName,img);
        spn.setAdapter(customSpinnerAdapter);

    }
}
