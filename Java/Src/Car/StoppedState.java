package car;

public class StoppedState implements CarState {
    @Override
    public void handleState(Car car) {
        System.out.println("The car is now STOPPED.");
    }
}
