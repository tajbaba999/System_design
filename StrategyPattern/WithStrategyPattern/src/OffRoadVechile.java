import DriveStrategy.DriveStrategy;
import DriveStrategy.NormalDriveStrategy;

public class OffRoadVechile extends Vehicle{
    OffRoadVechile() {
        super(new NormalDriveStrategy());
    }
}
