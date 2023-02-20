package com.example.ashishapp;
// addition using onClickListener and textview
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
EditText et1,et2;
Button btn;
TextView txtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Binding the all view in increate method
        setContentView(R.layout.activity_main4);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        btn = (Button) findViewById(R.id.btn);
        txtv = (TextView) findViewById(R.id.txtv);
        //used onclicklistener event
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 =et1.getText().toString();
                String s2= et2.getText().toString();
                int a= Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                int c=a+b;
                txtv.setText("Addition is :-"+String.valueOf(c));
            }
        });

    }




}
