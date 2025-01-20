import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        //the user to enter a string
        System.out.println("Enter the string:");
        String s1 = sc.next(); // Read the user input string and store it in variable s1

        // Initialize the start index (not used in this case, but defined for clarity)
        int start = 0;
        // Get the length of the input string and store it in the end variable
        int end = s1.length();
        // Initialize an empty string to store the reversed string
        String s2 = "";

        // Loop to reverse the string by iterating from the end to the start
        // Start from the last character of the string (end - 1) and move towards the first character (index 0)
        for (int i = end - 1; i >= 0; i--) {
            // Append each character from the end of the original string to the new string s2
            s2 += s1.charAt(i);
        }

        // Display the reversed string to the user
        System.out.println("String after reversal: " + s2);

        // Close the Scanner object to free up resources
        sc.close();
    }
}
