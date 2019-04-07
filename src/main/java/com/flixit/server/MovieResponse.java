package com.flixit.server;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flixit.model.IMovie;
import java.util.List;


public class MovieResponse {
    private List<IMovie> movies;
    @JsonCreator
    public MovieResponse(@JsonProperty("movies")List<IMovie> movies){
        this.movies = movies;
    }

    public List<IMovie> getMovies() {
        return movies;
    }

    public void setMovies(List<IMovie> movies) {
        this.movies = movies;
    }

    public String toJSON() throws JsonProcessingException {
        ObjectMapper MAPPER = new ObjectMapper();
        return MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString( this );
    }
}
