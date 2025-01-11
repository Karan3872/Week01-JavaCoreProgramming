import java.util.Scanner; // Import Scanner class to handle user input

// Define a class 'FactorsOfNumber' to find the factors of a given number
class FactorsOfNumber
{

    public static void main(String[] args)
	{

        // Create a Scanner object 'sc' to get input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the user's input and store it in the variable 'number'
        int number = sc.nextInt();
        
        // Display a message indicating the factors of the given number
        System.out.println("The factors of " + number + " are:");
        
        // Loop through numbers starting from 1 up to 'number - 1' to check if they are factors
        for (int i = 1; i < number; i++) {
            // Check if the number is divisible by 'i' (i.e., remainder is zero)
            if (number % i == 0) {
                // If divisible, print the value of 'i' as a factor of the number
                System.out.println(i);
            }
        }
    }
}