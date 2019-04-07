package com.flixit.server;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.flixit.model.IMovie;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("movie")
public class MovieServiceAPI{

    MovieService movieService= new MovieService();


    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMovies(){
        List<IMovie> movies = movieService.getMovies();
        MovieResponse mr =new MovieResponse(movies);
        try {
            return Response.status(200)
            .entity(mr.toJSON()).build();
        } catch (JsonProcessingException e) {
            return Response.serverError().build();
        }
    }
}
