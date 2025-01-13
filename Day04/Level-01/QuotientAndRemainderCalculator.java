import java.util.Scanner;

public class QuotientAndRemainderCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take integer input for the number and the divisor
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Find the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the results
        System.out.println("The quotient is: " + result[0]);
        System.out.println("The remainder is: " + result[1]);

        // Close the Scanner object
        scanner.close();
    }

    // Method to find the quotient and remainder of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
}

