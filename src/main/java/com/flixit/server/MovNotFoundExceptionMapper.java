//package com.flixit.server;
//
//import com.flixit.exceptions.MovieNotFoundException;
//import com.sun.jndi.cosnaming.ExceptionMapper;
//
//public class MovNotFoundExceptionMapper implements ExceptionMapper<MovieNotFoundException> {
//
//
//    public MovNotFoundExceptionMapper() {
//    }
//
//    public Response toResponse(
//            MovieNotFoundException empNotFoundException) {
//        ErrorResponse errorResponse = new ErrorResponse();
//        errorResponse.setErrorId(empNotFoundException.getErrorId());
//        errorResponse.setErrorCode(empNotFoundException.getMessage());
//        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(
//                errorResponse).type(
//                MediaType.APPLICATION_XML).build();
//
//    }
//
//}
