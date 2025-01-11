/*
Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
Hint => 
Create a number variable and Take user input. 
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number

*/

// Import the Scanner class from the java.util package to take input from the user
import java.util.Scanner;

// Creating class LargestDigits to store and display the largest and second largest digits of a number
class LargestDigits
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        // scanner is of type Scanner
        Scanner scanner = new Scanner(System.in);

        // Create a number variable and take user input
        // number is of type int
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store the digits, with the size set to maxDigit
        // digits is an array of type int with a size of maxDigit
        int maxDigit = 10; // maxDigit is of type int
        int[] digits = new int[maxDigit];

        // Create an integer variable index with the value 0 to reflect the array index
        // index is of type int
        int index = 0;

        // Use a loop to iterate until the number is not equal to 0
        // In each iteration, extract the last digit of the number and store it in the digits array
        while (number != 0) 
		{
            // Remove the last digit from the number and add it to the array
            // digits[index] stores the current last digit of the number
            digits[index] = number % 10;
            // Remove the last digit from the number
            number = number / 10;
            // Increment the index by 1
            index++;

            // If the index count equals maxDigit, break out of the loop
            if (index == maxDigit) break;
        }

        // Define variables to store largest and second largest digit, initialize to zero
        // largest is of type int
        int largest = 0;
		
		
        // secondLargest is of type int
        int secondLargest = 0;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) 
		{
            // If the current digit is greater than the largest, update largest and secondLargest
            if (digits[i] > largest) 
			{
                // secondLargest is updated to the current largest value
                secondLargest = largest;
				
                // largest is updated to the current digit
                largest = digits[i];
            // If the current digit is greater than secondLargest and not equal to largest, update secondLargest
            } 
			else if(digits[i] > secondLargest && digits[i] != largest) 
			{
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest digits
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);

        // Close the scanner to prevent resource leaks
        // scanner.close() closes the Scanner object
        scanner.close();
    }
}
