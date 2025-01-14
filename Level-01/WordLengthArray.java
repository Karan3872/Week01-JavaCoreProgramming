/* Write a program to split the text into words and return the words along with their lengths in a 2D array
*/


import java.util.Scanner;

public class WordLengthArray {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Split the text into words and return the words along with their lengths in a 2D array
        String[][] wordLengthArray = getWordLengthArray(inputString);

        // Display the results
        System.out.println("Words and their lengths:");
        for (String[] wordLength : wordLengthArray) {
            System.out.println("Word: " + wordLength[0] + ", Length: " + wordLength[1]);
        }

        // Close the Scanner object
        scanner.close();
    }

    // Method to split the text into words and return the words along with their lengths in a 2D array
    public static String[][] getWordLengthArray(String str) {
        String[] words = str.split("\\s+");
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(words[i].length());
        }
        return wordLengthArray;
    }
}
