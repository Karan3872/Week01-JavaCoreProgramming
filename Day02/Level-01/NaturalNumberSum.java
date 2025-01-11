import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'NaturalNumberSum' to check if a number is a natural number
// and calculate the sum of n natural numbers


class NaturalNumberSum {

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // Read the input number
        
        // Check if the number is a natural number (positive integer)
        // Natural numbers are positive integers starting from 1
        if (number > 0) {
            // Calculate the sum of n natural numbers using the formula: n * (n + 1) / 2
            int sum = number * (number + 1) / 2;
            
            // Display the sum of the first 'number' natural numbers
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If the number is not a positive integer, display an error message
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}

