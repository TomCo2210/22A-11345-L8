package com.example.recyclerviewexample.Models;

public class Movie {
    private String title = "";
    private String actors = "";
    private String image = ""; //link
    private int duration = 0 ;// in minutes
    private int rating = 0; //0-100
    private boolean favorite = false;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public Movie setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getActors() {
        return actors;
    }

    public Movie setActors(String actors) {
        this.actors = actors;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Movie setImage(String image) {
        this.image = image;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public Movie setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public int getRating() {
        return rating;
    }

    public Movie setRating(int rating) {
        this.rating = rating;
        return this;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public Movie setFavorite(boolean favorite) {
        this.favorite = favorite;
        return this;
    }
}
