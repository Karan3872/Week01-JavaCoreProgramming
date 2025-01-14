import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter the string:");
        String s1 = sc.next(); // Read the user input string and store it in variable s1

        // Initialize an empty string to store the result without duplicates
        String result = "";

        // Loop through each character of the input string s1
        for (int i = 0; i < s1.length(); i++) {
            // Initialize a boolean flag to check if the character is a duplicate
            boolean isDuplicate = false;
            // Get the character at index i of the input string
            char ch = s1.charAt(i);

            // Inner loop to check if the character is already in the result string
            for (int j = 0; j < result.length(); j++) {
                // Compare the character ch with each character in the result string
                if (ch == result.charAt(j)) {
                    // If a match is found, set the flag to true and break the loop
                    isDuplicate = true;
                    break;
                }
            }

            // If the character is not a duplicate, append it to the result string
            if (!isDuplicate) {
                result += ch;
            }
        }

        // Display the result string after removing duplicates
        System.out.println("String after removing duplicates: " + result);

        // Close the Scanner object to free up resources
        sc.close();
    }
}



//  input =karan; resut=karn