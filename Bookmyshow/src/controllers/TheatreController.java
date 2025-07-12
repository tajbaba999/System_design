package controllers;

import enums.City;
import models.movies.Movie;
import models.theatre.Show;
import models.theatre.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheatre;
    // Nagpur → [PVR, INOX]
    // Mumbai → [Cinepolis, Carnival]

    List<Theatre> allTheatre;
    //allTheatre = [PVR, INOX, Cinepolis, Carnival]


    public void addTheathre(Theatre theatre, City city){
        allTheatre.add(theatre);

        List<Theatre> theatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatre.put(city, theatres);
    }

    public Map<Theatre, List<Show>> getAllShows(Movie movie, City city){

        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

        List<Theatre> theatres =new ArrayList<>();


        for (Theatre theatre : theatres){
            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();

            for(Show show :shows){
                if(show.getMovie().getMovieId() == movie.getMovieId()){
                    givenMovieShows.add(show);
                }
            }


            if(!givenMovieShows.isEmpty()) {
                theatreVsShows.put(theatre, givenMovieShows);
            }

        }
        return theatreVsShows;
    }
}

// getAllShow("Inception", City.NAGPUR);
// theatreVsShows = { PVR → [Morning Show, Evening Show] }





//Cinepolis → [Morning Show, Evening Show]
//Carnival → [Afternoon Show]
