Reference Article:  
https://medium.com/@thecodebean/adapter-design-pattern-implementation-in-java-72f4a19af3c1

## Adapter Pattern — Quick Notes

- Structural Design Pattern
- Used to connect incompatible systems/interfaces
- Acts like a translator or wrapper
- Commonly used in third-party SDK integrations
- Helps achieve loose coupling and clean extensible code

## How This Payment Example Works

- `PaymentProcessor` → common interface our application understands
- `StripeGateway` / `PaypalGateway` → third-party SDK classes
- `StripeAdapter` / `PaypalAdapter` → convert SDK methods into `pay()`
- `PaymentService` talks only to `PaymentProcessor`
- Easy to add new providers without changing business logic