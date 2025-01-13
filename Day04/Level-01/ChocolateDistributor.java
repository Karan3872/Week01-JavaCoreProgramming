import java.util.Scanner;

public class ChocolateDistributor {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take integer input for the number of chocolates and the number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Find the number of chocolates each child gets and the remaining chocolates
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display the results
        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("The remaining chocolates are: " + result[1]);

        // Close the Scanner object
        scanner.close();
    }

    // Method to find the quotient (number of chocolates each child gets) and remainder (remaining chocolates)
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
}



