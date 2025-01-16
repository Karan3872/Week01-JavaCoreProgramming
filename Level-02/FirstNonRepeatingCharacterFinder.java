/*Write a program to find the first non-repeating character in a string and show the result
Hint => 
Non-repeating character is a character that occurs only once in the string
Create a Method to find the first non-repeating character in a string using charAt() method and return the character. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Loop through the text to find the first non-repeating character in the text by checking the frequency of each character
In the main function take user inputs, call user-defined methods, and displays result. 
*/


import java.util.Scanner;

public class FirstNonRepeatingCharacterFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputText);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }

    // Method to find the first non-repeating character in a string using charAt() method
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] charFrequency = new int[256]; // Array to store the frequency of characters

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Loop through the text to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (charFrequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
}
