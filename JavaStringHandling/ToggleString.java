/*Toggle Case of Characters
Problem:
Write a Java program to toggle the case of each character in a given string. Convert
uppercase letters to lowercase and vice versa.
*/



import java.util.Scanner;

public class ToggleString {
    public static void main(String args[]) {
        // Create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // enter a string
        System.out.print("Enter the string: ");
        String text = sc.nextLine();
        
        // Initialize an empty string to store the result
        String result = "";
        
        // Iterate through each character in the input string
        for (int i = 0; i < text.length(); i++) {
            // Get the current character
            char ch = text.charAt(i);
            
            // Check if the character is lowercase
            if (Character.isLowerCase(ch)) {
                // Convert the character to uppercase and append to result
                result += Character.toUpperCase(ch);
            } else {
                // Convert the character to lowercase and append to result
                result += Character.toLowerCase(ch);
            }
        }
        
        // Print the string after toggling case
        System.out.print("String after toggle case: " + result);
    }
}
