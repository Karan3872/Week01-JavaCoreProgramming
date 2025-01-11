
import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'RocketLaunchCountdownForLoop' to perform a countdown using a for loop

class RocketLaunchCountdownForLoop
{

    public static void main(String[] args)
	{

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number for the countdown
        System.out.print("Enter a number for countdown: ");
        int counter = sc.nextInt();  // Read the countdown start value
        
        // Use a for loop to count down from the entered value to 1
        for (int i = counter; i > 0; i--) {
            // Print the current value of the countdown
            System.out.println("Countdown: " + i);
        }
        
        // After the countdown reaches 1, print the final message
        System.out.println("Rocket Launched!");
    }
}

