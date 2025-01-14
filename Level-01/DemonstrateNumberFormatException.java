/*Write a program to demonstrate NumberFormatException
Hint => 
Define a variable to take user input as a String 
Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in function in java.lang.Integer class to extract the number from text. 
In case the text does not contain numbers the method will throw NumberFormatException which is a runtime exception
Write a Method to generate the Exception. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception. 
Use the try-catch block to handle the NumberFormatException as well as the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/


import java.util.Scanner;

public class DemonstrateNumberFormatException {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Call the method to generate the NumberFormatException
        generateNumberFormatException(inputString);

        // Refactor the code to handle the exception
        handleNumberFormatException(inputString);

        // Close the Scanner object
        scanner.close();
    }

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text); // Attempt to parse the string to an integer
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e);
        }
    }

    // Method to demonstrate NumberFormatException handling
    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text); // Attempt to parse the string to an integer
        } catch (NumberFormatException e) {
            System.out.println("Handling NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handling RuntimeException: " + e);
        }
    }
}
