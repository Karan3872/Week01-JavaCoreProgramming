import java.util.Scanner;

public class SplitTextIntoWords {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        // Split the text into words using the custom method
        String[] customSplitWords = customSplit(inputString);

        // Split the text into words using the built-in split() method
        String[] builtInSplitWords = inputString.split("\\s+");

        // Compare the two string arrays
        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        // Display the results
        System.out.println("Words using custom split method:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both methods producing the same result? " + areEqual);


		System.out.println();
        // Close the Scanner object
        scanner.close();
    }

    // Method to find the length of the string without using the built-in length() method
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split the text into words using the charAt() method without using the String built-in split() method
    public static String[] customSplit(String str) {
        int strLength = getStringLength(str);

        // Count the number of words in the text
        int wordCount = 1; // Start with 1 because there's at least one word
        for (int i = 0; i < strLength; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];

        // Extract words using the spaces
        int wordIndex = 0;
        String currentWord = "";
        for (int i = 0; i < strLength; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex] = currentWord;
                wordIndex++;
                currentWord = "";
            } else {
                currentWord += str.charAt(i);
            }
        }
        words[wordIndex] = currentWord; // Add the last word

        return words;
    }

    // Method to compare two string arrays and return a boolean result
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
}
