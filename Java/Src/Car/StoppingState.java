package car;

public class StoppingState implements CarState {
    @Override
    public void handleState(Car car) {
        System.out.println("The car is STOPPING.");
    }
}
