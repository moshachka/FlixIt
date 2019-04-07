package com.flixit.service;

import com.flixit.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieService implements IMovieService {


    @Override
    public List<Movie> getMovies(){
        List<Movie> movies = new ArrayList<>();
        Movie batman = new Movie();
        batman.setTitle("Batman");

        Movie superman = new Movie();
        superman.setTitle("Superman");
        movies.add(batman);
        movies.add(superman);
        return movies;
    }


}
