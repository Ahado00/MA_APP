public class StockPredictor {
    public static void predictStockDepletion(Product product, int averageDailySales) {
        int daysUntilStockOut = product.getStockLevel() / averageDailySales;
        String restockSuggestion = "Low: Immediate restocking required.";

        if (daysUntilStockOut > 10) {
            restockSuggestion = "High: Stock is in a good range.";
        } else if (daysUntilStockOut > 5) {
            restockSuggestion = "Moderate: Consider restocking soon.";
        }

        System.out.println("Stock Prediction for " + product.getName() + ":");
        System.out.println("Days until stock out: " + daysUntilStockOut);
        System.out.println("Restock Suggestion: " + restockSuggestion);
    }
}
