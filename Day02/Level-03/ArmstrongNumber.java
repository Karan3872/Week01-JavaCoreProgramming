
import java.util.Scanner;

// Creating a class ArmstrongNumber to check if a number is an Armstrong number


public class ArmstrongNumber 
{
    public static void main(String[] args)
	{
        // Create a Scanner object to allow input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare the variables
        // `number` holds the user input to check for Armstrong condition
        // `sum` is used to store the sum of the cubes of the digits of the number
        // `originalNumber` stores the original input number for comparison later
        // `remainder` will store the last digit of the number
        int number, sum = 0, originalNumber, remainder;

        // Ask the user for an integer input to check if it's an Armstrong number
        System.out.print("Enter an integer: ");
        number = scanner.nextInt();  // Read the integer entered by the user

        // Store the original number in a separate variable to compare later
        originalNumber = number;

        // Start a loop to process the number digit by digit
        while (number != 0) {
            // The remainder when dividing the number by 10 gives the last digit
            remainder = number % 10;

            // Calculate the cube of the digit and add it to the sum
            sum += Math.pow(remainder, 3);

            // Divide the number by 10 to remove the last digit
            number /= 10;
        }

        // After the loop ends, check if the sum of cubes of the digits equals the original number
        if (sum == originalNumber) {
            // If the sum equals the original number, it is an Armstrong number
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            // If the sum does not equal the original number, it is not an Armstrong number
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner to release the resources after input is taken
        scanner.close();
    }
}

