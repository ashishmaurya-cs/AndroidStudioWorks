package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Listview extends AppCompatActivity {
ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        //binding
        list=(ListView)findViewById(R.id.list);
        ArrayList<String> li=new ArrayList<String>();
        li.add("DBMS");
        li.add("SQL SERVER");
        li.add("DAA");
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,li);
        list.setAdapter(adapter);
    }
}
