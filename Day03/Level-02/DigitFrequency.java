/*
Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number

*/

// Import the Scanner class from the java.util package to take input from the user
import java.util.Scanner;

// Creating class DigitFrequency to calculate and display the frequency of each digit in a number
class DigitFrequency 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        // sc is of type Scanner
        Scanner sc = new Scanner(System.in);

        // Create a number variable and take user input
        // number is of type int
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create a temporary variable to store the input number and another to count the digits
        // temp is of type int and initialized to number
        int temp = number;
        // count is of type int and initialized to 0
        int count = 0;

        // Use a loop to count the number of digits in the number
        while (temp > 0) 
		{
            count++; // Increment the count by 1
            temp /= 10; // Remove the last digit from temp
        }

        // Define an array to store the digits, with the size equal to count
        // digits is an array of type int with a size of count
        int[] digits = new int[count];

        // Define an array to store the frequency of each digit (0-9)
        // frequency is an array of type int with a size of 10
        int[] frequency = new int[10];

        // Reset the temp variable to the original number
        temp = number;

        // Use a loop to extract the digits from the number, store them in the digits array, and update the frequency array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10; // Get the last digit of temp and store it in digits[i]
            frequency[digits[i]]++; // Increment the frequency count of the digit
            temp /= 10; // Remove the last digit from temp
        }

        // Display the frequency of each digit
        for (int i = 0; i < 10; i++) {
            // If the frequency of the digit is greater than 0, print the digit and its frequency
            if (frequency[i] > 0) {
                System.out.println(i + " " + frequency[i]); // Print the digit and its frequency
            }
        }

        // Close the Scanner to prevent resource leaks
        // sc.close() closes the Scanner object
        sc.close();
    }
}
