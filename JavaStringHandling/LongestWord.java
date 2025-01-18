/*Find the Longest Word in a Sentence
Problem:
Write a Java program that takes a sentence as input and returns the longest word in the
sentence.
*/

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");
        
        // Read the input sentence from the user
        // Note: nextLine() reads the entire line, next() reads only the next token
        String text = sc.nextLine();
        
        // Split the sentence into words using whitespace as the delimiter
        String[] words = text.split("\\s+");
        
        // Initialize an empty string to store the longest word found
        String longestWord = "";
        
        // Iterate through each word in the array
        for (String word : words) {
            // If the current word is longer than the longestWord, update longestWord
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        // Print the longest word found in the sentence
        System.out.println("The longest word is: " + longestWord);

        sc.close();
    }
}
