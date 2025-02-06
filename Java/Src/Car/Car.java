package car;

public class Car {
    private CarState state;

    public void setState(CarState state) {
        this.state = state;
    }

    public void performStateAction() {
        if (state != null) {
            state.handleState(this);
        } else {
            System.out.println("Car state is undefined.");
        }
    }
}
