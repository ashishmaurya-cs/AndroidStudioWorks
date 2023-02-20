package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ApiEx extends AppCompatActivity {

    RequestQueue requestQueue;
    TextView txt,txt2,txt3,txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api_ex);

        txt = findViewById(R.id.txt);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);


    }
    public void login(View view) {

            requestQueue = Volley.newRequestQueue(this);



           String url = "https://api.androidhive.info/volley/person_object.json";

            JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        String name = response.getString("name");
                        String email= response.getString("email");

                        JSONObject jsonObject=response.getJSONObject("phone");
                        String home=jsonObject.getString("home");
                        String mobile=jsonObject.getString("mobile");

                        txt.setText(name);
                        txt2.setText(email);
                        txt3.setText(home);
                        txt4.setText(mobile);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    error.printStackTrace();
                }
            });
            requestQueue.add(request);

        }
        }


