import java.util.Scanner;

public class TextSplitter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine(); // Take user input using the Scanner nextLine() method

        // Split the text into words
        String[] words = splitTextIntoWords(inputText);

        // Create the 2D array of words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the result
        displayWordsWithLengths(wordsWithLengths);
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
    
    // Method to split the text into words using charAt() method
    public static String[] splitTextIntoWords(String text) {
        int wordCount = countWords(text); // Count the number of words in the text
        String[] words = new String[wordCount]; // Create an array to hold the words
        
        char[] tempWord = new char[50]; // Temporary array to build each word, assuming max word length is 50
        int wordIndex = 0; // Index for the words array
        int charIndex = 0; // Index for the tempWord array
        
        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // Get the character at the current index
            if (ch != ' ') {
                // If the character is not a space, add it to the tempWord array
                tempWord[charIndex++] = ch;
            } else if (charIndex > 0) {
                // If the character is a space and there are characters in tempWord, create a word
                words[wordIndex++] = new String(tempWord, 0, charIndex);
                charIndex = 0; // Reset char index for the next word
            }
        }
        
        // Add the last word if there are remaining characters in tempWord
        if (charIndex > 0) {
            words[wordIndex] = new String(tempWord, 0, charIndex);
        }
        
        return words; // Return the array of words
    }

    // Method to count words in the text
    public static int countWords(String text) {
        int count = 0;
        boolean inWord = false; // Flag to track if we are inside a word

        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // Get the character at the current index
            if (ch != ' ') {
                // If the character is not a space
                if (!inWord) {
                    // If we are not already in a word, increment the word count
                    inWord = true;
                    count++;
                }
            } else {
                // If the character is a space, set the flag to false
                inWord = false;
            }
        }

        return count; // Return the total word count
    }

    // Method to find the length of a string without using the length() method
    public static int findLength(String word) {
        int length = 0;
        // Loop through each character in the word
        for (char c : word.toCharArray()) {
            length++; // Increment the length for each character
        }
        return length; // Return the length of the word
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2]; // 2D array to hold words and their lengths
        
        // Loop through each word
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i]; // Store the word
            wordsWithLengths[i][1] = String.valueOf(findLength(words[i])); // Store the word's length as a String
        }
        
        return wordsWithLengths; // Return the 2D array of words and their lengths
    }

    // Method to display words and their lengths in a tabular format
    public static void displayWordsWithLengths(String[][] wordsWithLengths) {
        System.out.printf("%-20s %s%n", "Word", "Length"); // Print table headers
        System.out.println();

        // Loop through each word and its length
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.printf("%-20s %d%n", wordWithLength[0], Integer.parseInt(wordWithLength[1])); // Print word and its length
        }
    }
}
