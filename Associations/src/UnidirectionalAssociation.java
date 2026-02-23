class PaymentGateway{
    public void porcess(){
        System.out.println("Processing payment ...");
    }
}

class Order{
   private PaymentGateway gateway;

   Order(PaymentGateway gateway){
       this.gateway = gateway;
   }
   public  void  checkout(){
       gateway.porcess();
   }
}

public class UnidirectionalAssociation {
    public static void main(String[] args) {
        PaymentGateway pg = new PaymentGateway();
        Order order = new Order(pg);
        order.checkout();
    }
}
