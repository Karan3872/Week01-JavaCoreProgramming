/*
Find the Most Frequent Character
Problem:
Write a Java program to find the most frequent character in a string.
Example Input:
String: "success"
Expected Output:
Most Frequent Character: 's'
*/

import java.util.Scanner;

// Creating class FrequentCharacterFinder to find the most frequent character in a given string
class FrequentCharacterFinder 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Create a String variable to store the input string by the user
        String input = scanner.nextLine();
		input= input.replaceAll("\\s", "");
        // Variable to store the most frequent character
		// of the input string
        char mostFrequentChar = ' ';
        int maxCount=0;
        for (int i = 0; i < input.length(); i++) 
		{
            char currentChar = input.charAt(i);
            int currentCount=0;
            

            // Count occurrences of the current character
            for (int j = 0; j < input.length(); j++) 
			{
                if (input.charAt(j) == currentChar) 
				{
                    currentCount++;
                }
            }

            // Update the most frequent character and maxCount if the current character's count is higher
            if (currentCount > maxCount) 
			{
                mostFrequentChar = currentChar;
                maxCount = currentCount;
            }
        }

        // Display the most frequent character
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        // Close the Scanner object to free up resources
        scanner.close();
    }
}