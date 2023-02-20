package com.example.ashishapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater inflater;
    String[] country_list;
    String[] capital_list;
    String[] currency_list;
    String[] temp_list;
    int[] img;


    List<CountryModel> country_list_;
    List<CountryModel> temp_country_list_;
    public CustomAdapter(Context ctx, List<CountryModel> country_list) {
        this.ctx = ctx;
        inflater = LayoutInflater.from(ctx);
        this.country_list_=country_list;

        this.temp_country_list_=new ArrayList<>();
        temp_country_list_.addAll(country_list);
    }

   /* public CustomAdapter(Context ctx, String[] country_list, String[] capital_list,String[] currency_list,int[] img) {
        this.ctx = ctx;
        inflater = LayoutInflater.from(ctx);
        this.country_list = country_list;

        temp_list=country_list;

        this.capital_list=capital_list;
        this.currency_list=currency_list;
        this.img = img;
    }*/


    @Override
    public int getCount() {
        return country_list_.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view1=inflater.inflate(R.layout.particular,null);
        ImageView img1=(ImageView) view1.findViewById(R.id.img);
        TextView text=(TextView) view1.findViewById(R.id.my_txt);
        TextView capital=(TextView) view1.findViewById(R.id.txt_capital);
        TextView currency= (TextView) view1.findViewById(R.id.txt_currency);

        img1.setImageResource(country_list_.get(position).getCountry_flag());
        text.setText(country_list_.get(position).getCountry_name());
        capital.setText(country_list_.get(position).getCapital_name());
        currency.setText(country_list_.get(position).getCurrency_indicator());
        return view1;
    }

    public void filter(String newText) {
        String text=newText.toLowerCase();
        country_list_.clear();

        if (text.length() == 0) {
              country_list_.addAll(temp_country_list_);
        }else{
            for(CountryModel countryModel:temp_country_list_){
                if(countryModel.getCapital_name().toLowerCase().contains(text)){
                    country_list_.add(countryModel);
                }
            }
        }


    }
}
