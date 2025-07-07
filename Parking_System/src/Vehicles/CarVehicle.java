package Vehicles;

public class CarVehicle extends Vehicle{
    private static final double RATE = 10;

    public CarVehicle(String licensePlate){
        super(licensePlate, "Car");
    }

    @Override
    public double calculateFee(int hoursstayed){
        return hoursstayed * RATE;
    }
}