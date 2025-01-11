/*
Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element

*/

import java.util.Scanner; // Import the Scanner class for user input

// Class Copy2DArray to demonstrate copying a 2D array into a 1D array
class Copy2DArray 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); // `sc` is a Scanner object for reading input from the console

        // Prompt the user to enter the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt(); // `rows` is an integer that stores the number of rows
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt(); // `columns` is an integer that stores the number of columns

        // Create a 2D array (matrix) with the specified number of rows and columns
        int[][] matrix = new int[rows][columns]; // `matrix` is a 2D array to store the elements

        // Take user input to fill the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt(); // Store the user input in the 2D array
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] array = new int[rows * columns]; // `array` is a 1D array with size equal to rows * columns
        int index = 0; // `index` is an integer to keep track of the current position in the 1D array

        // Copy the elements of the 2D array into the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j]; // Copy each element and increment the index
            }
        }

        // Display the 1D array
        System.out.println("The 1D array containing elements of the 2D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // Print each element of the 1D array
        }

        // Close the Scanner object
        sc.close(); // Close the Scanner to release the resource
    }
}
