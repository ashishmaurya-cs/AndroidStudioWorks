package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ExplicitIntent extends AppCompatActivity {
ImageView eximg;
TextView extxt,ex_capital,ex_currency;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        //bind
        eximg=(ImageView) findViewById(R.id.eximg);
        extxt=(TextView)findViewById(R.id.extxt);
        ex_capital=(TextView)findViewById(R.id.ex_capital);
        ex_currency=(TextView)findViewById(R.id.ex_currency);
        //get data
        eximg.setImageResource(getIntent().getIntExtra("country_img",0));
        extxt.setText(getIntent().getStringExtra("country_name"));
        ex_capital.setText(getIntent().getStringExtra("country_capital"));
        ex_currency.setText(getIntent().getStringExtra("currency"));
    }
}
