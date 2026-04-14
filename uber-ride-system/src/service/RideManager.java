package service;

import Models.*;
import Utils.IdGenerator;
import strategy.DefaultFareStrategy;

import java.util.ArrayList;
import java.util.List;

public class RideManager {

    private static RideManager instance;
    private List<Driver> drivers;

    private  DefaultFareStrategy fareStrategy = new DefaultFareStrategy();

    private RideManager(){
        drivers = new ArrayList<>();
    }
    public static RideManager getInstance(){
        if(instance == null){
            instance = new RideManager();
        }
        return instance;
    }
    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    public Ride requestRider(Rider rider, Location src, Location dest, VechileType vechileType){
        Ride ride = new Ride(IdGenerator.generateId(), rider, src, dest, vechileType);

        double fare = fareStrategy.calcualteFare(ride);

        ride.setFair(fare);

        Driver driver = findDriver(src, vechileType);

        if(driver != null){
            boolean accepted = driver.acceptRide(ride);

            if(accepted){
                ride.assignDriver(driver);
                driver.setAvaliable(false);
            }
        }
        return ride;
    }
    public Driver findDriver(Location src, VechileType vechileType){

        Driver nearest = null;
        double minDist = Double.MAX_VALUE;

        for (Driver d : drivers){
            if(d.isAvailable() && d.getVechileType() == vechileType){
                double dst = d.getLocation().distance(src);
                    minDist = Math.min(minDist, dst);
                    nearest = d;
            }
        }
        return nearest;
    }
}
