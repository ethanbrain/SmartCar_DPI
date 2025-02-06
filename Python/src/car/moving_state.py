from car_state import CarState

class MovingState(CarState):
    def handle_state(self, car):
        print("The car is now MOVING.")
