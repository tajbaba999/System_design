package gates;

import Parkinglot.ParkingFloor;
import Parkinglot.ParkingLot;
import Parkinglot.ParkingSpot;
import Vehicles.Vehicle;
import Vehicles.VehicleFactory;

import java.util.List;
import java.util.Scanner;

public class EntranceGate {
    private ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }

    public void processEntrance(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the vehicle license plate: ");
        String licenseplate = scanner.next();
        System.out.println("Enter the vehicle type (Car or Bike): ");
        String vehicleType = scanner.next();

        Vehicle vehicle = VehicleFactory.createVehicle(vehicleType, licenseplate);
        if(vehicle  == null){
            System.out.println("Invalid vehicle type! Only Car and Bike are allowed.");
            return;
        }


        ParkingSpot spot = parkingLot.parkVechile(vehicle);
        if(spot != null){
            System.out.println("Vehicle parked successfully in spot: " + spot.getSpotNumber());
        }else{
            System.out.println("No available spots for the vehicle type.");
        }
    }

}
