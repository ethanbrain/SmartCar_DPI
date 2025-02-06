from car.car import Car
from car.moving_state import MovingState
from car.stopping_state import StoppingState
from car.stopped_state import StoppedState
from strategy.aggressive_strategy import AggressiveStrategy
from strategy.cautious_strategy import CautiousStrategy
from observer.obstacle_detector import ObstacleDetector
from singleton.navigation_system import NavigationSystem


# Test Car State Pattern
my_car = Car()
my_car.set_state(MovingState())
my_car.perform_state_action()

my_car.set_state(StoppingState())
my_car.perform_state_action()

my_car.set_state(StoppedState())
my_car.perform_state_action()

# Test Strategy Pattern
aggressive = AggressiveStrategy()
cautious = CautiousStrategy()
aggressive.execute()
cautious.execute()

# Test Observer Pattern
detector = ObstacleDetector()
detector.detect_obstacle()

# Test Singleton Pattern
nav = NavigationSystem()
nav.navigate("Central Park")
