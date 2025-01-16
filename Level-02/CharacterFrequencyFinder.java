/*Write a program to find the frequency of characters in a string using charAt() method and display the result
Hint => 
Create a method to find the frequency of characters in a string using charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result. 
*/


import java.util.Scanner;

public class CharacterFrequencyFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the frequency of characters
        String[][] charFrequencies = findCharFrequencies(inputText);

        // Display the result
        displayCharFrequencies(charFrequencies);

        scanner.close();
    }

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharFrequencies(String text) {
        int[] charFrequency = new int[256]; // Array to store the frequency of characters

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] charFrequencies = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                charFrequencies[index][0] = String.valueOf((char) i);
                charFrequencies[index][1] = String.valueOf(charFrequency[i]);
                index++;
            }
        }

        return charFrequencies;
    }

    // Method to display the character frequencies
    public static void displayCharFrequencies(String[][] charFrequencies) {
        System.out.printf("%-10s %s%n", "Character", "Frequency");
        System.out.println("-------------------");

        for (String[] charFrequency : charFrequencies) {
            System.out.printf("%-10s %s%n", charFrequency[0], charFrequency[1]);
        }
    }
}
