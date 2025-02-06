from sensor import Sensor

class ObstacleDetector(Sensor):
    def detect_obstacle(self):
        print("Obstacle detected! Sending alert...")
