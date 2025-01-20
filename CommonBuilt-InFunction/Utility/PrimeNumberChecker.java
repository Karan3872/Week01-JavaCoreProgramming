/*
Prime Number Checker:
Create a program that checks whether a given number is a prime number.
The program should use a separate function to perform the prime check and return the result.
 */

// Importing the Scanner class from the java.util package for taking user input
import java.util.Scanner;

// Creating the class PrimeNumberChecker which contains methods to check if a number is prime
public class PrimeNumberChecker 
{
    // Method to determine if a given number is prime
    public static boolean isPrime(int number) 
    {
        // Check if the number is less than or equal to 1
        // Numbers less than or equal to 1 are not prime by definition
        if (number <= 1) 
        {
            return false; // A number less than or equal to 1 is not a prime number
        }

        // Loop to check for factors from 2 to the square root of the number
        // We use Math.sqrt(number) because a larger factor of the number must be a multiple of a smaller factor that has been already checked
        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            // If the number is divisible by any value of i, it means it has a factor other than 1 and itself
            // Thus, it is not a prime number
            if (number % i == 0) 
            {
                return false; // If a divisor is found, the number is not prime
            }
        }

        // If no divisors are found, the number is prime
        return true; // If no divisors are found, the number is prime
    }

    public static void main(String[] args) 
    {
        // Creating a Scanner object named scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a number to check if it is prime: ");

        // Creatin int variable numberfor storing the user's input
        int number = scanner.nextInt();

        // Calling the isPrime() method to check if the entered number is prime
        // Storing the result (true or false) in the variable result
        boolean result = isPrime(number);

        // Displaying the result to the user based on whether the number is prime or not
        if (result) 
        {
            System.out.println(number + " is a prime number."); // Output message if the number is prime
        } 
        else 
        {
            System.out.println(number + " is not a prime number."); // Output message if the number is not prime
        }

        // Closing the scanner object to prevent resource leaks
        scanner.close();
    }
}