/*
Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___

*/

// Creating a class for basic calculator
import java.util.Scanner;

class Calculator 
{
    public static void main(String[] args)
	{
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter first number: ");
		
		//Creating float number1 variable to take user input
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
		
		//Creating float number2 variable to take user input
        double number2 = input.nextDouble();

        // Perform the arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display the results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}
 