import java.util.UUID;

public class Product {
    private UUID productId;
    private String name;
    private double price;
    private int stockLevel;
    private int reorderThreshold;

    // Constructor
    public Product(String name, double price, int stockLevel, int reorderThreshold) {
        this.productId = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
        this.reorderThreshold = reorderThreshold;
    }

    // Getters and Setters
    public UUID getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public int getReorderThreshold() {
        return reorderThreshold;
    }

    // Method to display product details
    @Override
    public String toString() {
        return "Product ID: " + productId + "\nName: " + name + "\nPrice: $" + price +
                "\nStock Level: " + stockLevel + "\nReorder Threshold: " + reorderThreshold;
    }
}
