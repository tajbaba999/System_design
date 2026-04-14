package Models;

import java.util.UUID;

public class Ride {
    private UUID id;
    private Rider rider;
    private Driver driver;
    private Location source;
    private Location destination;
    private double fair;
    private RideStatus status;
    private VechileType vechileType;

    public Ride(UUID uuid, Rider rider, Location source, Location destination, VechileType vechileType){
        this.id = uuid;
        this.rider = rider;
        this.source = source;
        this.destination = destination;
        this.vechileType = vechileType;
        this.status = RideStatus.REQUESTED;
    }
    public void assignDriver(Driver driver){
        this.driver = driver;
        this.status = RideStatus.ACCEPTED;
    }
    public String getDriver(){
        return driver.toString();
    }
    public void startRide(){
        this.status = RideStatus.IN_PROGRESS;
    }
    public void completedRide(){
        this.status = RideStatus.COMPLETED;
    }
    public boolean cancelRide(){
        if(status == RideStatus.IN_PROGRESS || status == RideStatus.ACCEPTED){
            status = RideStatus.CANCLLED;
            return true;
        }
        return  false;
    }
    public void setFair(double fair){
        this.fair  = fair;
    }
    public  double getFair(){
        return fair;
    }
    public  Location getSource(){ return source; }
    public  Location getDestination() { return  destination; }
    public VechileType getVehicleType() { return vechileType; }
}
