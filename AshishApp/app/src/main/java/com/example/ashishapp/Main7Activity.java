package com.example.ashishapp;
//code for searchbox

import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {
ListView list_view;//declaring vcarible
SearchView search_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        //bindind layout nad xml file
        list_view= (ListView) findViewById(R.id.list_view);
      search_view=(SearchView)findViewById(R.id.search_View);

        ArrayList<String> list=new ArrayList<String>();//for store book like add in list
        final ArrayAdapter<String> adapter;
        list.add("Physics");
        list.add("Math");
        list.add("DBMS");
        list.add("SQL");
        list.add("JAVA");
        list.add("Android");
        //for set the book in list view
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        list_view.setAdapter(adapter);

        search_view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

    }
}
