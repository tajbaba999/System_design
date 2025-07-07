package payment;

import java.util.Scanner;

public class PaymentService {
    private Scanner scanner;

    public PaymentService(Scanner scanner){
        this.scanner = scanner;
    }

    public void processPayment(double fee){
        choosePaymentmethod(fee);
    }

    public void choosePaymentmethod(double fee){
        System.out.println("Total fee: " + fee);
        System.out.println("Choose payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Cash");
        System.out.println("3. UPI");

        int choice = scanner.nextInt();

        Payment payment;
        switch (choice){
            case 1:
                payment = new Payment(fee, new CreditCardPayment());
                break;
            case 2:
                payment = new Payment(fee, new CashPayment());
                break;
            case 3:
                payment = new Payment(fee, new UPIPayment());
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Cash payment.");
                payment = new Payment(fee, new CashPayment());
                break;
        }

        payment.processPayment();
    }
}
