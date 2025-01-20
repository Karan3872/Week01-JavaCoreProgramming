/**
 * Factorial Calculator Program:
 * Write a program that calculates the factorial of a number using a recursive function.
 * Break the program  longo functions for input, calculation, and output processes.
 */

// Importing the Scanner class from the java.util package for taking user input
import java.util.Scanner;

// Creating the class Factorial which contains methods to calculate the factorial of a number
class Factorial 
{
    
    // Method to take input from the user
    public static long takeInput() 
	{
        // Creating a Scanner object named scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        
        // Storing the user's input in the variable number and returning it
         long number = scanner.nextInt();
        
        // Closing the scanner object to prevent resource leaks
        scanner.close();
        
        // Returning the user input
        return number;
    }

    // Method to calculate the factorial of a given number using recursion
    public static  long calculateFactorial(long num) 
	{
        // Base case: factorial of 0 or 1 is 1
        if (num <= 1) 
		{
            return 1;
        }
        
        // Recursive case: factorial of n is n * factorial of (n-1)
        return num * calculateFactorial(num - 1);
    }

    // Method to display the result
    public static void displayResult( long number, long result) 
	{
        // Displaying the result to the user
        System.out.println("The factorial of " + number + " is " + result);
    }

    public static void main(String[] args) 
	{
		// Creating int variable number to store user input
        // Calling the takeInput() method to get the user input
         long number = takeInput();
		 
		// Creating int variable result to store calculated Factorial
        // Calling the calculateFactorial() method to calculate the factorial of the input number
         long result = calculateFactorial(number);
        
        // Calling the displayResult() method to display the result to the user
        displayResult(number, result);
    }
}