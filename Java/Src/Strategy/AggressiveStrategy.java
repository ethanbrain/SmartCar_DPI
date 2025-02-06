package strategy;

public class AggressiveStrategy implements DrivingStrategy {
    @Override
    public void execute() {
        System.out.println("Driving aggressively.");
    }
}
