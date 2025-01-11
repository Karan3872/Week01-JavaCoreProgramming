import java.util.Scanner;

// Creating a class Calculator to implement a simple calculator using switch-case

class Calculator
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare variables to hold the two operands and the operator
        double first, second;
        String op;

        // Prompt the user to enter the first operand, the operator, and the second operand
        System.out.print("Enter first number: ");
        first = scanner.nextDouble();  // Read the first number entered by the user
        System.out.print("Enter operator (+, -, *, /): ");
        op = scanner.next();  // Read the operator entered by the user
        System.out.print("Enter second number: ");
        second = scanner.nextDouble();  // Read the second number entered by the user

        // Use a switch-case statement to perform the operation based on the input operator
        switch (op) {
            case "+":
                // If the operator is '+', perform addition and print the result
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                // If the operator is '-', perform subtraction and print the result
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                // If the operator is '*', perform multiplication and print the result
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // If the operator is '/', check for division by zero
                if (second != 0) {
                    // Perform division if the second operand is non-zero and print the result
                    System.out.println("Result: " + (first / second));
                } else {
                    // If the second operand is zero, print an error message for division by zero
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                // If the operator is invalid (not one of +, -, *, or /), print an error message
                System.out.println("Invalid Operator.");
        }

        // Close the scanner to release resources after input
        scanner.close();
    }
}