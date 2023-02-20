package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<ModelItem> modelList;
    RecyclerView mRecyclwerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mlayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelList= new ArrayList<>();
        modelList.add(new ModelItem(R.drawable.ic_android,"Line 1","Line 2"));
        modelList.add(new ModelItem(R.drawable.ic_desktop,"Line 3","Line 4"));
        modelList.add(new ModelItem(R.drawable.ic_do_not_disturb,"Line 5","Line 6"));
        modelList.add(new ModelItem(R.drawable.ic_android,"Line 1","Line 2"));
        modelList.add(new ModelItem(R.drawable.ic_desktop,"Line 3","Line 4"));
        modelList.add(new ModelItem(R.drawable.ic_do_not_disturb,"Line 5","Line 6"));
        modelList.add(new ModelItem(R.drawable.ic_android,"Line 1","Line 2"));
        modelList.add(new ModelItem(R.drawable.ic_desktop,"Line 3","Line 4"));
        modelList.add(new ModelItem(R.drawable.ic_do_not_disturb,"Line 5","Line 6"));

        mRecyclwerView=findViewById(R.id.recycler_view);
        mRecyclwerView.setHasFixedSize(true);
        mlayoutManager=new LinearLayoutManager(this);
        mAdapter=new CustomAdapter(modelList);

        mRecyclwerView.setLayoutManager(mlayoutManager);
        mRecyclwerView.setAdapter(mAdapter);
    }
}
