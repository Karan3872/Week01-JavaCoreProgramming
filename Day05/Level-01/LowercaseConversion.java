/*Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. 
Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. 
And finally display the result
Write a program to split the text into words and return the words along with their lengths in a 2D array
*/


import java.util.Scanner;

public class LowercaseConversion {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert to lowercase using the custom method
        String customLowercase = convertToLowercaseCustom(inputString);

        // Convert to lowercase using the built-in method
        String builtInLowercase = inputString.toLowerCase();

        // Compare the two lowercase strings
        boolean areEqual = compareStringsUsingCharAt(customLowercase, builtInLowercase);

        // Display the results
        System.out.println("Lowercase using custom method: " + customLowercase);
        System.out.println("Lowercase using toLowerCase() method: " + builtInLowercase);
        System.out.println("Are both lowercase strings equal? " + areEqual);

        // Close the Scanner object
        scanner.close();
    }

    // Method to convert each character to lowercase using charAt()
    public static String convertToLowercaseCustom(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                charArray[i] = (char) (c + 32); // Convert to lowercase
            } else {
                charArray[i] = c; // Keep other characters unchanged
            }
        }
        return new String(charArray);
    }

    // Method to compare two strings using the charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
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
