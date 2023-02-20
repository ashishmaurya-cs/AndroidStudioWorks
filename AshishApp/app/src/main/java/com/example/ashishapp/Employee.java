package com.example.ashishapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    @SerializedName("firstName")
    private  String mfirstName;
    @SerializedName("lastName")
    private  String mlastName;
    @SerializedName("age")
    private  int mage;
    @SerializedName("address")
    private  Address maddress;
    @SerializedName("FamilyMember")
     private  List<FamilyMember> mFamily;

    public  Employee(String firstNAme,String lastNAme,int age,Address address,List<FamilyMember> family){
        mfirstName=firstNAme;
        mlastName=lastNAme;
        mage=age;
        maddress=address;
        mFamily=family;
    }
}
