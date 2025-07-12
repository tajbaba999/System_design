package models.theatre;

import enums.City;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    int theatreId;
    String address;
    String theatrename;
    City city;
    List<Screen> screen = new ArrayList<>();
    List<Show> shows = new ArrayList<>();

    public int getTheatreId(){
        return theatreId;
    }

    public void setScreen(List<Screen> screen) {
        this.screen = screen;
    }
    public List<Screen> getScreen(){
        return screen;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getTheatrename(){
        return theatrename;
    }

    public void setTheatrename(String theatrename) {
        this.theatrename = theatrename;
    }
    public City getCity(){
        return city;
    }
    public void setCity(City city){
        this.city = city;
    }
    public List<Show> getShows(){
        return  shows;
    }
    public void setShows(List<Show>  shows){
        this.shows = shows;
    }
}
