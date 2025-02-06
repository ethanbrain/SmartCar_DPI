from car_state import CarState

class StoppingState(CarState):
    def handle_state(self, car):
        print("The car is STOPPING.")
