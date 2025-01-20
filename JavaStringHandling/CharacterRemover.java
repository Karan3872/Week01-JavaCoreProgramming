/*
Remove a Specific Character from a String
Problem:
Write a Java program to remove all occurrences of a specific character from a string.
Example Input:
String: "Hello World"
Character to Remove: 'l'
Expected Output:
Modified String: "Heo Word"
*/

import java.util.Scanner;

// Creating class CharacterRemover to remove all occurrences of a specific character from a given string
class CharacterRemover 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // the user to enter a string
        System.out.print("Enter a string: ");
        // Create a String variable to store the input string by the user
        String input = scanner.nextLine();

        // the user to enter the character to remove
        System.out.print("Enter the character to remove: ");
        // Create a char variable to store the character to remove
        char charToRemove = scanner.next().charAt(0);

        // Variable to store the modified string without the specific character
        String result = "";

        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) 
		{
            // Get the current character
            char ch = input.charAt(i);

            // Add the character to the result string if it is not the character to remove
            if (ch != charToRemove) 
			{
                result += ch;
            }
        }

        // Display the modified string
        System.out.println("Modified string: " + result);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}