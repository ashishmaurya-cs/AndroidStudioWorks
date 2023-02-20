package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ImplicitIntentMessage extends AppCompatActivity {
Button btn;
EditText etx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent_message);
        // binding
        btn=(Button) findViewById(R.id.btn);
        etx=(EditText) findViewById(R.id.etx);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 String s1=etx.getText().toString();
                Intent shariingMessage=new Intent(Intent.ACTION_SEND);
                shariingMessage.setType("text/plan");
                shariingMessage.putExtra(Intent.EXTRA_TEXT,s1);
                shariingMessage.setPackage("com.whatsapp");
                startActivity(shariingMessage);

            }
        });
        Toast.makeText(this, "Message has been sent", Toast.LENGTH_SHORT).show();


    }


}
