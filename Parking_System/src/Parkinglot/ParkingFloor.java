package Parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> spots;
    private int floorNumber;

    public ParkingFloor(int floorNumber, int numOfCarSpots, int numOfBikeSpots){
        this.floorNumber = floorNumber;
        this.spots = new ArrayList<>();

        for (int i = 0; i < numOfCarSpots; i++) {
            this.spots.add(new CarParkingSpot(i + 1));  // Add car spots (using CarParkingSpot)
        }

        // Add spots for bikes
        for (int i = numOfCarSpots; i < numOfCarSpots + numOfBikeSpots; i++)
            this.spots.add(new BikeParkingSpot(i + 1));  // Add bike spots (using BikeParkingSpot)
    }


    public ParkingSpot findAvaliableSpot(String vehicelType){
        for (ParkingSpot spot : spots){
            if(!spot.isOccupied() && spot.getSpotType().equalsIgnoreCase(vehicelType)){
                return spot;
            }
        }
        return null;
    }

    public List<ParkingSpot> getParkingSpot(){
        return spots;
    }
}
