
import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'MultiplicationTable' to print the multiplication table of a number

class MultiplicationTable
{

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // Read the input number
        
        // Use a for loop to generate the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Print the multiplication of the number with i
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

