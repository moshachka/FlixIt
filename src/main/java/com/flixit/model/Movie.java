package com.flixit.model;

import java.util.Objects;

public class Movie{
    String title;
    String description;
    Double rating;
    public Movie(){

    }
    public Movie(String title, String description, Double rating){
        this.title = title;
        this.description = description;
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Double getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) &&
                Objects.equals(description, movie.description) &&
                Objects.equals(rating, movie.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, rating);
    }

    @Override
    public String toString(){
        return "Movie{" + "title=" + title + ", description=" + description +
                ", rating=" + rating + '}';
    }
}
