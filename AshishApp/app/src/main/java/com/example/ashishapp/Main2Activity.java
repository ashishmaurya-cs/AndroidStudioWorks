package com.example.ashishapp;
//addtion example using toast.make

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    EditText e1, e2;
    Button btn;
    TextView txtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        btn = (Button) findViewById(R.id.btn);
        txtv=(TextView) findViewById(R.id.txtv);
    }

    public void add(View view) {

        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = a + b;
        //Toast.makeText(this, String.valueOf(c), Toast.LENGTH_SHORT).show();
        txtv.setText(String.valueOf(c));


        }
}


