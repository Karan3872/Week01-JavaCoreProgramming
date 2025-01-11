import java.util.Scanner;

// Creating a class Abundant to check if a number is an Abundant number

public class AbundantNumber 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare variables:
        // `number` to store the input number
        // `sum` to store the sum of the divisors of the number
        int number, sum = 0;

        // Ask the user to input a number to check if it's an Abundant number
        System.out.print("Enter an integer: ");
        number = scanner.nextInt();  // Read the number input by the user

        // Start a for loop to find the divisors of the number (excluding the number itself)
        for (int i = 1; i < number; i++) {
            // Check if `i` is a divisor of the number
            if (number % i == 0) {
                // If `i` divides the number, add it to the sum of divisors
                sum += i;
            }
        }

        // After finding all divisors, check if the sum of divisors is greater than the original number
        if (sum > number) {
            // If sum of divisors is greater than the number, it's an Abundant number
            System.out.println(number + " is an Abundant number.");
        } else {
            // Otherwise, it's not an Abundant number
            System.out.println(number + " is not an Abundant number.");
        }

        // Close the scanner to release the resources after input is completed
        scanner.close();
    }
}