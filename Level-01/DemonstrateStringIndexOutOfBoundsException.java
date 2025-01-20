/*Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. 
This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. 
Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.Scanner;

public class DemonstrateStringIndexOutOfBoundsException {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Call the method to generate the StringIndexOutOfBoundsException
        generateStringIndexOutOfBoundsException(inputString);

        // Refactor the code to handle the exception
        handleStringIndexOutOfBoundsException(inputString);

        // Close the Scanner object
        scanner.close();
    }

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String str) {
        try {
            char c = str.charAt(str.length()); // Access index beyond the length of the string
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e);
        }
    }

    // Method to demonstrate StringIndexOutOfBoundsException handling
    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            char c = str.charAt(str.length()); // Access index beyond the length of the string
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handling StringIndexOutOfBoundsException: " + e);
        }
    }
}
