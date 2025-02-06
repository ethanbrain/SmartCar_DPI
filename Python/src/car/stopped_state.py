from car_state import CarState

class StoppedState(CarState):
    def handle_state(self, car):
        print("The car is now STOPPED.")
