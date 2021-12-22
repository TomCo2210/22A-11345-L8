package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.recyclerviewexample.Adapters.MovieAdapter;
import com.example.recyclerviewexample.Models.Movie;
import com.example.recyclerviewexample.Utils.DataManager;

public class MainActivity extends AppCompatActivity {

    private RecyclerView main_RV_movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_RV_movies = findViewById(R.id.main_RV_movies);
        MovieAdapter movieAdapter = new MovieAdapter(this, DataManager.generateMovies());

        movieAdapter.setMovieItemClickListener(new MovieAdapter.MovieItemClickListener() {
            @Override
            public void movieItemClick(Movie movie, int position) {
                Toast.makeText(MainActivity.this, movie.getTitle(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void favoriteClicked(Movie movie, int position) {
                movie.setFavorite(!movie.isFavorite());
                Toast.makeText(MainActivity.this, movie.getTitle() + "\nis Liked!", Toast.LENGTH_SHORT).show();
                main_RV_movies.getAdapter().notifyItemChanged(position);
            }
        });

       // main_RV_movies.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        main_RV_movies.setLayoutManager(new GridLayoutManager(this,2));
        main_RV_movies.setHasFixedSize(true);
        main_RV_movies.setItemAnimator(new DefaultItemAnimator());
        main_RV_movies.setAdapter(movieAdapter);
    }
}