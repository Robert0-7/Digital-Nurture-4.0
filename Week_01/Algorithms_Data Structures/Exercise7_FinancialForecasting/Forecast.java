public class Forecast {

    // Recursive method to calculate future value
    public static double futureValueRecursive(double principal, double rate, int years) {
        if (years == 0)
            return principal;
        return futureValueRecursive(principal, rate, years - 1) * (1 + rate);
    }

    // Optimized: Tail recursion using helper
    public static double futureValueTailRecursive(double principal, double rate, int years) {
        return helper(principal, rate, years);
    }

    private static double helper(double value, double rate, int years) {
        if (years == 0)
            return value;
        return helper(value * (1 + rate), rate, years - 1);
    }

    // More optimal: Iterative approach (to compare)
    public static double futureValueIterative(double principal, double rate, int years) {
        double value = principal;
        for (int i = 0; i < years; i++) {
            value *= (1 + rate);
        }
        return value;
    }
}
