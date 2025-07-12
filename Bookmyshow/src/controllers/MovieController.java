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

    public Movie getMovieById(int d){
        for (Movie movie : allMovies){
            if (movie.getMovieId() == d){
                return movie;
            }
        }
        return null;
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

    //UPDATE movie of a particular city, make use of cityVsMovies map

    //CRUD operation based on Movie ID, make use of allMovies list
}
