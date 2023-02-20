package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;

import org.json.JSONException;
import org.json.JSONObject;

public class TextInputEx extends AppCompatActivity {
TextView txt;
    TextInputEditText edit_text,edit_email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_ex);
        edit_text=(TextInputEditText) findViewById(R.id.edit_text);
        edit_email=(TextInputEditText)findViewById(R.id.edit_email);
        txt=findViewById(R.id.txt);
    }

    public void login(View view) {


       // String url = "https://api.androidhive.info/volley/person_object.json";

        String url1= "https://demonuts.com/Demonuts/JsonTest/Tennis/simplelogin.php";

        final ProgressDialog pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading...");
        pDialog.show();

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("username",edit_text.getText().toString());
            jsonObject.put("password",edit_email.getText().toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }


        JsonObjectRequest jsonObjectRequest=new JsonObjectRequest(Request.Method.POST, url1, jsonObject, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                pDialog.dismiss();
                try {
                    if(response.getString("status").equals("false")){
                       Toast.makeText(TextInputEx.this, "first"+response.getString("message"), Toast.LENGTH_SHORT).show();

                    }
                    else{
                        Toast.makeText(TextInputEx.this, "Else statement printed..", Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                pDialog.dismiss();
                Toast.makeText(TextInputEx.this, ""+error, Toast.LENGTH_SHORT).show();
            }
        });


// Adding request to request queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        //adding the string request to request queue
        requestQueue.add(jsonObjectRequest);
    }
}
