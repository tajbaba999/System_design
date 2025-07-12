package models.theatre;

import models.movies.Movie;

import java.util.ArrayList;
import java.util.List;

public class Show {
    int showId;
    Movie movie;
    Screen screen;
    int showStratTime;
    List<Integer> bookedSeatsIds = new ArrayList<>();

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Movie getMovie(){
        return movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Screen getScreen() {
        return screen;
    }

    public int getShowStratTime(){
        return showStratTime;
    }

    public void setShowStratTime(int showStratTime) {
        this.showStratTime = showStratTime;
    }

    public void setBookedSeatsIds(List<Integer>  bookedSeatsIds){
        this.bookedSeatsIds = bookedSeatsIds;
    }
    public  List<Integer> getBookedSeatsIds(){
        return  bookedSeatsIds;
    }
}
