/*
Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint => 
Create a String Array to save the results and 
Finally, loop again to show the results of the array based on the index position
*/

import java.util.Scanner; // Import the Scanner class for user input

// Class FizzBuzz to implement the FizzBuzz logic
class FizzBuzz 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); // `sc` is a Scanner object for reading input from the console

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt(); // `number` is an integer that stores the user input

        // Validate if the input is a positive integer
        if (number <= 0) {
            System.err.println("Invalid input! Please enter a positive integer.");
            System.exit(0); // Exit the program for invalid input
        }

        // Create a String array to save the results
        String[] results = new String[number + 1]; // `results` is a String array to store the FizzBuzz results

        // Loop through numbers from 0 to the entered number
        for (int i = 1; i <= number; i++) {
            // Check if the number is a multiple of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; // Save "FizzBuzz" in the array
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; // Save "Fizz" in the array
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; // Save "Buzz" in the array
            } else {
                results[i] = String.valueOf(i); // Save the number itself in the array
            }
        }

        // Display the results
        System.out.println("FizzBuzz Results:");
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]); // Print the result for each index position
        }

        // Close the Scanner object
        sc.close(); // Close the Scanner to release the resource
    }
}
