/*
Basic Calculator:
○ Write a program that performs basic mathematical operations(addition,
subtraction, multiplication, division) based on user input.
○ Each operation should be performed in its own function, and the 
program should prompt the user to choose which operation to perform.
*/

// Importing the Scanner class from the java.util package for taking user input
import java.util.Scanner;

// Creating the class BasicCalculator which contains methods to perform basic arithmetic operations
public class BasicCalculator 
{

    // Method to add two numbers
    public static double add(double num1, double num2) 
	{
        return num1 + num2;
    }

    // Method to subtract the second number from the first number
    public static double subtract(double num1, double num2) 
	{
        return num1 - num2;
    }

    // Method to multiply two numbers
    public static double multiply(double num1, double num2) 
	{
        return num1 * num2;
    }

    // Method to divide the first number by the second number
    public static double divide(double num1, double num2) 
	{
        if (num2 == 0) {
            // Printing an error message if attempting to divide by zero
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return num1 / num2;
    }

    public static void main(String[] args) 
	{
        // Creating a Scanner object named scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompting the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompting the user to choose an operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        // Performing the chosen operation using a switch statement
        switch (operation) {
            case '+':
                // Performing addition
                result = add(num1, num2);
                break;
            case '-':
                // Performing subtraction
                result = subtract(num1, num2);
                break;
            case '*':
                // Performing multiplication
                result = multiply(num1, num2);
                break;
            case '/':
                // Performing division
                result = divide(num1, num2);
                break;
            default:
                // Printing an error message if an invalid operation is entered
                System.out.println("Invalid operation. Please enter one of +, -, *, /.");
                return;
        }

        // Displaying the result of the operation to the user
        System.out.println("The result of the operation is: " + result);
    }
}