
package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryExample extends AppCompatActivity {
ImageView image_view_gallery;
Gallery gallery;
int[] country_images={R.drawable.uk,R.drawable.india,R.drawable.us,R.drawable.canada,R.drawable.france,R.drawable.russia,R.drawable.japan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_example);
        image_view_gallery= (ImageView) findViewById(R.id.image_view_gallery);
        gallery=(Gallery) findViewById(R.id.gallery);

        CustomGalleryAdapter customGallery=new CustomGalleryAdapter(getApplicationContext(),country_images);
        gallery.setAdapter(customGallery);
        gallery.setSpacing(10);

        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                image_view_gallery.setImageResource(country_images[position]);
            }
        });
    }
}
