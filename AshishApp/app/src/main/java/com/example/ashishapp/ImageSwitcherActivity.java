package com.example.ashishapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class ImageSwitcherActivity extends AppCompatActivity {
    private ImageSwitcher imgSwitcher;
    private Button previousbtn,nextbtn;
    private TextView textView;
int[] img={R.drawable.france,R.drawable.us,R.drawable.india,R.drawable.canada,R.drawable.uk};
private  int mPosition =-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher);
        //binding xml file
        textView=(TextView) findViewById(R.id.textview);
        previousbtn=(Button) findViewById(R.id.previousbtn);
        nextbtn=(Button) findViewById(R.id.nextbtn);
        imgSwitcher=(ImageSwitcher) findViewById(R.id.imgSwitcher);
        //set imageswitcher in image view
        imgSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,
                        ActionBar.LayoutParams.WRAP_CONTENT));
                return imageView;


            }
        });
        //for next button
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPosition<img.length-1){
                    mPosition=mPosition+1;
                    imgSwitcher.setBackgroundResource(img[mPosition]);
                }
            }
        });
        //for previous button
        previousbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPosition>0){
                    mPosition=mPosition-1;
                    imgSwitcher.setBackgroundResource(img[mPosition]);
                }
            }
        });
    }
}
