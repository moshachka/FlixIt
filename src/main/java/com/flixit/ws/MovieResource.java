package com.flixit.ws;

import com.flixit.model.Movie;
import com.flixit.service.IMovieService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("movies")
public class MovieResource {

    @Inject
    private IMovieService movieService;


    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMovies(){
        List<Movie> movies = movieService.getMovies();
        GenericEntity<List<Movie>> myEntity = new GenericEntity<List<Movie>>(movies){};
            return Response.status(200)
            .entity(myEntity).build();

    }
}
