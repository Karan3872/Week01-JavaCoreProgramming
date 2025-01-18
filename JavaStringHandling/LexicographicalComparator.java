/*
8. Compare Two Strings

Problem:
Write a Java program to compare two strings lexicographically (dictionary order) without
using built-in compare methods.
Example Input:
String 1: "apple"
String 2: "banana"

Expected Output:
"apple" comes before "banana" in lexicographical order
*/


import java.util.Scanner;

// Creating class LexicographicalComparator to compare two strings lexicographically
class LexicographicalComparator 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        // Create a String variable to store the first string by the user
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        // Create a String variable to store the second string by the user
        String str2 = scanner.nextLine();

        // Compare the two strings lexicographically
        int minLength = Math.min(str1.length(), str2.length());
        int comparisonResult = 0;

        // Loop through each character of the strings up to the length of the shorter string
        for (int i = 0; i < minLength; i++) 
		{
            if (str1.charAt(i) < str2.charAt(i)) 
			{
                comparisonResult = -1; // str1 comes before str2
                break;
            } 
			else if (str1.charAt(i) > str2.charAt(i)) 
			{
                comparisonResult = 1; // str2 comes before str1
                break;
            }
        }

        // If the strings are equal up to the length of the shorter string, compare their lengths
        if (comparisonResult == 0) 
		{
            if (str1.length() < str2.length()) 
			{
                comparisonResult = -1; // str1 comes before str2
            } 
			else if (str1.length() > str2.length()) 
			{
                comparisonResult = 1; // str2 comes before str1
            }
        }

        // Display the result of the comparison
        if 
		(comparisonResult < 0)
		{
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } 
		else if (comparisonResult > 0) 
		{
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");
        } 
		else 
		{
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\" in lexicographical order.");
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}