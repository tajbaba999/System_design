package Vehicles;

public class OtherVechile extends Vehicle{
    private final static double RATE = 10.0;

    public OtherVechile(String licensePlate, String vehicletype) {
        super(licensePlate, vehicletype);
    }

    @Override
    public double calculateFee(int hoursStayed) {
        return hoursStayed * RATE;
    }
}
