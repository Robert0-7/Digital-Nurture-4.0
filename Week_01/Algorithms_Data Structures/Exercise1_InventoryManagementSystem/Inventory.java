import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> inventory = new HashMap<>();

    // Add product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update product
    public boolean updateProduct(int productId, String name, int quantity, double price) {
        Product p = inventory.get(productId);
        if (p != null) {
            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);
            return true;
        }
        return false;
    }

    // Delete product
    public boolean deleteProduct(int productId) {
        return inventory.remove(productId) != null;
    }

    // Display all products
    public void showInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
