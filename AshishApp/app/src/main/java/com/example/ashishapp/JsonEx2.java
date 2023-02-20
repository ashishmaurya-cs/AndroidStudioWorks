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

import org.json.JSONException;
import org.json.JSONObject;

public class JsonEx2 extends AppCompatActivity {
RequestQueue requestQueue;
TextView response_txt;
Button request_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_ex2);
        request_btn=findViewById(R.id.request_btn);
        response_txt=findViewById(R.id.response_txt);
    }

    public void send(View view) {
        requestQueue= Volley.newRequestQueue(this);

        String url="https://api.myjson.com/bins/ug0fs";

         JsonObjectRequest request=new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    String name=response.getString("name");
                    String email=response.getString("email");


                    JSONObject jsonObject=response.getJSONObject("phone");
                    String home=jsonObject.getString("home");
                    String mobile=jsonObject.getString("mobile");

                   response_txt.append("Name : "+name+"\n\n"+"Email : "+email+"\n\n"+"Home : "+home+"\n\n"+"Mobile : "+mobile);

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
