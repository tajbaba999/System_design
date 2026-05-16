Reference Article:
https://medium.com/@ahmettemelkundupoglu/mastering-the-state-design-pattern-in-java-a-detailed-guide-with-examples-4544a975a914

Video linke : https://www.youtube.com/watch?v=abX4xzaAsoc
## State Pattern — Quick Notes

- Behavioral Design Pattern
- Used when object behavior changes based on internal state
- Removes huge if-else or switch-case logic
- Each state has separate class and behavior
- Common in workflows, order lifecycle, ATM, Uber rides

## How This Order Example Works

- `Order` → context object whose behavior changes
- `OrderState` → common interface for all states
- `CreatedState`, `PaidState` → individual state behaviors
- `nextState()` → moves object to next state
- Current state object controls behavior dynamically