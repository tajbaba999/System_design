package state;

import context.CreatedState;
import context.OrderState;

public class Order {
    private OrderState state;

    public Order(){
        state = new CreatedState();
    }

    public void setState(OrderState state){
        this.state = state;
    }

    public void nextState(){
        state.next(this);
    }

    public void printStatus(){
        state.printStatus();
    }
}
