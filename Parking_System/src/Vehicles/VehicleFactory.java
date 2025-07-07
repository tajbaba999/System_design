package Vehicles;

public class VehicleFactory {
    public  static Vehicle createVehicle(String vehicelType, String licensePlate){
        if(vehicelType.equalsIgnoreCase("Car")){
            return new CarVehicle(licensePlate);
        } else if (vehicelType.equalsIgnoreCase("Bike")) {
            return new BikeVehicle(licensePlate);
        }
        return null;
    }
}
