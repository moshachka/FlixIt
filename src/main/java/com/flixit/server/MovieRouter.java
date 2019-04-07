//package com.flixit.server;
//
//import com.flixit.exceptions.MovieNotFoundException;
//import com.flixit.model.Movie;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import javax.xml.bind.JAXBElement;
//
//@Path("/movie")
//public class MovieRouter {
//
//    @POST
//    @Path("/getEmp")
//    @Consumes(MediaType.APPLICATION_XML)
//    @Produces(MediaType.APPLICATION_XML)
//    public Response getEmp(JAXBElement<MovieRequest> movieRequest)
//            throws MovieNotFoundException {
//        MovieResponse empResponse = new MovieResponse();
//        if (movieRequest.getValue().getId() == 1) {
//            empResponse.setId(movieRequest.getValue().getId());
//            empResponse.setName(movieRequest.getValue().getName());
//        } else {
//            throw new MovieNotFoundException("Wrong ID", movieRequest.getValue()
//                    .getId());
//        }
//        return Response.ok(empResponse).build();
//    }
//
//}
