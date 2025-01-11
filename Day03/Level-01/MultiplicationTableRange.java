/*
Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___

*/


import java.util.Scanner; // Import the Scanner class for user input

// Class MultiplicationTableRange to generate multiplication tables for numbers 6 to 9
class MultiplicationTableRange 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); // `sc` is a Scanner object for reading input from the console

        // Prompt the user to enter a number
        System.out.print("Enter a number to generate multiplication tables from 6 to 9: ");
        int number = sc.nextInt(); // `number` is an integer that stores the user input
        
        // Initialize an array to store the multiplication results for numbers 6 to 9
        int[] result = new int[4]; // `result` is an array of integers with a length of 4

        // Generate and display multiplication tables from 6 to 9
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            // Calculate the multiplication result of `number` and `i`
            result[j] = i * number; // Store the result in the array at position `j`
            
            // Print the multiplication result in the format "number * i = result"
            System.out.println("\nMultiplication Table for " + number + " * " + i + " = " + result[j]);
        }

        // Close the Scanner object
        sc.close(); // Close the Scanner to release the resource
    }
}
