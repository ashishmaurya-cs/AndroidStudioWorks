package com.example.ashishapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImplicitIntent extends AppCompatActivity {
Button btn_im;
ImageView img_im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
        btn_im=(Button) findViewById(R.id.btn_im);
        img_im=(ImageView) findViewById(R.id.img_im);

    }
    public void btnClick(View view) {
        Intent inten=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(inten,2001);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
      if(requestCode==2001 && resultCode == Activity.RESULT_OK) {
          Bitmap photo = (Bitmap) data.getExtras().get("data");
          img_im.setImageBitmap(photo);
      }
    }


}
