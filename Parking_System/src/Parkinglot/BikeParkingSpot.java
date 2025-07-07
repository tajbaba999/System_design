package Parkinglot;

import Vehicles.Vehicle;

public class BikeParkingSpot extends ParkingSpot{

    BikeParkingSpot(int spotNumber) {
        super(spotNumber, "Bike");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Bike".equalsIgnoreCase(vehicle.getVehicletype());
    }
}
