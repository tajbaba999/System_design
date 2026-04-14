package strategy;

import Models.Location;

public class EuclideanDistance implements DistanceStrategy{
    @Override
    public double calucateDistance(Location source, Location distance) {
        return Math.sqrt(Math.sqrt(distance.getX() - source.getX()) + Math.sqrt(distance.getY() - source.getY()));
    }
}
