/*
Fibonacci Sequence Generator:
Write a program that generates the Fibonacci sequence up to a 
specified number of terms entered by the user.
Organize the code by creating a function that calculates and 
prints the Fibonacci sequence.
 */

// Importing the Scanner class from the java.util package for taking user input
import java.util.Scanner;

// Creating the class FibonacciSequenceGenerator which contains methods to generate Fibonacci sequence
public class FibonacciSequenceGenerator 
{
    // Method to calculate and print the Fibonacci sequence up to the specified number of terms
    public static void generateFibonacci(long terms) 
    {
        // Initializing the first two terms of the Fibonacci sequence
        long firstTerm = 0, secondTerm = 1;

        // Printing the first term of the Fibonacci sequence
        System.out.print("Fibonacci Sequence: " + firstTerm);

        // Loop to calculate and print the remaining terms of the Fibonacci sequence
        for (long i = 1; i < terms; i++) 
        {
            // Printing the current term of the Fibonacci sequence
            System.out.print(", " + secondTerm);

            // Calculating the next term in the Fibonacci sequence
            long nextTerm = firstTerm + secondTerm;

            // Updating the terms for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) 
    {
        // Creating a Scanner object named scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the number of terms for the Fibonacci sequence
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");

        // Creatin lonf variable terms for storing the user's input
        long terms = scanner.nextInt();

        // Calling the generateFibonacci() method to calculate and print the Fibonacci sequence
        generateFibonacci(terms);

        // Closing the scanner object to prevent resource leaks
        scanner.close();
    }
}