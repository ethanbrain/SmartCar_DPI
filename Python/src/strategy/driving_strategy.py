from abc import ABC, abstractmethod

class DrivingStrategy(ABC):
    @abstractmethod
    def execute(self):
        pass
