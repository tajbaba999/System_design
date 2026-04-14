import Models.*;
import Utils.IdGenerator;
import service.RideManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RideManager rideManager = RideManager.getInstance();

        Driver d1 = new Driver(
                IdGenerator.generateId(),
                "Driver1",
                "Male",
                9876543210L,
                new Location(0, 0),
                VechileType.CAR
        );

        Driver d2 = new Driver(
                IdGenerator.generateId(),
                "Driver2",
                "Male",
                9123456780L,
                new Location(2, 2),
                VechileType.BIKE
        );

        Driver d3 = new Driver(
                IdGenerator.generateId(),
                "Driver3",
                "Male",
                9988776655L,
                new Location(1, 1),
                VechileType.CAR
        );

        rideManager.addDriver(d1);
        rideManager.addDriver(d2);
        rideManager.addDriver(d3);

        Rider rider = new Rider(
                IdGenerator.generateId(),
                "Taj",
                "Male",
                9000000000L,
                new Location(1, 0)
        );

        Ride ride = rideManager.requestRider(rider, new Location(1, 0), new Location(5, 5), VechileType.CAR);

        if(ride != null){
            System.out.println("Ride accepted by driver!");
            System.out.println(ride.getDriver().toString());
            ride.startRide();
            System.out.println("Ride started...");
            ride.completedRide();
            System.out.println("Ride completed!");
            System.out.println("Fare: " + ride.getFair());

        }else {
            System.out.println("No driver available or ride not accepted.");
        }
    }
}