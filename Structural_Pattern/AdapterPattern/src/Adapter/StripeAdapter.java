package Adapter;

import gateway.StripeGateway;
import processor.PaymentProcessor;

public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(){
        stripeGateway = new StripeGateway();
    }
    @Override
    public void pay(double amount) {
        stripeGateway.makePayment(amount);
    }
}
