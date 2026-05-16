package context;

import state.Order;

public class ShippedState implements OrderState{
    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order Shipped");
    }
}
