package Parkinglot;

import Vehicles.Vehicle;

import java.util.List;
import java.util.Vector;

public class ParkingLot {
    private List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors){
        this.floors = floors;
    }

    public ParkingSpot findAvailableSpot(String vechileType){
        for(ParkingFloor floor : floors){
            ParkingSpot spot = floor.findAvaliableSpot(vechileType);
            if(spot != null){
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVechile(Vehicle vehicle){
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicletype());
        if (spot != null) {
            spot.parkVehicle(vehicle); // Mark the spot as occupied
            System.out.println("Vehicle parked successfully in spot: " + spot.getSpotNumber());
            return spot;
        }
        System.out.println("No parking spots available for " + vehicle.getVehicletype() + "!");
        return null;
    }

    public void vacateSpot(ParkingSpot spot, Vehicle vehicle){
        if (spot != null && spot.isOccupied() && spot.getVehicle().equals(vehicle)){
            spot.vacate();
            System.out.println(vehicle.getVehicletype() + " vacated the spot: " + spot.getSpotNumber());
        }else {
            System.out.println("Invalid operation! Either the spot is already vacant or the vehicle does not match.");
        }
    }

    public ParkingSpot getSpotByNumber(int spotNumber){
        for(ParkingFloor floor : floors){
            for(ParkingSpot spot :floor.getParkingSpot()){
                if(spot.getSpotNumber() == spotNumber){
                    return spot;
                }
            }
        }
        return null;
    }
    public List<ParkingFloor> getFloors(){
        return floors;
    }
}
