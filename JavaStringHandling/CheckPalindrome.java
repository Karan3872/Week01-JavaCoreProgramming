import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter the string:");
        String s1 = sc.next(); // Read the user input string and store it in variable s1

        // Initialize the start index to the beginning of the string
        int start = 0;
        // Get the length of the input string and set the end index to the last character
        int end = s1.length() - 1;

        // Initialize a boolean flag to check if the string is a palindrome
        boolean check = true;

        // Loop to compare characters from the start and end of the string
        while (start < end) {
            // Check if characters at start and end indices are not equal
            if (s1.charAt(start) != s1.charAt(end)) {
                // If they are not equal, set check to false and break the loop
                check = false;
                break;
            }
            // Increment the start index
            start++;
            // Decrement the end index
            end--;
        }

        // Display whether the string is a palindrome or not based on the check flag
        if (check) {
            System.out.println("Is this string a palindrome? " + check);
        } else {
            System.out.println("Is this string a palindrome? " + check);
        }

        // Close the Scanner object to free up resources
        sc.close();
    }
}
