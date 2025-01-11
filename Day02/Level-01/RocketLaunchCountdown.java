
import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'RocketLaunchCountdown' to perform a countdown using a while loop

class RocketLaunchCountdown
{

    public static void main(String[] args) 
	{

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number for the countdown
        System.out.print("Enter a number for countdown: ");
        int counter = sc.nextInt();  // Read the countdown start value
        
        // Use a while loop to count down from the entered value to 1
        while (counter > 0) {
            // Print the current value of the countdown
            System.out.println("Countdown: " + counter);
            
            // Decrement the counter by 1
            counter--;
        }
        
        // After the countdown reaches 1, print the final message
        System.out.println("Rocket Launched!");
    }
}

