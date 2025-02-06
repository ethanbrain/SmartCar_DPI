class NavigationSystem:
    """Singleton Navigation System"""
    _instance = None

    def __new__(cls):
        if not cls._instance:
            cls._instance = super(NavigationSystem, cls).__new__(cls)
        return cls._instance

    def navigate(self, destination):
        print(f"Navigating to {destination}")

# Usage Example
if __name__ == "__main__":
    nav1 = NavigationSystem()
    nav2 = NavigationSystem()
    print(nav1 is nav2)  # True, single instance
    nav1.navigate("Central Park")
