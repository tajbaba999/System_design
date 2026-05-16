Reference Article:
https://medium.com/@thecodebean/builder-design-pattern-implementation-in-java-6adc6fd99ee0

## Builder Pattern — Quick Notes

- Creational Design Pattern
- Used to create complex objects step-by-step
- Solves constructor explosion problem
- Supports optional parameters cleanly
- Improves readability using method chaining

## How This User Example Works

- `User` → main object being created
- `Builder` → helper class that builds User object
- `setName()`, `setAge()` → configure required/optional fields
- `return this` → enables method chaining
- `build()` → creates final User object
- Private constructor ensures object creation only through Builder