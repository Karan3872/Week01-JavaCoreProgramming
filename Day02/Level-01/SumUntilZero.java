import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'SumUntilZero' to find the sum of numbers entered by the user until they enter 0

class SumUntilZero
{

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Create a variable 'total' to store the sum of numbers, initialized to 0.0
        double total = 0.0;

        // Create a variable 'input' to store the user's input number
        double input;
        
        // Use a while loop to continue summing the numbers until the user enters 0
        do {
            // Prompt the user to enter a number
            System.out.print("Enter a number (or 0 to stop): ");
            input = sc.nextDouble();  // Read the user's input
            
            // Add the input value to the total
            total += input;
        } while (input != 0);  // The loop continues until the user enters 0
        
        // Display the total sum of the numbers entered
        System.out.println("The total sum is: " + total);
    }
}