package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CardViewExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_example);
        CardView cardview = (CardView) findViewById(R.id.card_view);
        //cardview.setRadius(20F);
        //cardview.setCardBackgroundColor(Color.BLACK);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CardViewExample.this, "CardView click event", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
