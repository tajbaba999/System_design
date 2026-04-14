package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    UUID id;
    String name;
    long phnumber;
    String gender;
    Location location;
    double rating;
    int  completedRides;
    List<Ride> rides;

    User(UUID id, String name, String gender, long phnumber, Location location){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phnumber = phnumber;
        this.location = location;
        this.rating = 0.0;
        this.completedRides = 0;
        this.rides = new ArrayList<>();
    }
    public List<Ride> getallRides(){
        return rides;
    }
    public  UUID getUserid(){
        return id;
    }
    public  String getName(){
        return name;
    }
    public long getPhnumber(){
        return phnumber;
    }
    public String getGender(){
        return gender;
    }
    public Location getLocation(){
        return location;
    }
    public double getRating(){
        return rating;
    }
    public int getCompletedRides() {
        return completedRides;
    }
    public List<Ride> getAllRides() {
        return rides;
    }
    public void setLocation(Location location){
        this.location = location;
    }
    public void completeRide(Ride ride, double rating){
        addRide(ride);
        updateRating(rating);
    }
    public void updateRating(double newRating){
        double totalRating  = this.rating * this.completedRides;
        this.completedRides++;
        this.rating = (totalRating  + newRating)/completedRides;
    }

    private void addRide(Ride ride) {
        rides.add(ride);
    }
}