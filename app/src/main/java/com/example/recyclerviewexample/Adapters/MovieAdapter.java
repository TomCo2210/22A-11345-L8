package com.example.recyclerviewexample.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewexample.Models.Movie;
import com.example.recyclerviewexample.R;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Activity activity;
    private ArrayList<Movie> movies = new ArrayList<>();
    private MovieItemClickListener movieItemClickListener;

    public MovieAdapter(Activity activity, ArrayList<Movie> movies) {
        this.activity = activity;
        this.movies = movies;
    }

    public MovieAdapter setMovieItemClickListener(MovieItemClickListener movieItemClickListener) {
        this.movieItemClickListener = movieItemClickListener;
        return this;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_movie_item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MovieViewHolder movieViewHolder = (MovieViewHolder) holder;
        Movie movie = getItem(position);

        movieViewHolder.movie_LBL_title.setText(movie.getTitle());
        movieViewHolder.movie_LBL_actors.setText(movie.getActors());
        int h = movie.getDuration() / 60;
        int m = movie.getDuration() % 60;
        String hh = h < 10 ? "0" + h : "" + h;
        String mm = m < 10 ? "0" + m : "" + m;
        movieViewHolder.movie_LBL_duration.setText(hh + "h " + mm + "m");

        float rating = movie.getRating();
        rating /= 20;
        movieViewHolder.movie_RTNG_rating.setRating(rating);

        Glide
                .with(activity)
                .load(movie.getImage())
                .into(movieViewHolder.movie_IMG_image);

        if (movie.isFavorite())
            movieViewHolder.movie_IMG_favorite.setImageResource(R.drawable.ic_heart_filled);
        else
            movieViewHolder.movie_IMG_favorite.setImageResource(R.drawable.ic_heart_empty);

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    private Movie getItem(int position) {
        return movies.get(position);
    }


    public interface MovieItemClickListener {
        void movieItemClick(Movie movie, int position);

        void favoriteClicked(Movie movie, int position);
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        private AppCompatImageView movie_IMG_image;
        private AppCompatImageView movie_IMG_favorite;
        private MaterialTextView movie_LBL_title;
        private MaterialTextView movie_LBL_actors;
        private MaterialTextView movie_LBL_duration;
        private AppCompatRatingBar movie_RTNG_rating;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            movie_IMG_image = itemView.findViewById(R.id.movie_IMG_image);
            movie_IMG_favorite = itemView.findViewById(R.id.movie_IMG_favorite);
            movie_LBL_title = itemView.findViewById(R.id.movie_LBL_title);
            movie_LBL_actors = itemView.findViewById(R.id.movie_LBL_actors);
            movie_LBL_duration = itemView.findViewById(R.id.movie_LBL_duration);
            movie_RTNG_rating = itemView.findViewById(R.id.movie_RTNG_rating);

            itemView.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            movieItemClickListener.movieItemClick(getItem(getAdapterPosition()), getAdapterPosition());
                        }
                    }
            );
            movie_IMG_favorite.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            movieItemClickListener.favoriteClicked(getItem(getAdapterPosition()), getAdapterPosition());
                        }
                    }
            );
        }
    }
}
