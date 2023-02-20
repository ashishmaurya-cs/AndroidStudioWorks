package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.EGLExt;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

//customize spinner example like dropdown list
public class Main3Activity extends AppCompatActivity {
    Spinner spn_countryName;
    String[] Country_list= {"Select country","India","China","canada"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        spn_countryName=(Spinner) findViewById(R.id.spn_countryName);
        //for spinner jus t do android.R.layout.simple-spinner-dropdown-list,
        ArrayAdapter<String> adapter=new ArrayAdapter   <String>(this,R.layout.custom_spinner,R.id.my_txt,Country_list);
        spn_countryName.setAdapter(adapter);


        spn_countryName.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(spn_countryName.getSelectedItemPosition()==0){
                    Toast.makeText(Main3Activity.this,"Please select country",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Main3Activity.this,"Country selected",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        } );


        }
}