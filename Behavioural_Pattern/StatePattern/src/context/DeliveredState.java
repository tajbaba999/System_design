package context;

import state.Order;

public class DeliveredState implements  OrderState{
    @Override
    public void next(Order order) {
        System.out.println("Order already delivered");
    }

    @Override
    public void printStatus() {
        System.out.println("Order Delivered");
    }
}
