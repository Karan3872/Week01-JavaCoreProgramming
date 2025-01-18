/*
Find Substring Occurrences
Problem:
Write a Java program to count how many times a given substring occurs in a string.
*/


import java.util.Scanner;

public class SubstringOccurrence {
    public static void main(String args[]) {
        // Create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // the user to enter the main string
        System.out.print("Enter the main string: ");
        String text = sc.nextLine();
        
        // the user to enter the substring
        System.out.print("Enter the substring: ");
        String subtext = sc.nextLine();
        
        // Get the length of the substring
        int subStringLength = subtext.length();
        
        // Initialize a counter to keep track of occurrences
        int count = 0;
        
        // Loop through the main string to find the substring
        for (int i = 0; i <= text.length() - subStringLength; i++) {
            // Check if the substring matches the current part of the main string
            if (subtext.equals(text.substring(i, i + subStringLength))) {
                count++; // Increment the count if a match is found
            }
        }
        
        // Print the total number of occurrences of the substring in the main string
        System.out.println("Occurrences of the substring in the main string: " + count);
    }
}
