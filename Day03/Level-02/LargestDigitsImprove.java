/*
Rework the program 3, especially the Hint f where if index equals maxDigit,
we break from the loop. Here we want to modify to Increase the size of the
array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to 
consider all digits to find the largest and second-largest number 
Hint => 
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number
*/

// Import the Scanner class from the java.util package to take input from the user
import java.util.Scanner;

// Creating class LargestDigits to store and display the largest and second largest digits of a number
public class LargestDigitsImprove 
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
            // If the index count equals maxDigit, increase maxDigit and resize the digits array
            if (index == maxDigit) 
			{
                maxDigit += 10; // Increase maxDigit by 10
                // Create a new temporary array with the new size
                int[] temp = new int[maxDigit];
                // Copy the digits from the old array to the new array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                // Assign the new array to the digits array
                digits = temp;
            }

            // Remove the last digit from the number and add it to the array
            // digits[index] stores the current last digit of the number
            digits[index] = number % 10;
			
            // Remove the last digit from the number
            number = number / 10;
			
            // Increment the index by 1
            index++;
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
			else if (digits[i] > secondLargest && digits[i] != largest) 
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
