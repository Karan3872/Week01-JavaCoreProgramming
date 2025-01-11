import java.util.Scanner;

// Creating a class CountDigits to count the number of digits in a given number

public class CountDigits
{
    public static void main(String[] args)
	{
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare two variables:
        // `number` to store the input number
        // `count` to keep track of the number of digits
        int number, count = 0;

        // Ask the user to input a number to count its digits
        System.out.print("Enter an integer: ");
        number = scanner.nextInt();  // Read the input number from the user

        // Start a while loop to process each digit of the number
        while (number != 0) {
            // Divide the number by 10 to remove the last digit
            number /= 10;

            // Each time we remove a digit, increment the count
            count++;
        }

        // After the loop ends, print the number of digits counted
        System.out.println("The number of digits is: " + count);

        // Close the scanner to release the resources after reading input
        scanner.close();
    }
}