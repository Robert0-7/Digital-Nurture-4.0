public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(101, "Robert", 250.0),
                new Order(102, "Satyam ", 100.0),
                new Order(103, "Yath", 450.0),
                new Order(104, "Sagar", 300.0)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) System.out.println(o);

        // Uncomment for Bubble Sort
        // SortUtil.bubbleSort(orders);

        // Uncomment for Quick Sort
        SortUtil.quickSort(orders, 0, orders.length - 1);

        System.out.println("\nSorted Orders by Total Price:");
        for (Order o : orders) System.out.println(o);
    }
}
