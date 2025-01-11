import java.util.Scanner; // Import Scanner class to read user input

// Create a class named 'PrimeNumberCheck' to determine if a number is prime

class PrimeNumberCheck
{

    public static void main(String[] args)
	{

        // Create a Scanner object 'sc' to get input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the number entered by the user and store it in the variable 'num'
        int num = sc.nextInt(); 
        
        // Initialize a boolean variable 'isPrime' to true, assuming the number is prime
        boolean isPrime = true;
        
        // Check if the number is less than or equal to 1, as numbers <= 1 cannot be prime
        if (num <= 1) {
            isPrime = false; // Set isPrime to false
        } else {
            // Loop from 2 to the square root of the number (for efficiency)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                // Check if the number is divisible by 'i'
                if (num % i == 0) {
                    isPrime = false; // If divisible, set isPrime to false and break the loop
                    break;
                }
            }
        }
        
        // Display the result to the user based on the 'isPrime' value
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
    }
}