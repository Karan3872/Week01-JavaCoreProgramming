import java.util.Scanner;

public class SmallestAndLargestFinder {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Find the smallest and largest of the three numbers
        int[] results = findSmallestAndLargest(number1, number2, number3);

        // Display the results
        System.out.println("The smallest number is: " + results[0]);
        System.out.println("The largest number is: " + results[1]);

        // Close the Scanner object
        scanner.close();
    }

    // Method to find the smallest and largest of the three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }
}

