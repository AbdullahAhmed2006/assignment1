public class CostPriceCalculator {
    public static void main(String[] args) {
        // Total number of items
        int totalItems = 15;
        
        // Total profit percentage
        double profitPercentage = 20.0;
        
        // Total selling price of all items
        double totalSellingPrice = 10000; // Example value; you can set this as needed
        
        // Calculate the total cost price of all items
        double totalCostPrice = totalSellingPrice / (1 + profitPercentage / 100);
        
        // Calculate the cost price of one item
        double costPricePerItem = totalCostPrice / totalItems;
        
        // Display the result
        System.out.println("Total Selling Price of 15 items: " + totalSellingPrice);
        System.out.println("Total Cost Price of 15 items: " + totalCostPrice);
        System.out.println("Cost Price of one item: " + costPricePerItem);
    }
}
