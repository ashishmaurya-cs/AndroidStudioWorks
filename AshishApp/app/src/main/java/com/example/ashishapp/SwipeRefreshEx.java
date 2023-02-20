package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SwipeRefreshEx extends AppCompatActivity {

    ArrayList<String> arrayList = new ArrayList<>();
    SwipeRefreshLayout mSwipeRefreshLayout;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_refresh_ex);

        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeToRefresh);
        lv = (ListView) findViewById(R.id.lv);

        mSwipeRefreshLayout.setColorSchemeResources(R.color.colorAccent);

        arrayList.add("Java");
        arrayList.add(" Android");
        arrayList.add("SQL");
        arrayList.add("HTML");
        arrayList.add("CSS");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        lv.setAdapter(adapter);

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                shuffle();
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });
    }

    public void shuffle(){
        Collections.shuffle(arrayList, new Random(System.currentTimeMillis()));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        lv.setAdapter(adapter);
    }
}

