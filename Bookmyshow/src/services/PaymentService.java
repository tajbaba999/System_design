package services;

public class PaymentService {
    public boolean processPayment(double amount){
        System.out.println("💳 Processing payment of ₹" + amount + "...");
        return true;
    }
}
