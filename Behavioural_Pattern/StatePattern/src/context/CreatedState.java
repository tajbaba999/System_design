package context;

import state.Order;

public class CreatedState implements  OrderState{

    @Override
    public void next(Order order) {
        order.setState(new PaidState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order Created");
    }
}
