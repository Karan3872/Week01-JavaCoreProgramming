import java.util.Scanner;

public class CompareCharArray {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Get characters using the user-defined method
        char[] userDefinedChars = getCharactersUsingCustomMethod(inputString);

        // Get characters using the built-in toCharArray() method
        char[] builtInChars = inputString.toCharArray();

        // Compare the two character arrays
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        // Display the results
        System.out.println("Characters using custom method: " + new String(userDefinedChars));
        System.out.println("Characters using toCharArray() method: " + new String(builtInChars));
        System.out.println("Are both character arrays equal? " + areEqual);

        // Close the Scanner object
        scanner.close();
    }

    // Method to return the characters in a string without using toCharArray()
    public static char[] getCharactersUsingCustomMethod(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    // Method to compare two character arrays and return a boolean result
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
