package context;

import state.Order;

public interface OrderState {
        void next(Order order);
        void printStatus();
}
