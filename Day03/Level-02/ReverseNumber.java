/*
Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order  
*/


// Import the Scanner class from the java.util package to take input from the user
import java.util.Scanner;

// Creating class ReverseNumber to take a number and reverse its digits
public class ReverseNumber 
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

        // Count the number of digits in the number
        // Use a loop to iterate until temp is not equal to 0
        while (temp > 0) {
            count++; // Increment the count by 1
            temp /= 10; // Remove the last digit from temp
        }

        // Define an array to store the digits, with the size equal to count
        // digits is an array of type int with a size of count
        int[] digits = new int[count];

        // Reset the temp variable to the original number
        temp = number;

        // Use a loop to extract the digits from the number and store them in the digits array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10; // Get the last digit of temp and store it in digits[i]
            temp /= 10; // Remove the last digit from temp
        }

        // Display the digits in reverse order
        // Use a loop to iterate from count - 1 to 0
        for (int i = 0; i <count; i++) {
            System.out.print(digits[i]); // Print each digit
        }

        // Close the scanner to prevent resource leaks
        // sc.close() closes the Scanner object
        sc.close();
    }
}
