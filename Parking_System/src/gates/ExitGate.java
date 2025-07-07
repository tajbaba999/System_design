package gates;

import Parkinglot.ParkingLot;
import Parkinglot.ParkingSpot;
import Vehicles.Vehicle;
import payment.PaymentService;

public class ExitGate {
    private ParkingLot parkingLot;
    private PaymentService paymentService;

    public ExitGate(ParkingLot parkingLot, PaymentService paymentService){
        this.parkingLot = parkingLot;
        this.paymentService = paymentService;
    }

    public void processExit(int spotNumber, int hoursStayed){
        ParkingSpot spot = parkingLot.getSpotByNumber(spotNumber);

        if(spot == null || !spot.isOccupied()){
            System.out.println("Invalid or vacent spot!");
            return;
        }


        Vehicle vehicle = spot.getVehicle();
        if(vehicle == null){
            System.out.println("No vechile found in the spot!");
            return;
        }

        double fee = vehicle.calculateFee(hoursStayed);

        paymentService.processPayment(fee);


        parkingLot.vacateSpot(spot, vehicle);
        System.out.println("Spot vacted sucessfully!");
    }
}
