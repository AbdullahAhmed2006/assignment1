import java.util.Scanner;

public class CurrencyCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the amount (in hundreds)
        System.out.print("Enter the amount to be withdrawn (in hundreds): ");
        int amountInHundreds = scanner.nextInt();
        
        // Convert amount from hundreds to actual amount
        int amount = amountInHundreds * 100;
        
        // Denominations
        int[] denominations = {100, 50, 10};
        
        // Calculate the number of notes for each denomination
        int[] notes = new int[denominations.length];
        for (int i = 0; i < denominations.length; i++) {
            notes[i] = amount / denominations[i];
            amount %= denominations[i];
        }
        
        // Display the results
        System.out.println("Number of 100 currency notes: " + notes[0]);
        System.out.println("Number of 50 currency notes: " + notes[1]);
        System.out.println("Number of 10 currency notes: " + notes[2]);
        
        // Close the scanner
        scanner.close();
    }
}
