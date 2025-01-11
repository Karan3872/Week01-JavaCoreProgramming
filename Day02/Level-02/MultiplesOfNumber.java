
import java.util.Scanner; // Import Scanner class to handle user input

// Define a class 'MultiplesOfNumber' to find all multiples of a number below 100
class MultiplesOfNumber {

    public static void main(String[] args) {

        // Create a Scanner object 'sc' to allow input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to input a number
        System.out.print("Enter a number: ");
        
        // Read the user's input and store it in the 'number' variable
        int number = sc.nextInt();
        
        // Display a message indicating that we will find the multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");
        
        // Start a loop from 100 down to 1 to check for multiples of the number
        // Looping in reverse ensures we check all values below 100 and print the largest multiples first
        for (int i = 100; i >= 1; i--) {
            // Check if 'i' is divisible by the 'number'
            if (i % number == 0) {
                // If 'i' is divisible by the 'number', print it as a multiple
                System.out.println(i);
            }
        }
    }
}

