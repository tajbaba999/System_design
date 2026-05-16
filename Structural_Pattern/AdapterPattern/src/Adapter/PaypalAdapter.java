package Adapter;

import gateway.PaypalGateway;
import processor.PaymentProcessor;

public class PaypalAdapter implements PaymentProcessor {
    private PaypalGateway paypalGateway;

    public PaypalAdapter(){
        paypalGateway = new PaypalGateway();
    }
    @Override
    public void pay(double amount) {
        paypalGateway.makePayment(amount);
    }
}
