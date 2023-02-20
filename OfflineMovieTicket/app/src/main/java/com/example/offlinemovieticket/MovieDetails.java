package com.example.offlinemovieticket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.paytm.pgsdk.PaytmOrder;
import com.paytm.pgsdk.PaytmPGService;
import com.paytm.pgsdk.PaytmPaymentTransactionCallback;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MovieDetails extends AppCompatActivity  {
Button btnA,btnR,btnC;
TextView num_txt,movie_Name,location,amount_txt;
ImageView img;
int ticketCount;
int amountFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        btnA=(Button)findViewById(R.id.btnA);
        btnR=(Button) findViewById(R.id.btnR);
        btnC=(Button) findViewById(R.id.btnC);
        num_txt=(TextView) findViewById(R.id.num_txt);
        movie_Name=(TextView) findViewById(R.id.movie_Name);
        location=(TextView) findViewById(R.id.location);
        amount_txt=(TextView)findViewById(R.id.amount_txt);
        img=(ImageView) findViewById(R.id.img);
        //getting data from maiactivity using explicit intent filter
        img.setImageResource(getIntent().getIntExtra("image",0));
        movie_Name.setText(getIntent().getStringExtra("movieName"));
        location.setText(getIntent().getStringExtra("location"));

        //on+ button
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //for number of ticket
                int ticket_count=Integer.parseInt(num_txt.getText().toString());
                int b=ticket_count+1;
                num_txt.setText(String.valueOf(b));
                //for amount
                int amount_count=150;
                amount_txt.setText(String.valueOf(amount_count*b));
            }
        });

        //on - button
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // for ticket
                 ticketCount=Integer.parseInt(num_txt.getText().toString());
                if(ticketCount>1){
                    ticketCount--;
                    num_txt.setText(String.valueOf(ticketCount));
                }

                //for amount

                int amount=Integer.parseInt(amount_txt.getText().toString());
                if(amount>150){
                    amount=amount-150;
                    //amountFinal=amount;
                    amount_txt.setText(String.valueOf(amount));
                }
            }
        });

        //for conform button
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog progressDialog=new ProgressDialog(MovieDetails.this);
                progressDialog.setMessage("Loading....");
                progressDialog.setCancelable(false);
                progressDialog.show();
                final Runnable runnable=new Runnable() {
                    @Override
                    public void run() {
                        progressDialog.cancel();
                    }
                };

                Handler handler= new Handler();
                handler.postDelayed(runnable,4000);

                //Intent intent=new Intent(MovieDetails.this, Confirm.class);
                Intent intent=new Intent(MovieDetails.this,Payment.class);
               // intent.putExtra("amount",amountFinal);
                startActivity(intent);
                finish();

            }
        });
    }

}

