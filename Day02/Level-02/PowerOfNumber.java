
import java.util.Scanner; // Import Scanner class to allow input from the user

// Define a class 'PowerOfNumber' to calculate the power of a number
class PowerOfNumber {

    public static void main(String[] args) {

        // Create a Scanner object 'sc' for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the base number (the number to be raised to a power)
        System.out.print("Enter the base number: ");
        
        // Read the base number input from the user and store it in the variable 'number'
        int number = sc.nextInt();
        
        // Prompt the user to enter the exponent (the power to which the base number should be raised)
        System.out.print("Enter the power (exponent): ");
        
        // Read the exponent input from the user and store it in the variable 'power'
        int power = sc.nextInt();
        
        // Initialize a variable 'result' with 1, as the base raised to the power of 0 equals 1
        int result = 1;
        
        // Loop 'power' times (i.e., iterate from 1 to the exponent value)
        // Each time, multiply the 'result' by the base 'number'
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply 'result' by the base number each iteration
        }
        
        // Output the calculated power (base raised to the exponent)
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}

