import java.util.Scanner;

public class VowelConsonantCounter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the count of vowels and consonants
        int[] counts = findVowelsAndConsonants(inputText);

        // Display the result
        displayCounts(counts);

        scanner.close();
    }
    
    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkChar(char ch) {
        // Convert the character to lowercase if it is an uppercase letter
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

    // Method to find vowels and consonants in a string and return the count
    public static int[] findVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkChar(ch);
            
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    // Method to display the count of vowels and consonants
    public static void displayCounts(int[] counts) {
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
}
