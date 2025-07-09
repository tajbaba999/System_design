//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle goodsvehicle = new GoodsVehicle();
        goodsvehicle.drive();
        Vehicle passenger = new PassengerVehicle();
        passenger.drive();
        Vehicle sportsVehicle = new SportVehicle();
        sportsVehicle.drive();

    }
}