import car.*;
import strategy.*;
import observer.*;
import singleton.*;

public class Main {
    public static void main(String[] args) {
        // Test Car State Pattern
        Car myCar = new Car();
        myCar.setState(new MovingState());
        myCar.performStateAction();

        myCar.setState(new StoppingState());
        myCar.performStateAction();

        myCar.setState(new StoppedState());
        myCar.performStateAction();

        // Test Strategy Pattern
        DrivingStrategy aggressive = new AggressiveStrategy();
        DrivingStrategy cautious = new CautiousStrategy();
        aggressive.execute();
        cautious.execute();

        // Test Observer Pattern
        Sensor detector = new ObstacleDetector();
        detector.detectObstacle();

        // Test Singleton Pattern
        NavigationSystem nav = NavigationSystem.getInstance();
        nav.navigate("Central Park");
    }
}
