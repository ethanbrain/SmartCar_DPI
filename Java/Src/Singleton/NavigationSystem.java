package singleton;

public class NavigationSystem {
    private static volatile NavigationSystem instance;
    
    private NavigationSystem() {}

    public static NavigationSystem getInstance() {
        if (instance == null) {
            synchronized (NavigationSystem.class) {
                if (instance == null) {
                    instance = new NavigationSystem();
                }
            }
        }
        return instance;
    }

    public void navigate(String destination) {
        System.out.println("Navigating to " + destination);
    }
}
