package com.example.ashishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class JsonEx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_ex);
        Gson gson=new Gson();
        Address address=new Address("India","Delhi");

        List<FamilyMember> family=new ArrayList<>();
        family.add(new FamilyMember("Student",22));
        family.add(new FamilyMember("Parent",60));
        //employee.java
       Employee employee=new Employee("Ashish","Maurya",21,address,family);
        String Json=gson.toJson(employee);

        /*
       String json="{\"firstName\":\"Ashish\",\"lastName\":\"Maurya\",\"age\":21}";
       Employee employee=gson.fromJson(json,Employee.class);
        */
    }
}
