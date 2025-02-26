import java.util.concurrent.*;
public class OrderManager {
    private ExecutorService executorService;

    public OrderManager() {
        executorService = Executors.newFixedThreadPool(10); // Handle up to 10 orders simultaneously
    }

    public void processOrder(Order order) {

        // Combined code from both branches
        System.out.println("this is branch2");

        executorService.submit(() -> {
            try {
                System.out.println("Processing order: " + order.getOrderId());
                // Simulate order processing
                Thread.sleep(2000); // Simulate time delay in order processing
                order.setOrderStatus(Order.OrderStatus.SHIPPED);
                System.out.println("Order " + order.getOrderId() + " status: " + order.getOrderStatus());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    // Method to shutdown the executor service after all tasks are complete
    public void shutdown() {
        executorService.shutdown();
    }
}
