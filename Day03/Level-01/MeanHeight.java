/*
Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team

*/

import java.util.Scanner; // Import the Scanner class for user input

// Class MeanHeight to calculate the mean height of football team players

class MeanHeight 
{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); // `sc` is a Scanner object for reading input from the console

        // Create an array to store the heights of 11 players
        double[] heights = new double[11]; // `heights` is an array of doubles to store the heights of the players
        double sum = 0.0; // `sum` is a double variable to store the total height

        // Prompt the user to enter the heights of the players
        System.out.println("Enter the heights of 11 players in cm:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble(); // Store the height entered by the user in the array
            sum += heights[i]; // Add the entered height to the total sum
        }

        // Calculate the mean height
        double mean = sum / heights.length; // `mean` is a double variable that stores the average height

        // Display the mean height
        System.out.printf("The mean height of the players is: %.2f cm%n", mean); // Print the mean height formatted to 2 decimal places

        // Close the Scanner object
        sc.close(); // Close the Scanner to release the resource
    }
}
