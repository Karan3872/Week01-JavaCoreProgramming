import java.util.Scanner;

public class FindLength {

    // Method to calculate the length of a string using a custom approach
    public static int length(String s1) {
        int count = 0; // Initialize a counter to count the characters in the string
        try {
            // Infinite loop to iterate through the characters of the string
            while (true) {
                // Attempt to access the character at the current index
                s1.charAt(count);
                // Increment the counter for each character accessed
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // When an IndexOutOfBoundsException occurs, it indicates the end of the string
            return count; // Return the final count as the length of the string
        }
    }

    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter the string:");
        String s1 = sc.next(); // Read the user input string and store it in variable s1

        // Calculate the length of the string using the user-defined method
        int userDefinedMethod = length(s1);
        // Calculate the length of the string using the built-in length() method
        int builtInMethod = s1.length();

        // Display the lengths calculated by both methods
        System.out.println("String length using user-defined method: " + userDefinedMethod);
        System.out.println("String length using built-in method: " + builtInMethod);

        // Close the Scanner object to free up resources
        sc.close();
    }
}
