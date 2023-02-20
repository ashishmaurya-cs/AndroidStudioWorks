package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.file.Files;

public class Main6Activity extends AppCompatActivity {
//declare variable
EditText et1,et2;
Button btn1,btn2,btn3,btn4;
TextView txtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        //binding layout  with java file
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        txtv=(TextView) findViewById(R.id.txtv);
        //
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                int a= Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                int c=a+b;
                txtv.setText("Addition is :-"+String.valueOf(c));
            }
        });

        //code for subtrsction
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                int a= Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                int c=a-b;
                txtv.setText("Subtraction  is :-  "+String.valueOf(c));
            }
        });
        //code for multiplication
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                int a= Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                int c=a*b;
                txtv.setText("Multiplication  is :-"+String.valueOf(c));
            }
        });
            //code for division
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                int a= Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                if(b!=0){
                    int c=a/b;
                    txtv.setText("Division  is :-"+String.valueOf(c));
                }
                else{
                    txtv.setText("You can't divide by zero");
                }

            }
        });


    }
}
