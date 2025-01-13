import java.util.Scanner;

public class NumberChecker5 {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check the number and display the result
        int result = checkNumber(number);
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the Scanner object
        scanner.close();
    }

    // Method to check whether a number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }
}

