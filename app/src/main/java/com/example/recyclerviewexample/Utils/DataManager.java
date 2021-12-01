package com.example.recyclerviewexample.Utils;

import com.example.recyclerviewexample.Models.Movie;

import java.util.ArrayList;

public class DataManager {
    public static ArrayList<Movie> generateMovies() {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie()
                .setTitle("Red Notice")
                .setActors("Dwayne Johnson, Ryan Reynolds,Gal Gadot")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wdE6ewaKZHr62bLqCn7A2DiGShm.jpg")
                .setDuration(116)
                .setRating(69)
        );

        movies.add(new Movie()
                .setTitle("The Shawshank Redemption")
                .setActors("Tim Robbins, Morgan Freeman, Bob Gunton")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vdVab7yNvgYEMd8shCfy2D6nTMu.jpg")
                .setDuration(142)
                .setRating(87)
        );
        movies.add(new Movie()
                .setTitle("The Shawshank Redemption")
                .setActors("Tim Robbins, Morgan Freeman, Bob Gunton")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vdVab7yNvgYEMd8shCfy2D6nTMu.jpg")
                .setDuration(142)
                .setRating(87)
        );
        movies.add(new Movie()
                .setTitle("The Shawshank Redemption")
                .setActors("Tim Robbins, Morgan Freeman, Bob Gunton")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vdVab7yNvgYEMd8shCfy2D6nTMu.jpg")
                .setDuration(142)
                .setRating(87)
        );
        movies.add(new Movie()
                .setTitle("The Shawshank Redemption")
                .setActors("Tim Robbins, Morgan Freeman, Bob Gunton")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vdVab7yNvgYEMd8shCfy2D6nTMu.jpg")
                .setDuration(142)
                .setRating(87)
        );
        movies.add(new Movie()
                .setTitle("Venom: Let There Be Carnage")
                .setActors("Tom Hardy, Woody Harrelson, Michelle Williams, Naomie Harris")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1MJNcPZy46hIy2CmSqOeru0yr5C.jpg")
                .setDuration(97)
                .setRating(72)
        );

        movies.add(new Movie()
                .setTitle("The Lord of the Rings: The Return of the King")
                .setActors("Elijah Wood, Ian McKellen")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rCzpDGLbOoPwLjy3OAm5NUPOTrC.jpg")
                .setDuration(201)
                .setRating(85)
        );

        movies.add(new Movie()
                .setTitle("A clockwork orange")
                .setActors("Malcolm McDowell, Patrick Magee")
                .setImage("https://images-na.ssl-images-amazon.com/images/S/pv-target-images/18008ecca4b19aa99c2e23d10ae26b9aaf838c98c0bb6acd4164006eb4ad07f8._RI_V_TTW_.jpg")
                .setDuration(136)
                .setRating(90)
        );

        movies.add(new Movie()
                .setTitle("The Mummy")
                .setActors("Brendan Fraser, Rachel Weisz ,John Hannah")
                .setImage("https://www.themoviedb.org/t/p/w1280/yhIsVvcUm7QxzLfT6HW2wLf5ajY.jpg")
                .setDuration(120)
                .setRating(32)
        );

        movies.add(new Movie()
                .setTitle("Shang-Chi and the Legend of the Ten Rings")
                .setActors("Simu Liu, Tony Leung Chiu-wai ,Awkwafina")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1BIoJGKbXjdFDAqUEiA2VHqkK1Z.jpg")
                .setDuration(132)
                .setRating(79)
        );

        movies.add(new Movie()
                .setTitle("The Hitchhiker's Guide to the Galaxy")
                .setActors("Martin Freeman, Zooey Deschanel, Sam Rockwell")
                .setImage("https://www.themoviedb.org/t/p/w1280/jWOmLRfYWrgzQFZL1pHep9QYT1Z.jpg")
                .setDuration(109)
                .setRating(67)
        );

        return movies;
    }
}
