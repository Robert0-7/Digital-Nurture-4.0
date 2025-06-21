public class Logger {

    // Step 1: Create a private static instance of the class
    private static Logger instance;

    // Step 2: Make the constructor private so it can't be instantiated outside
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Provide a public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // Lazy initialization
        }
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
