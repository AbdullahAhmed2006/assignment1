import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first positive number (base): ");
        double base = scanner.nextDouble();
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second positive number (exponent): ");
        double exponent = scanner.nextDouble();
        
        // Calculate the power using Math.pow()
        double result = Math.pow(base, exponent);
        
        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
