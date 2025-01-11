/*
Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index

*/

import java.util.Scanner; // Import the Scanner class for user input

// Class SeparateNumbers to separate odd and even numbers
class SeparateNumbers 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); // `sc` is a Scanner object for reading input from the console

        // Prompt the user to enter a natural number
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt(); // `number` is an integer that stores the user input

        // Validate if the input is a natural number
        if (number <= 0) {
            System.err.println("Invalid input! Please enter a natural number.");
            System.exit(0); // Exit the program for invalid input
        }

        // Initialize arrays for odd and even numbers
        int[] odd = new int[number / 2 + 1]; // `odd` is an array to store odd numbers
        int[] even = new int[number / 2 + 1]; // `even` is an array to store even numbers
        int oddIndex = 0, evenIndex = 0; // `oddIndex` and `evenIndex` are integers to track positions in the arrays

        // Separate the numbers into odd and even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i; // Add to even array and increment `evenIndex`
            } else {
                odd[oddIndex++] = i; // Add to odd array and increment `oddIndex`
            }
        }

        // Display the odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " "); // Print each odd number in the array
        }

        // Display the even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " "); // Print each even number in the array
        }

        // Close the Scanner object
        sc.close(); // Close the Scanner to release the resource
    }
}


