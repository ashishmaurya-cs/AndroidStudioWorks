package com.example.ashishapp;

public class CountryModel {

    private String country_name;
    private String capital_name;
    private String currency_indicator;

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {

        this.country_name = country_name;
    }

    public String getCapital_name() {
        return capital_name;
    }

    public void setCapital_name(String capital_name) {

        this.capital_name = capital_name;
    }

    public String getCurrency_indicator()
    {
        return currency_indicator;
    }

    public void setCurrency_indicator(String currency_indicator) {
        this.currency_indicator = currency_indicator;
    }

    public int getCountry_flag()
    {
        return country_flag;
    }

    public void setCountry_flag(int country_flag)
    {
        this.country_flag = country_flag;
    }

    private int country_flag;

}
