public class DigitSumCalculator {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;
        
        // Calculate the sum of digits
        while (number > 0) {
            sum += number % 10; // Get the last digit and add to sum
            number /= 10; // Remove the last digit
        }
        
        // Display the result
        System.out.println("Sum of the digits: " + sum);
    }
}
