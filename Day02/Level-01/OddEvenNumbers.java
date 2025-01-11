import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'OddEvenNumbers' to print odd and even numbers between 1 and the entered number
class OddEvenNumbers
{

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // Read the input number
        
        // Check if the number is a positive integer
        if (number > 0) {
            // Use a for loop to iterate through all numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the current number is even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } 
                // If the number is not even, it must be odd
                else {
                    System.out.println(i + " is an odd number.");
                }
            }
        } else {
            // If the number is not a positive integer, display an error message
            System.out.println("The number " + number + " is not a valid natural number.");
        }
    }
}