import java.util.Scanner;

public class StringTrimmer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Trim the leading and trailing spaces using custom methods
        int[] trimIndices = trimSpacesIndices(inputText);
        String trimmedText = createSubstring(inputText, trimIndices[0], trimIndices[1]);

        // Trim the string using the built-in method for comparison
        String builtInTrimmedText = inputText.trim();

        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedText, builtInTrimmedText);

        // Display the result
        System.out.println("Trimmed Text (Custom Method): '" + trimmedText + "'");
        System.out.println("Trimmed Text (Built-in Method): '" + builtInTrimmedText + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        scanner.close();
    }

    // Method to trim leading and trailing spaces and return start and end indices
    public static int[] trimSpacesIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // end + 1 to make the end index inclusive
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        char[] substringArray = new char[end - start];
        for (int i = start; i < end; i++) {
            substringArray[i - start] = text.charAt(i);
        }
        return new String(substringArray);
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
