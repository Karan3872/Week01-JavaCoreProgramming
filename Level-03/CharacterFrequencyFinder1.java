/* 
Write a program to find the frequency of characters in a string using unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using charAt() method and return them as 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.
*/


import java.util.Scanner;

public class CharacterFrequencyFinder1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(inputText);

        // Find the frequency of unique characters
        String[][] charFrequencies = findCharFrequencies(inputText, uniqueChars);

        // Display the result
        displayCharFrequencies(charFrequencies);

        scanner.close();
    }

    // Method to find the length of the text without using the String method length()
    public static int findTextLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = findTextLength(text);
        char[] uniqueCharsTemp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueCharsTemp[uniqueCount++] = currentChar;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = uniqueCharsTemp[i];
        }

        return uniqueChars;
    }

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharFrequencies(String text, char[] uniqueChars) {
        int[] charFrequency = new int[256]; // Array to store the frequency of characters

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        String[][] charFrequencies = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            charFrequencies[i][0] = String.valueOf(uniqueChars[i]);
            charFrequencies[i][1] = String.valueOf(charFrequency[uniqueChars[i]]);
        }

        return charFrequencies;
    }

    // Method to display the character frequencies in a tabular format
    public static void displayCharFrequencies(String[][] charFrequencies) {
        System.out.printf("%-10s %s%n", "Character", "Frequency");
        System.out.println("-------------------");

        for (String[] charFrequency : charFrequencies) {
            System.out.printf("%-10s %s%n", charFrequency[0], charFrequency[1]);
        }
    }
}
