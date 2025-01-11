/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends
*/

// Import the Scanner class from the java.util package to take input from the user
import java.util.Scanner;

// Creating class FriendsInfo to store and display information about 3 friends
class FriendsInfo
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Define an array of integers to store the ages of the 3 friends
        // ages is an array of type int
        int[] ages = new int[3];
		
        // Define an array of doubles to store the heights of the 3 friends
        // heights is an array of type double
        double[] heights = new double[3];
        
        // Define an integer to store the index of the youngest friend
        // youngestIndex is of type int
        int youngestIndex = 0;
		
        // Define an integer to store the index of the tallest friend
        // tallestIndex is of type int
        int tallestIndex = 0;

        // Input ages and heights for the 3 friends
        for (int i = 0; i < 3; i++) 
		{
            // Prompt the user to enter the age for each friend and store it in the ages array
            // ages[i] stores the age of the ith friend
            System.out.print("Enter age for friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
			
            // Prompt the user to enter the height for each friend and store it in the heights array
            // heights[i] stores the height of the ith friend
            System.out.print("Enter height for friend " + (i + 1) + " in meters: ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest friend by comparing ages
        for (int i = 1; i < 3; i++) 
		{
            if (ages[i] < ages[youngestIndex]) 
			{
                // Update the index of the youngest friend
                // youngestIndex is updated to the current ith index
                youngestIndex = i; 
            }
        }

        // Find the tallest friend by comparing heights
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                // Update the index of the tallest friend
                // tallestIndex is updated to the current ith index
                tallestIndex = i; 
            }
        }

        // Array of friend names
        // friends is an array of type String
        String[] friends = {"Amar", "Akbar", "Anthony"};
        
        // Display the youngest friend with their name and age
        // friends[youngestIndex] gives the name, and ages[youngestIndex] gives the age
        System.out.println("The youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex]);
        
		// Display the tallest friend with their name and height
        // friends[tallestIndex] gives the name, and heights[tallestIndex] gives the height
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " meters");

        // Close the scanner to prevent resource leaks
        // scanner.close() closes the Scanner object
        scanner.close();
    }
}
