public class TestLogger {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        System.out.println(logger1.hashCode());

        Logger logger2 = Logger.getInstance();
        System.out.println(logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("Both Loggers are same. Singleton works!");
        }
        else {
            System.out.println("Logger instances are different. Singleton failed!");
        }
    }
}
