import DriveStrategy.DriveStrategy;
import DriveStrategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDriveStrategy());

    }
}
