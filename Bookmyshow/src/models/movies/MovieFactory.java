package models.movies;

import java.util.HashMap;
import java.util.Map;

public class MovieFactory {
    private static final Map<String, Movie> movieChche = new HashMap<>();


    public static Movie createMovie(int id, String name, int duration){
        return movieChche.computeIfAbsent(name, k -> new Movie(id, name, duration));
    }
}
