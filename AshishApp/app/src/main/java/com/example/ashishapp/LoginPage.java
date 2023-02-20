package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageHelper;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
EditText et1,et2;
Button btn;
ImageView login_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        //binding
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        btn=(Button) findViewById(R.id.btn);
        login_img=(ImageView) findViewById(R.id.login_img);

        SharedPreferences sharedPreferences=getSharedPreferences("myfile", Context.MODE_PRIVATE);
        if(sharedPreferences.getBoolean("Flag",false)){

            Intent inten=new Intent(LoginPage.this,LoginExplicitIntent.class);
            startActivity(inten);
            finish();
        }

    }

    public void login(View view) {
        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        if(s1.isEmpty()||s2.isEmpty()){
            Toast.makeText(this, "username and password  is required", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent inten=new Intent(LoginPage.this,LoginExplicitIntent.class);
            //for goes to next page explicit intent.
          // inten.putExtra("use_name",s1);

            save_in_preference(s1);
            startActivity(inten);
            finish();
        }
    }

    public void save_in_preference(String s1){
        SharedPreferences sharedPreferences=getSharedPreferences("myfile", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("user_name",s1);
        editor.putBoolean("Flag",true);
        editor.commit();
    }


}
