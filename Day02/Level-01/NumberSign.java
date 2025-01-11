import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'NumberSign' to check if a number is positive, negative, or zero

class NumberSign
{

    public static void main(String[] args) 
	{

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // Read the input number
        
        // Check if the number is positive
        if (number > 0) {
            // If the number is positive, display the message "positive"
            System.out.println("The number is positive.");
        } 
        // Check if the number is negative
        else if (number < 0) {
            // If the number is negative, display the message "negative"
            System.out.println("The number is negative.");
        } 
        // If the number is neither positive nor negative, it must be zero
        else {
            // If the number is zero, display the message "zero"
            System.out.println("The number is zero.");
        }
    }
}