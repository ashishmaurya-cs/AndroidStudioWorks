package com.example.practice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
ListView list;
int[] img={R.drawable.strong,R.drawable.colt,R.drawable.blackpanther,R.drawable.alita};
String[] name={"Strong","Colt","Black panther","Alita"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        list=(ListView) findViewById(R.id.list);

        CustomAdapter2 customAdapter2 =new CustomAdapter2(this,img,name);
        list.setAdapter(customAdapter2);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                new AlertDialog.Builder(Main2Activity.this)
                        .setTitle("Hello Dude")
                        .setMessage("do u want to uninstall")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                Intent intent=new Intent(getApplicationContext(),Movie.class);
                                intent.putExtra("image",img[position]);
                                intent.putExtra("name",name[position]);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
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
