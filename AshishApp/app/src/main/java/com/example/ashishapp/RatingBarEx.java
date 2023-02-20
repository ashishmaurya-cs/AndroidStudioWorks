package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingBarEx extends AppCompatActivity {
RatingBar ratingBar;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_ex);
        ratingBar=(RatingBar) findViewById(R.id.ratingBar);
        btn=(Button) findViewById(R.id.btn);
    }

    public void submit(View view) {
        String totalStars="Totals Star "+ratingBar.getNumStars();
        String rating="Rating "+ratingBar.getRating();
        Toast.makeText(this, totalStars+" \n"+rating, Toast.LENGTH_SHORT).show();
    }
}
