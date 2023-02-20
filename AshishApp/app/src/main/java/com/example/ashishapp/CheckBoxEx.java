package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxEx extends AppCompatActivity implements View.OnClickListener {
CheckBox box1,box2,box3,box4,box5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_ex);
        box1=(CheckBox) findViewById(R.id.box1);
        box1.setOnClickListener(this);
        box2=(CheckBox) findViewById(R.id.box2);
        box2.setOnClickListener(this);
        box3=(CheckBox) findViewById(R.id.box3);
        box3.setOnClickListener(this);
        box4=(CheckBox) findViewById(R.id.box4);
        box4.setOnClickListener(this);
        box5=(CheckBox) findViewById(R.id.box5);
        box5.setOnClickListener(this);

    }
    public  void onClick(View view){
        switch ((view.getId())){
            case  R.id.box1:
                if(box1.isChecked())
                    Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_SHORT).show();

            case  R.id.box2:
                if(box2.isChecked())
                    Toast.makeText(this, "JAVA", Toast.LENGTH_SHORT).show();

            case  R.id.box3:
                if(box3.isChecked())
                    Toast.makeText(this, "ASP", Toast.LENGTH_SHORT).show();

            case  R.id.box4:
                if(box4.isChecked())
                    Toast.makeText(this, "PHP", Toast.LENGTH_SHORT).show();

            case  R.id.box5:
                if(box5.isChecked())
                    Toast.makeText(this, "Python", Toast.LENGTH_SHORT).show();
        }
    }
}
