import Parkinglot.ParkingFloor;
import Parkinglot.ParkingLot;
import Parkinglot.ParkingSpot;
import gates.EntranceGate;
import gates.ExitGate;
import payment.PaymentService;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ParkingFloor floor = new ParkingFloor(1, 2,2);
        ArrayList<ParkingFloor> floors = new ArrayList<>();
        floors.add(floor);
        ParkingLot parkingLot = new ParkingLot(floors);

        PaymentService paymentService = new PaymentService(scanner);

        EntranceGate entranceGate = new EntranceGate(parkingLot);
        ExitGate exitGate = new ExitGate(parkingLot, paymentService);


        System.out.println("\n=========================================");
        System.out.println("   Welcome to the Parking Lot System!   ");
        System.out.println("=========================================");


        boolean exit = false;
        while (!exit){
            showMenu();

            int choice = getUserChoice(scanner);
                switch (choice){
                    case 1:
                        parkVechile(entranceGate);
                        break;
                    case 2:
                        vacateSpot(exitGate, scanner);
                        break;
                    case 3:
                        exit = true;
                        System.out.println("Thank you for using the Parking Lot System!");
                        break;

                    default:
                        System.out.println("Invalid option! Please try again.");
                        break;
                }
        }

    }
   private static void showMenu() {
        System.out.println("\n******************************************************");
        System.out.println("Please choose an option from below:");
        System.out.println("1. Park a vehicle");
        System.out.println("2. Vacate a vehicle spot");
        System.out.println("3. Exit the system");
        System.out.println("******************************************************");
    }

    private static int getUserChoice(Scanner scanner){
        return scanner.nextInt();
    }

    private static void parkVechile(EntranceGate entranceGate){
        entranceGate.processEntrance();
    }

    private static void vacateSpot(ExitGate exitGate, Scanner scanner){
        System.out.println("Enter the spot number to vacate: ");
        int spotNumber = scanner.nextInt();
        System.out.println("Enter the number of hours the vehicle stayed: ");
        int hoursStayed = scanner.nextInt();
        exitGate.processExit(spotNumber, hoursStayed);
    }
}