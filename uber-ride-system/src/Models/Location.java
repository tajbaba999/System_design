package Models;

import strategy.DistanceStrategy;
import strategy.EuclideanDistance;

public class Location {
    private int x, y;
    private DistanceStrategy strategy;

    public Location(int x, int y){
        this.x = x;
        this.y = y;
        this.strategy = new EuclideanDistance();
    }

    public double distance(Location other){
        return strategy.calucateDistance(this, other);
    }

    public void updateLocation(Location location){
        this.x= location.x;
        this.y = location.y;
    }

    public Location getLocation(){
        return this;
    }

    public  int getX(){return  x; }
    public  int getY(){return  y; }
}
