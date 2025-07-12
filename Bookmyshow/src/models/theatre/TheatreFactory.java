package models.theatre;

import enums.City;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheatreFactory {
    public static Theatre createTheatre(int threatreId, String name, City city, List<Show> shows){
        Theatre theatre = new Theatre();
        theatre.setTheatreId(threatreId);
        theatre.setTheatrename(name);
        theatre.setCity(city);
        theatre.setShows(shows);
        theatre.setScreen(createScreens());
        return theatre;
    }

    public static List<Screen> createScreens(){
        Screen screen = new Screen();
        screen.setScreenId(1);
        screen.setSeats(createSeats());
        return Arrays.asList(screen);
    }

    public static List<Seat> createSeats(){
        List<Seat> seats = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            seats.add(new Seat());
        }
        return seats;
    }
}
