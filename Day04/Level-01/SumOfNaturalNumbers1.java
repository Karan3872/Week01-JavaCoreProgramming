import java.util.Scanner;

public class SumOfNaturalNumbers1 {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Check if the input is a positive integer
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Calculate the sum of the first n natural numbers
            int sum = calculateSum(n);

            // Display the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        // Close the Scanner object
        scanner.close();
    }

    // Method to find the sum of n natural numbers using loop
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

