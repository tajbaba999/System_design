package strategy;

import Models.Ride;

public interface FareStrategy {
    double calcualteFare(Ride ride);
}
