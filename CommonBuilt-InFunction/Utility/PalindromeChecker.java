/*
Palindrome Checker:
Write a program that checks if a given string is a palindrome 
(a word, phrase, or sequence that reads the same backward as forward).
Break the program into functions for input, checking the palindrome 
condition, and displaying the result.
 */

// Importing the Scanner class from the java.util package for taking user input
import java.util.Scanner;

// Creating the class PalindromeChecker which contains methods to check if a string is a palindrome
public class PalindromeChecker 
{
    // Method to take input from the user
    public static String takeInput() 
    {
        // Creating a Scanner object named scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter a string to check if it is a palindrome: ");

        // Storing the user's input in the variable input and returning it
        String input = scanner.nextLine();

        // Closing the scanner object to prevent resource leaks
        scanner.close();

        // Returning the user input
        return input;
    }

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) 
    {
        // Removing any whitespace and converting the string to lowercase for uniformity
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Initializing variables for the start and end indices
        int start = 0;
        int end = str.length() - 1;

        // Loop to compare characters from the start and end moving towards the center
        while (start < end) 
        {
            // If characters do not match, return false (not a palindrome)
            if (str.charAt(start) != str.charAt(end)) 
            {
                return false;
            }

            // Moving the start index forward and the end index backward
            start++;
            end--;
        }

        // If all characters match, return true (it is a palindrome)
        return true;
    }

    // Method to display the result
    public static void displayResult(String input, boolean result) 
    {
        // Displaying the result to the user based on the palindrome check
        if (result) 
        {
            System.out.println("\"" + input + "\" is a palindrome."); // Output message if the string is a palindrome
        } 
        else 
        {
            System.out.println("\"" + input + "\" is not a palindrome."); // Output message if the string is not a palindrome
        }
    }

    public static void main(String[] args) 
    {
		
        // Calling the takeInput() method to get the user input
        String input = takeInput();

        // Calling the isPalindrome() method to check if the input string is a palindrome
        boolean result = isPalindrome(input);

        // Calling the displayResult() method to display the result to the user
        displayResult(input, result);
    }
}