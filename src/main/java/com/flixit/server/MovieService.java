package com.flixit.server;

import com.flixit.model.IMovie;
import com.flixit.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
    List<IMovie> movies = new ArrayList<>();

    public MovieService(){
        Movie batman = new Movie();
        batman.setTitle("Batman");

        Movie superman = new Movie();
        superman.setTitle("Superman");
        movies.add(batman);
        movies.add(superman);
    }

    public List<IMovie> getMovies(){
        return movies;
    }

    public IMovie searchMovie(String title){
        return movies.get(0);
    }


}
