import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'FactorialForLoop' to compute the factorial of a number using a for loop
class FactorialForLoop {

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();  // Read the input number
        
        // Check if the number is a positive integer
        if (number >= 0) {
            // Initialize a variable 'factorial' to store the result
            int factorial = 1;
            
            // Use a for loop to compute the factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;  // Multiply the current value of 'factorial' by 'i'
            }
            
            // Display the factorial of the number
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            // If the number is negative, display an error message
            System.out.println("Factorial is not defined for negative numbers.");
        }
    }
}