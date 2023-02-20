package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class LoginExplicitIntent extends AppCompatActivity {
TextView et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_explicit_intent);
        et3=(TextView) findViewById(R.id.et3);

        //get datap
       // et3.setText(getIntent().getStringExtra("use_name"));
        readfile();

    }

    public void readfile(){
        SharedPreferences sharedPreferences=getSharedPreferences("myfile", Context.MODE_PRIVATE);
        et3.setText(sharedPreferences.getString("user_name",""));
    }
}
