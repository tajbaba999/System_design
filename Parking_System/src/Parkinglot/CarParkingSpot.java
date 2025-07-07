package Parkinglot;

import Vehicles.Vehicle;

public class CarParkingSpot extends ParkingSpot{

    CarParkingSpot(int spotNumber) {
        super(spotNumber, "Car");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Car".equalsIgnoreCase(vehicle.getVehicletype());
    }
}
