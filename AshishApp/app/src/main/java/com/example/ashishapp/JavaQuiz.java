package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class JavaQuiz extends AppCompatActivity {
    //quiz project..
    //here total 3 file
    EditText et;
   Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_quiz);
        //binding
        et=(EditText) findViewById(R.id.et);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
    }


    public void start(View view) {

            String name=et.getText().toString();
            if(name.isEmpty()){
                Toast.makeText(JavaQuiz.this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
            }
            else{

                Intent intent=new Intent(JavaQuiz.this,Questions.class);
                intent.putExtra("myName",name);
                startActivity(intent);
            }
        }
    }

