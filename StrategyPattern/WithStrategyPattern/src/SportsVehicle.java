import DriveStrategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportDriveStrategy());
    }
}
