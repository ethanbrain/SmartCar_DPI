package strategy;

public class CautiousStrategy implements DrivingStrategy {
    @Override
    public void execute() {
        System.out.println("Driving cautiously.");
    }
}
