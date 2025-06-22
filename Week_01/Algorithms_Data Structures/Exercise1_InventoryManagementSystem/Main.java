public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 10, 75000);
        Product p2 = new Product(102, "Mouse", 50, 500);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.showInventory();

        System.out.println("\nUpdating Product 101...");
        inventory.updateProduct(101, "Laptop Pro", 8, 80000);

        inventory.showInventory();

        System.out.println("\nDeleting Product 102...");
        inventory.deleteProduct(102);

        inventory.showInventory();
    }
}
