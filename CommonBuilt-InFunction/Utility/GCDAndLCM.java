/**
GCD and LCM Calculator Program:
Create a program that calculates the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers using functions.
Break the program into functions for input, calculation, and output processes.
 */

// Importing the Scanner class from the java.util package for taking user input
import java.util.Scanner;

// Creating the class GCDAndLCM which contains methods to calculate GCD and LCM of two numbers
public class GCDAndLCM 
{
    
    // Method to take input from the user
    public static int[] takeInput() 
	{
        // Creating a Scanner object named scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Creating an array to store two numbers input by the user
        int[] numbers = new int[2];

        // Prompting the user to enter the first number
        System.out.print("Enter the first number: ");
        // Storing the user's input in the first element of the array
        numbers[0] = scanner.nextInt();

        // Prompting the user to enter the second number
        System.out.print("Enter the second number: ");
        // Storing the user's input in the second element of the array
        numbers[1] = scanner.nextInt();
        
        // Closing the scanner object to prevent resource leaks
        scanner.close();

        // Returning the array of user inputs
        return numbers;
    }

    // Method to calculate the GCD of two given numbers using recursion
    public static int calculateGCD(int num1, int num2) 
	{
        // Base case: if the second number is 0, return the first number
        if (num2 == 0) {
            return num1;
        }
        
        // Recursive case: GCD of num1 and num2 is the GCD of num2 and the remainder of num1 divided by num2
        return calculateGCD(num2, num1 % num2);
    }

    // Method to calculate the LCM of two given numbers using their GCD
    public static int calculateLCM(int num1, int num2, int gcd) {
        // LCM is calculated using the formula: (num1 * num2) / GCD
        return (num1 * num2) / gcd;
    }

    // Method to display the result
    public static void displayResult(int num1, int num2, int gcd, int lcm) {
        // Displaying the GCD of the two numbers to the user
        System.out.println("The Greatest Common Divisor (GCD) of " + num1 + " and " + num2 + " is " + gcd);

        // Displaying the LCM of the two numbers to the user
        System.out.println("The Least Common Multiple (LCM) of " + num1 + " and " + num2 + " is " + lcm);
    }

    public static void main(String[] args) {
        // Calling the takeInput() method to get the user inputs
        int[] numbers = takeInput();
        
        // Extracting the first number from the array
        int num1 = numbers[0];
        
        // Extracting the second number from the array
        int num2 = numbers[1];
        
        // Calling the calculateGCD() method to calculate the GCD of the two numbers
        int gcd = calculateGCD(num1, num2);
        
        // Calling the calculateLCM() method to calculate the LCM of the two numbers using their GCD
        int lcm = calculateLCM(num1, num2, gcd);
        
        // Calling the displayResult() method to display the results to the user
        displayResult(num1, num2, gcd, lcm);
    }
}