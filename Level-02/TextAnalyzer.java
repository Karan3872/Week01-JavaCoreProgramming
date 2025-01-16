import java.util.Scanner;

public class TextAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();

        // Split the text into words
        String[] words = splitTextIntoWords(inputText);

        // Find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(words);

        // Display the result
        displayResults(shortestAndLongest);

        scanner.close();
    }

    // Method to split the text into words using charAt() method
    public static String[] splitTextIntoWords(String text) {
        int wordCount = countWords(text);
        String[] words = new String[wordCount];

        char[] tempWord = new char[50]; // Assuming max word length is 50
        int wordIndex = 0;
        int charIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                tempWord[charIndex++] = ch;
            } else if (charIndex > 0) {
                words[wordIndex++] = new String(tempWord, 0, charIndex);
                charIndex = 0; // Reset char index
            }
        }

        if (charIndex > 0) {
            words[wordIndex] = new String(tempWord, 0, charIndex);
        }

        return words;
    }

    // Method to count words in the text
    public static int countWords(String text) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                if (!inWord) {
                    inWord = true;
                    count++;
                }
            } else {
                inWord = false;
            }
        }

        return count;
    }

    // Method to find the length of a string without using the length() method
    public static int findLength(String word) {
        int length = 0;
        for (char c : word.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to find the shortest and longest strings
    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (findLength(word) < findLength(shortest)) {
                shortest = word;
            }
            if (findLength(word) > findLength(longest)) {
                longest = word;
            }
        }

        return new String[]{shortest, longest};
    }

    // Method to display results
    public static void displayResults(String[] shortestAndLongest) {
        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);
    }
}
