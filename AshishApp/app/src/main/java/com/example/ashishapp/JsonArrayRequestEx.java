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
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonArrayRequestEx extends AppCompatActivity {
TextView response_txt;
Button request_btn;
RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_array_request_ex);
        request_btn=(Button) findViewById(R.id.request_btn);
        response_txt=(TextView) findViewById(R.id.response_txt);

    }

    public void send(View view) {

        requestQueue =  Volley.newRequestQueue(this);
        String url="https://api.androidhive.info/volley/person_array.json";

        JsonArrayRequest jsonArrayRequest= new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i=0;i<response.length();i++){
                    try {
                        JSONObject objectRequest=response.getJSONObject(i);
                        String name=objectRequest.getString("name");
                        String email=objectRequest.getString("email");
                        JSONObject jsonObject=objectRequest.getJSONObject("phone");
                        String home=jsonObject.getString("home");
                        String mobile=jsonObject.getString("mobile");

                        response_txt.setText(response_txt.getText()+"Name : "+name+"\n\n"+"email : "+email+"\n\n"+"Home : "+home+"\n\n"+"Mobile : "+mobile+"\n\n");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(jsonArrayRequest);

    }
}
