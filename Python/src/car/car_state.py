from abc import ABC, abstractmethod

class CarState(ABC):
    @abstractmethod
    def handle_state(self, car):
        pass
