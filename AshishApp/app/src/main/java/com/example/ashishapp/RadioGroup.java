package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioGroup extends AppCompatActivity {
RadioButton ashish,ajeet,anoop,prabhat;
String checkedName;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);
        ashish=(RadioButton) findViewById(R.id.ashish);
        ajeet=(RadioButton) findViewById(R.id.ajeet);
        anoop=(RadioButton) findViewById(R.id.anoop);
        prabhat=(RadioButton) findViewById(R.id.prabhat);
        btn=(Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ashish.isChecked()){
                    checkedName=ashish.getText().toString();
                }
                else if(ajeet.isChecked()){
                    checkedName=ajeet.getText().toString();
                }
                else if (anoop.isChecked()){
                    checkedName= anoop.getText().toString();
                }
                else if (prabhat.isChecked()){
                    checkedName=prabhat.getText().toString();
                }
                Toast.makeText(RadioGroup.this,checkedName, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
