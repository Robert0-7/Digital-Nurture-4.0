import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "T-shirt", "Clothing"),
                new Product(103, "Book", "Education"),
                new Product(104, "Phone", "Electronics"),
                new Product(105, "Shoes", "Footwear")
        };

        // Linear search on unsorted array
        System.out.println("Linear Search: Looking for 'Phone'");
        Product result1 = SearchUtil.linearSearch(products, "Phone");
        System.out.println(result1 != null ? result1 : "Product not found");

        // Sort array by productName for binary search
        Arrays.sort(products);

        // Binary search on sorted array
        System.out.println("\nBinary Search: Looking for 'Phone'");
        Product result2 = SearchUtil.binarySearch(products, "Phone");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
