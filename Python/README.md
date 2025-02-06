# 🚗 Self-Driving Car Simulation (Python)
## 📌 Overview
A self-driving car simulation using **State, Strategy, Observer, and Singleton** patterns.

## 🛠 Implemented Design Patterns
- **State Pattern** → Manages car states dynamically.
- **Strategy Pattern** → Chooses driving behavior.
- **Observer Pattern** → Sensors detect obstacles & notify the car.
- **Singleton Pattern** → Ensures a single instance of the **Navigation System**.

## 🚀 Usage Example
```python
from moving_state import MovingState
from car import Car

my_car = Car()
my_car.set_state(MovingState())
my_car.perform_state_action()

from singleton.navigation_system import NavigationSystem
nav = NavigationSystem()
nav.navigate("Central Park")
