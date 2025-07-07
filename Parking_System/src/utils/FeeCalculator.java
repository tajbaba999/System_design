package utils;

import Vehicles.Vehicle;

public class FeeCalculator {
    public static double calulateFee(int hoursstayed, Vehicle vehicle){
        return vehicle.calculateFee(hoursstayed);
    }
}
