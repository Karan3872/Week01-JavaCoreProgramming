// Create a class 'SmallestNumber' to check if the first number is the smallest
// This class contains the main method which serves as the entry point of the program

import java.util.Scanner;

class SmallestNumber {

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        // Scanner is a class that provides methods to read different types of input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        // Use 'System.out.print' to display the prompt text on the console
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();  // Read the first number

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();  // Read the second number

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();  // Read the third number

        // Check if the first number is the smallest of the three
        // The condition checks if number1 is smaller than both number2 and number3
        boolean isSmallest = (number1 < number2) && (number1 < number3);
        
        // Display the result to the user
        // 'System.out.println' prints the output to the console
        // It concatenates the string with the value of 'number1' and the result of the comparison
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}