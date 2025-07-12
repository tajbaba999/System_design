package models.movies;

public class Movie {
    int movieId;
    String moviename;
    int movieDuration;

    Movie(int movieId, String moviename, int movieDuration){
        this.movieId = movieId;
        this.moviename = moviename;
        this.movieDuration = movieDuration;
    }

    public void setMovieId(int movieId){
        this.movieId = movieId;
    }

    public int getMovieId(){
        return movieId;
    }

    public void setMoviename(String moviename){
        this.moviename = moviename;
    }

    public String getMoviename(){
        return moviename;
    }

    public void setMovieDuration(int movieDuration){
        this.movieDuration = movieDuration;
    }

    public int getMovieDuration(){
        return movieDuration;
    }
}
