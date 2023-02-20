package com.example.ashishapp;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Main8Activity extends AppCompatActivity {
     SearchView search;
ListView lv;

 List<CountryModel> country_list;
   /* String[] country_list={"INDIA","AUS","JAPAN","RUSSIA","US","UK","CANADA","FRANCE"};
    String[] capital_list={"Delhi","Canberra","Tokyo","Moscow","Washington,D.C.","London","Ottawa","Paris"};
    String[] currency_list={"Currency:Rupees","Currency:Aus-Dollar","Currency:Yen","Currency:Russian ruble","Currency:Dollar",
            "Currency:Pound Sterling","Currency:Canadian-Dollar","Currency:Euro"};*/
    CustomAdapter customAdapter;
    int[] img= {R.drawable.india, R.drawable.australia, R.drawable.japan, R.drawable.russia,R.drawable.us,
            R.drawable.uk,R.drawable.canada,R.drawable.france};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        search=(SearchView)findViewById(R.id.search);
        lv=(ListView) findViewById(R.id.lv);
        //customAdapter=new CustomAdapter(this, country_list,capital_list,currency_list,img);
        country_list=new ArrayList<>();

        get_value_of_country();

        customAdapter=new CustomAdapter(this, country_list);
        lv.setAdapter(customAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
              /*  new AlertDialog.Builder(Main8Activity.this)
                        .setTitle(country_list[position])
                        .setMessage(capital_list[position])
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                Toast.makeText(Main8Activity.this, "ok", Toast.LENGTH_SHORT).show();
                                Intent inten=new Intent(Main8Activity.this,ExplicitIntent.class);
                                //for goes to next page explicit intent.
                                inten.putExtra("country_name",country_list[position]);
                                inten.putExtra("country_img",img[position]);
                                inten.putExtra("country_capital",img[position]);
                                inten.putExtra("currency",img[position]);
                                startActivity(inten);
                            }
                        })
                        .create()
                        .show();*/

            }
        });

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
             customAdapter.filter(newText);

                return false;
            }
        });


    }

    private void get_value_of_country() {


        CountryModel model=new CountryModel();
        model.setCountry_name("INDIA");
        model.setCapital_name("Delhi");
        model.setCurrency_indicator("Currency:Rupees");
        model.setCountry_flag(R.drawable.india);

        country_list.add(model);

        CountryModel model1=new CountryModel();
        model1.setCountry_name("AUS");
        model1.setCapital_name("Canberra");
        model1.setCurrency_indicator("Currency:Aus-Dollar");
        model1.setCountry_flag(R.drawable.australia);

        country_list.add(model1);

        CountryModel model2=new CountryModel();
        model2.setCountry_name("JAPAN");
        model2.setCapital_name("Tokyo");
        model2.setCurrency_indicator("Currency:Yen");
        model2.setCountry_flag(R.drawable.australia);

        country_list.add(model2);







    }
}
