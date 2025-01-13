/*Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. 
Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the Uppercase Text and compare the two strings using the user-defined method. 
And finally display the result
*/


import java.util.Scanner;

public class UppercaseConversion {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert to uppercase using the custom method
        String customUppercase = convertToUppercaseCustom(inputString);

        // Convert to uppercase using the built-in method
        String builtInUppercase = inputString.toUpperCase();

        // Compare the two uppercase strings
        boolean areEqual = compareStringsUsingCharAt(customUppercase, builtInUppercase);

        // Display the results
        System.out.println("Uppercase using custom method: " + customUppercase);
        System.out.println("Uppercase using toUpperCase() method: " + builtInUppercase);
        System.out.println("Are both uppercase strings equal? " + areEqual);

        // Close the Scanner object
        scanner.close();
    }

    // Method to convert each character to uppercase using charAt()
    public static String convertToUppercaseCustom(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                charArray[i] = (char) (c - 32); // Convert to uppercase
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
