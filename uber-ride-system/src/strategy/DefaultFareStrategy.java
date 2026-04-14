package strategy;

import Models.Ride;

public class DefaultFareStrategy implements  FareStrategy{
    @Override
    public double calcualteFare(Ride ride) {
        double distance = ride.getSource().distance(ride.getDestination());
        return  distance * 10;
    }
}
