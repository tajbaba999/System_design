package processor;

public class PaymentService {
    private PaymentProcessor paymentProcessor;
    public PaymentService(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }
    public void payment(double amount){
        paymentProcessor.pay(amount);
    }
}
