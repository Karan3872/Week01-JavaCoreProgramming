import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'SumNaturalNumbersFor' to compute the sum of n natural numbers and compare with the formula
class SumNaturalNumbersFor {

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // Read the input number
        
        // Check if the number is a natural number (positive integer)
        if (number > 0) {
            // Calculate the sum of n natural numbers using a for loop
            int sumLoop = 0;
            for (int i = 1; i <= number; i++) {
                sumLoop += i;
            }

            // Calculate the sum of n natural numbers using the formula: n * (n + 1) / 2
            int sumFormula = number * (number + 1) / 2;
            
            // Compare the two results and display the results to the user
            System.out.println("Sum using for loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);
            
            // Check if both methods give the same result
            if (sumLoop == sumFormula) {
                System.out.println("Both calculations are correct.");
            } else {
                System.out.println("The calculations do not match.");
            }
        } else {
            // If the number is not a positive integer, display an error message
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}