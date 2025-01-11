import java.util.Scanner; // Import Scanner class for user input

// Create a class 'FizzBuzz' to check divisibility by 3, 5, and both 3 and 5 using a while loop
class FizzBuzzWhile {

    public static void main(String[] args) {

        // Create a Scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read the number from user input

        // Initialize a counter variable 'i' to 1
        int i = 1;
        
        // Use a while loop to iterate from 1 to the user input number
        while (i <= num) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); // If divisible by both, print "FizzBuzz"
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); // If divisible by 3, print "Fizz"
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // If divisible by 5, print "Buzz"
            } else {
                System.out.println(i); // Otherwise, print the number itself
            }
            // Increment the counter 'i' by 1
            i++;
        }
    }
}