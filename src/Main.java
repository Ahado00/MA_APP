import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create example products
        Product laptop = new Product("Laptop", 1200.0, 20, 5);
        Product smartphone = new Product("Smartphone", 800.0, 10, 3);

        // Display product details
        System.out.println(laptop);
        System.out.println("----------------------------");
        System.out.println(smartphone);
        System.out.println("----------------------------");

        // Ask user for average daily sales
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter average daily sales for " + laptop.getName() + ": ");
        int laptopDailySales = scanner.nextInt();
        System.out.print("Enter average daily sales for " + smartphone.getName() + ": ");
        int smartphoneDailySales = scanner.nextInt();

        // Predict stock depletion and restocking
        StockPredictor.predictStockDepletion(laptop, laptopDailySales);
        StockPredictor.predictStockDepletion(smartphone, smartphoneDailySales);

        // Create OrderManager and process orders
        OrderManager orderManager = new OrderManager();

        // Simulate some orders
        Order order1 = new Order("Alice", laptop.getProductId(), 2);
        Order order2 = new Order("Bob", smartphone.getProductId(), 1);

        orderManager.processOrder(order1);
        orderManager.processOrder(order2);

        // Shutdown order manager (after all tasks complete)
        orderManager.shutdown();
    }
}
