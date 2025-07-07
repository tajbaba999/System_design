package Vehicles;

import java.lang.*;

public  abstract  class Vehicle{
    private String licensePlate;
    private String vehicletype;

    public Vehicle(String licensePlate, String vehicletype){
        this.licensePlate = licensePlate;
        this.vehicletype = vehicletype;
    }

    public String getVehicletype() {
            return vehicletype;
    }

    public String getLicensePlate() {
            return licensePlate;
    }

    public abstract double calculateFee(int hoursStayed);

}