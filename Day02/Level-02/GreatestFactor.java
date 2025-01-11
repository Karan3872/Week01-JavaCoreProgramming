import java.util.Scanner; // Import the Scanner class to enable user input functionality

// Define a class 'GreatestFactor' to compute the greatest factor of a given number excluding the number itself
class GreatestFactor
 {

    public static void main(String[] args) {

        // Create a Scanner object 'sc' to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number for which the greatest factor is to be found
        System.out.print("Enter a number: ");
        
        // Read the user input (an integer) and store it in the 'number' variable
        int number = sc.nextInt();
        
        // Initialize a variable 'greatestFactor' with a default value of 1, as the smallest possible factor is always 1
        int greatestFactor = 1;
        
        // Create a loop starting from 'number - 1' down to 1 to check for factors of the number (excluding itself)
        // The loop iterates in reverse order to find the largest factor first
        for (int i = number - 1; i >= 1; i--) {
            // Check if 'i' is a factor of 'number' (i.e., if 'number' modulo 'i' equals zero)
            if (number % i == 0) {
                // If 'i' is a factor, store it in 'greatestFactor' and break the loop as we found the largest factor
                greatestFactor = i;
                break; // Exit the loop after finding the greatest factor
            }
        }
        
        // Output the greatest factor to the user
        System.out.println("The greatest factor of " + number + " excluding itself is: " + greatestFactor);
    }
}