// Importing necessary classes for user input
import java.util.Scanner;

// Creating class MaximumOfThreeNumbers to contain methods for finding the maximum of three numbers
public class MaximumOfThreeNumbers 
{

    // Method to take three integer inputs from the user
    public static int[] takeInput() 
	{
        // Creating a Scanner object scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Declaring an array numbers to store the three input numbers
        int[] numbers = new int[3];

        // Prompting user and storing the first input number in numbers[0]
        System.out.print("Enter the first number: ");
        numbers[0] = scanner.nextInt();

        // Prompting user and storing the second input number in numbers[1]
        System.out.print("Enter the second number: ");
        numbers[1] = scanner.nextInt();

        // Prompting user and storing the third input number in numbers[2]
        System.out.print("Enter the third number: ");
        numbers[2] = scanner.nextInt();

        // Closing the scanner to prevent resource leaks
        scanner.close();

        // Returning the array containing the three input numbers
        return numbers;
    }

    // Method to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) 
	{
        // Initializing max with the first number num1
        int max = num1;

        // Comparing num2 with max and updating max if num2 is greater
        if (num2 > max) {
            max = num2;
        }

        // Comparing num3 with max and updating max if num3 is greater
        if (num3 > max) {
            max = num3;
        }

        // Returning the maximum value
        return max;
    }

    public static void main(String[] args) 
	{
        // Calling takeInput() to get the input numbers and storing them in numbers
        int[] numbers = takeInput();

        // Finding the maximum of the three numbers and storing it in max
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);

        // Displaying the maximum number
        System.out.println("The maximum of the three numbers is: " + max);
    }
}