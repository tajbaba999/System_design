package utility;

import controllers.MovieController;
import controllers.TheatreController;
import enums.City;
import models.movies.Movie;
import models.movies.MovieFactory;
import models.theatre.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookingDataFactory {
    public static List<Screen> createScreens(){
        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setScreenId(1);
        screen1.setSeats(createSeats());
        screens.add(screen1);
        return screens;
    }

    public static Show createShow(int showId, Movie movie, int showstartTime){
        Show show = new Show();
        show.setShowId(showId);
        show.setMovie(movie);
        show.setShowStratTime(showstartTime);
        return show;
    }

    public static  List<Seat> createSeats(){
        List<Seat> seats =  new ArrayList<>();
        for (int i = 1; i <=100; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seats.add(seat);
        }
        return seats;
    }
    public static List<Movie> createMovies(MovieController movieController){
        Movie barbie = MovieFactory.createMovie(1, "BARBIE", 128);
        Movie oppenheimer = MovieFactory.createMovie(2, "OPPENHEIMER", 180);



        movieController.addMovie(barbie, City.Banglore);
        movieController.addMovie(barbie, City.Delhi);
        movieController.addMovie(oppenheimer, City.Banglore);
        movieController.addMovie(oppenheimer, City.Delhi);

        return Arrays.asList(barbie, oppenheimer);
    }

    public static void  createTheatres(MovieController movieController, TheatreController theatreController){
        Movie barbie = movieController.getMovieByName("BARBIE");
        Movie oppenheimer = movieController.getMovieByName("OPPENHEIMER");

        Theatre inox = TheatreFactory.createTheatre( 1, "INOX", City.Banglore,
                Arrays.asList(
                        createShow(1, barbie, 10),
                        createShow(2, oppenheimer, 18)
                )
        );

        Theatre pvr = TheatreFactory.createTheatre(2, "PVR", City.Delhi, Arrays.asList(createShow(3, barbie, 10), createShow(2, oppenheimer, 12)));

        theatreController.addTheathre(inox, City.Banglore);
        theatreController.addTheathre(pvr, City.Delhi);
    }
}
