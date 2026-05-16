import Adapter.PaypalAdapter;
import Adapter.StripeAdapter;
import gateway.StripeGateway;
import processor.PaymentProcessor;
import processor.PaymentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentProcessor stripeProcessor = new StripeAdapter();
        PaymentService paymentServicestripe = new PaymentService(stripeProcessor);

        PaymentProcessor paypalProcessor = new PaypalAdapter();
        PaymentService paymentServicepaypal = new PaymentService(paypalProcessor);

        paymentServicestripe.payment(5000.00);
        paymentServicepaypal.payment(3000);
    }
}