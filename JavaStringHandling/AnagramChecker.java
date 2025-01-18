/*
Check if Two Strings are Anagrams
Problem:
Write a Java program that accepts two strings from the user and checks if the two
strings are anagrams of each other (i.e., whether they contain the same characters in any
order).
*/

import java.util.Scanner;
import java.util.Arrays;

// Creating class AnagramChecker to check if two strings are anagrams of each other
class AnagramChecker 
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

        // Remove all whitespace and convert strings to lowercase for case insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the two strings are different
        if (str1.length() != str2.length()) 
		{
            System.out.println("The strings are not anagrams.");
        } 
		else 
		{
            // Convert strings to char arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // Sort the char arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Check if the sorted char arrays are equal
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}