/*Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. 
This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. 
This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/


import java.util.Scanner;

public class DemonstrateIllegalArgumentException {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Call the method to generate the IllegalArgumentException
        generateIllegalArgumentException(inputString);

        // Refactor the code to handle the exception
        handleIllegalArgumentException(inputString);

        // Close the Scanner object
        scanner.close();
    }

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String str) {
        try {
            String result = str.substring(5, 2); // Start index is greater than end index
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
        }
    }

    // Method to demonstrate IllegalArgumentException handling
    public static void handleIllegalArgumentException(String str) {
        try {
            String result = str.substring(5, 2); // Start index is greater than end index
        } catch (IllegalArgumentException e) {
            System.out.println("Handling IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handling RuntimeException: " + e);
        }
    }
}
