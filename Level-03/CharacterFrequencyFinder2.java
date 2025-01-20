/*Write a program to find the frequency of characters in a string using nested loops and display the result
Hint => 
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. The logic used here is as follows:
Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
Loops to Find the frequency of each character in the text and store the result in an frequency array. For this use Nested Loop with Outer loop to iterate through each character in the text and initialize the frequency of each character to 1. And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to avoid counting them again.
Create an 1D String array to store the characters and their frequencies. For this Iterate through the characters in the text and store the characters and their frequencies 
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/


import java.util.Scanner;

public class CharacterFrequencyFinder2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the frequency of characters
        String[] charFrequencies = findCharFrequencies(inputText);

        // Display the result
        displayCharFrequencies(charFrequencies);

        scanner.close();
    }

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharFrequencies(String text) {
        int length = text.length();
        char[] characters = text.toCharArray();
        int[] frequencies = new int[length];

        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                frequencies[i] = 1;
                for (int j = i + 1; j < length; j++) {
                    if (characters[i] == characters[j]) {
                        frequencies[i]++;
                        characters[j] = '0'; // Set duplicate characters to '0' to avoid counting them again
                    }
                }
            }
        }

        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        String[] charFrequencies = new String[uniqueCount * 2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                charFrequencies[index] = String.valueOf(characters[i]);
                charFrequencies[index + 1] = String.valueOf(frequencies[i]);
                index += 2;
            }
        }

        return charFrequencies;
    }

    // Method to display the character frequencies
    public static void displayCharFrequencies(String[] charFrequencies) {
        System.out.printf("%-10s %s%n", "Character", "Frequency");
        System.out.println("-------------------");

        for (int i = 0; i < charFrequencies.length; i += 2) {
            System.out.printf("%-10s %s%n", charFrequencies[i], charFrequencies[i + 1]);
        }
    }
}
