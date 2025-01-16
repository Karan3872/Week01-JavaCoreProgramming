import java.util.Scanner;

public class VowelConsonantAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the characters and their types (Vowel, Consonant, or Not a Letter)
        String[][] charTypes = findCharTypes(inputText);

        // Display the result in a tabular format
        displayCharTypes(charTypes);

        scanner.close();
    }

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkChar(char ch) {
        // Convert the character to lowercase if it is an uppercase letter using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        // Check if the character is a consonant
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        // If the character is not a letter
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string and return the character and type in a 2D array
    public static String[][] findCharTypes(String text) {
        String[][] charTypes = new String[text.length()][2];

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            charTypes[i][0] = String.valueOf(ch);
            charTypes[i][1] = checkChar(ch);
        }

        return charTypes;
    }

    // Method to display the 2D array of character types in a tabular format
    public static void displayCharTypes(String[][] charTypes) {
        System.out.printf("%-10s %s%n", "Character", "Type");
        System.out.println("___________________________");

        // Loop through each character and its type
        for (String[] charType : charTypes) {
            System.out.printf("%-10s %s%n", charType[0], charType[1]);
        }
    }
}
