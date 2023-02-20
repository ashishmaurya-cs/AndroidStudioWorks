package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }

    public void start_music(View view) {
     Intent intent=new Intent(this,MyService.class);
     startService(intent);
    }

    public void stop_music(View view) {
        Intent intent=new Intent(this,MyService.class);
       stopService(intent);

    }
}
