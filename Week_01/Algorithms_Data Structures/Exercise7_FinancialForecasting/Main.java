public class Main {
    public static void main(String[] args) {
        double principal = 10000;
        double growthRate = 0.08; // 8%
        int years = 5;

        System.out.println("Recursive Forecast:");
        System.out.println("Future Value = " + Forecast.futureValueRecursive(principal, growthRate, years));

        System.out.println("\nTail-Recursive Forecast:");
        System.out.println("Future Value = " + Forecast.futureValueTailRecursive(principal, growthRate, years));

        System.out.println("\nIterative Forecast:");
        System.out.println("Future Value = " + Forecast.futureValueIterative(principal, growthRate, years));
    }
}
