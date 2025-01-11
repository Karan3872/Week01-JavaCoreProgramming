
import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'SumUntilZeroOrNegative' to find the sum of numbers until user enters 0 or a negative number
class SumUntilZeroOrNegative 
{

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Create a variable 'total' to store the sum of numbers, initialized to 0.0
        double total = 0.0;

        // Create a variable 'input' to store the user's input number
        double input;
        
        // Use an infinite while loop for continual input until a break condition is met
        while (true) {
            // Prompt the user to enter a number
            System.out.print("Enter a number (or a negative number to stop): ");
            input = sc.nextDouble();  // Read the user's input
            
            // If the input number is 0 or negative, break the loop
            if (input <= 0) {
                break;
            }
            
            // Add the input value to the total
            total += input;
        }
        
        // Display the total sum of the numbers entered
        System.out.println("The total sum is: " + total);
    }
}

