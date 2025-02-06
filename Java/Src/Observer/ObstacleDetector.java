package observer;

public class ObstacleDetector implements Sensor {
    @Override
    public void detectObstacle() {
        System.out.println("Obstacle detected! Sending alert...");
    }
}
