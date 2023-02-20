package com.example.offlinemovieticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SearchView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<MovieModel> modelList;
    CustomAdapter customAdapter;
    GridView gridView;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.grid_view);
        searchView=(SearchView)findViewById(R.id.search_view);


        modelList=new ArrayList<>();
        //get data of movie
        get_movie_value();
        customAdapter=new CustomAdapter(this,modelList);
        gridView.setAdapter(customAdapter);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
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

      gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
              Intent intent=new Intent(MainActivity.this,MovieDetails.class);
              intent = intent.putExtra("image", modelList.get(position).getImg());
              intent = intent.putExtra("movieName", modelList.get(position).getMovieName());
              intent = intent.putExtra("location", modelList.get(position).getLocation());
              startActivity(intent);

          }
      });
    }


    private  void get_movie_value(){
        MovieModel movieModel1=new MovieModel();
        movieModel1.setImg(R.drawable.alita);
        movieModel1.setMovieName("Alita");
        movieModel1.setLocation("Mumbai");
        modelList.add(movieModel1);

        MovieModel movieModel2=new MovieModel();
        movieModel2.setImg(R.drawable.blackpanther);
        movieModel2.setMovieName("Black Panther");
        movieModel2.setLocation("Delhi");
        modelList.add(movieModel2);

        MovieModel movieModel3=new MovieModel();
        movieModel3.setImg(R.drawable.jupiterascending);
        movieModel3.setMovieName("Jupiter Ascending");
        movieModel3.setLocation("Kolkata");
        modelList.add(movieModel3);

        MovieModel movieModel4=new MovieModel();
        movieModel4.setImg(R.drawable.oblivion);
        movieModel4.setMovieName("Oblivion");
        movieModel4.setLocation("Chennai");
        modelList.add(movieModel4);

        MovieModel movieModel5=new MovieModel();
        movieModel5.setImg(R.drawable.colt);
        movieModel5.setMovieName("Colt 45");
        movieModel5.setLocation("Surat");
        modelList.add(movieModel5);

        MovieModel movieModel6=new MovieModel();
        movieModel6.setImg(R.drawable.matrix);
        movieModel6.setMovieName("Matrix");
        movieModel6.setLocation("Lucknow");
        modelList.add(movieModel6);


        MovieModel movieModel7=new MovieModel();
        movieModel7.setImg(R.drawable.terminator);
        movieModel7.setMovieName("Terminator");
        movieModel7.setLocation("Thane");
        modelList.add(movieModel7);

        MovieModel movieModel8=new MovieModel();
        movieModel8.setImg(R.drawable.wolverine);
        movieModel8.setMovieName("Wolverine");
        movieModel8.setLocation("Noida");
        modelList.add(movieModel8);

        MovieModel movieModel9=new MovieModel();
        movieModel9.setImg(R.drawable.worldwarz);
        movieModel9.setMovieName("World war Z");
        movieModel9.setLocation("Dombivli");
        modelList.add(movieModel9);

        MovieModel movieModel10=new MovieModel();
        movieModel10.setImg(R.drawable.strong);
        movieModel10.setMovieName("12 Strong");
        movieModel10.setLocation("Mumbai");
        modelList.add(movieModel10);


        MovieModel movieModel11=new MovieModel();
        movieModel11.setImg(R.drawable.hobbit);
        movieModel11.setMovieName("Hobbit");
        movieModel11.setLocation("Navi Mumbai");
        modelList.add(movieModel11);

        MovieModel movieModel12=new MovieModel();
        movieModel12.setImg(R.drawable.thelastlegion);
        movieModel12.setMovieName("The Last Legion");
        movieModel12.setLocation("Allahabad");
        modelList.add(movieModel12);


        MovieModel movieModel13=new MovieModel();
        movieModel13.setImg(R.drawable.theveil);
        movieModel13.setMovieName("The Veil");
        movieModel13.setLocation("Gurugram");
        modelList.add(movieModel13);


        MovieModel movieModel14=new MovieModel();
        movieModel14.setImg(R.drawable.lordoftherings);
        movieModel14.setMovieName("Land of the Rings");
        movieModel14.setLocation("Mohali");
        modelList.add(movieModel14);


        MovieModel movieModel15=new MovieModel();
        movieModel15.setImg(R.drawable.transit17);
        movieModel15.setMovieName("Transit 17");
        movieModel15.setLocation("Indore");
        modelList.add(movieModel15);

        MovieModel movieModel16=new MovieModel();
        movieModel16.setImg(R.drawable.piratescaribbean);
        movieModel16.setMovieName("Pirates Caribbean");
        movieModel16.setLocation("Surat");
        modelList.add(movieModel16);
    }
}
