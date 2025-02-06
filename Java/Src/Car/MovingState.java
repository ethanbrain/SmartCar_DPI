package car;

public class MovingState implements CarState {
    @Override
    public void handleState(Car car) {
        System.out.println("The car is now MOVING.");
    }
}