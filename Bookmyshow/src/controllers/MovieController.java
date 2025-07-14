package controllers;

import enums.City;
import models.movies.Movie;

import java.util.*;

public class MovieController {
    Map<City, List<Movie>> cityVsMovies;
    List<Movie> allMovies;

    public MovieController(){
        cityVsMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie, City city){
        allMovies.add(movie);

        List<Movie> movies = cityVsMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city, movies);
    }
    public Movie getMovieByName(String movieName){
        for (Movie movie : allMovies){
            if((movie.getMoviename()).equals(movieName)){
                return movie;
            }
        }
        return  null;
    }

    public List<Movie> getMovieByCity(City city){
        return cityVsMovies.get(city);
    }



    //REMOVE movie from a particular city, make use of cityVsMovies map
    public boolean removeMovieFromCity(String moviename, City city){
        List<Movie> movies = cityVsMovies.get(moviename);
        if(movies == null) return false;

        Iterator<Movie> iterator = movies.iterator();
        while (iterator.hasNext()){
            Movie movie = iterator.next();
            if(movie.getMoviename().equals(moviename)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean updateMoviecity(String moviename, City city, Movie updateMovie){
        List<Movie> movies = cityVsMovies.get(city);
        if (movies == null) return false;

        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if (movie.getMoviename().equals(moviename)){
                movies.set(i, updateMovie);
                return true;
            }
        }
        return false;
    }

    public Movie getMovieById(int d){
        for (Movie movie : allMovies){
            if (movie.getMovieId() == d){
                return movie;
            }
        }
        return null;
    }

    public boolean updateMovieById(int id, Movie updatedMovie){
        for (int i = 0; i < allMovies.size(); i++) {
            if(allMovies.get(i).getMovieId() == id){
                allMovies.set(i, updatedMovie);
                return true;
            }
        }
        return false;
    }

    public boolean deleteMovieById(int id){
        Movie toDelete = null;
        for (Movie movie : allMovies){
            if (movie.getMovieId() == id){
                toDelete = movie;
                break;
            }
        }

        if(toDelete == null) return false;

        allMovies.remove(toDelete);

        for (List<Movie> movies : cityVsMovies.values()){
            movies.remove(toDelete);
        }
        return  true;
    }
}
