class Car:
    def __init__(self):
        self.state = None

    def set_state(self, state):
        self.state = state

    def perform_state_action(self):
        if self.state:
            self.state.handle_state(self)
        else:
            print("Car state is undefined.")
