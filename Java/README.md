# 🚗 Self-Driving Car Simulation (Java)
## 📌 Overview
This project simulates a **self-driving car** using multiple **design patterns**.

## 🛠 Implemented Design Patterns
- **State Pattern** → Manages car states (Moving, Stopping, Stopped).
- **Strategy Pattern** → Chooses driving strategy based on conditions.
- **Observer Pattern** → Sensors detect obstacles & notify the car.
- **Singleton Pattern** → Ensures a single instance of the **Navigation System**.

## 🚀 Usage Example
```java
Car myCar = new Car();
myCar.setState(new MovingState());
myCar.performStateAction();

NavigationSystem nav = NavigationSystem.getInstance();
nav.navigate("Downtown");
