package com.example.pquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
TextView mtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mtext=(TextView) findViewById(R.id.id1);
        Intent intent=new Intent();
        mtext.setText(intent.getIntExtra("score",0));
    }
}
