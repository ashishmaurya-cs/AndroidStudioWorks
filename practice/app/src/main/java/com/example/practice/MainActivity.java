package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView list_view;

int[] img={R.drawable.alita,R.drawable.blackpanther,R.drawable.colt,R.drawable.strong};
String[] movie_name={"Alita","Black Panther"," Colt"," 12 Strong"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        list_view=findViewById(R.id.list_view);
        final CustomAdapter customAdapter=new CustomAdapter(this,img,movie_name);
        list_view.setAdapter(customAdapter);

        //listener
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(movie_name[position])
                        .setMessage("Movie")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                Intent intent =new Intent(getApplicationContext(),MovieDetail.class);
                                intent.putExtra("image",img[position]);
                                intent.putExtra("movie_name",movie_name[position]);
                                startActivity(intent);
                                finish();
                            }
                        })

                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .create()
                        .show();



            }
        });
    }
}
