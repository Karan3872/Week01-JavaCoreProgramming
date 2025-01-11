import java.util.Scanner; // Import the Scanner class for user input

// Class MultiplicationTable to display the multiplication table of a number

class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); // `sc` is a Scanner object for reading input from the console

        // Prompt the user to enter a number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = sc.nextInt(); // `number` is an integer that stores the user input

        // Create an array to store the multiplication results
        int[] table = new int[10]; // `table` is an array of integers with a length of 10

        // Calculate the multiplication table
        for (int i = 0; i < table.length; i++) {
            // Calculate the product of `number` and (i + 1)
            // Store the result of multiplying `number` by (i + 1) in the array
            table[i] = number * (i + 1); 
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 0; i < table.length; i++) {
            // Print the multiplication result in the format "number * (i + 1) = result"
            System.out.println(number + " * " + (i + 1) + " = " + table[i]); 
        }

        // Close the Scanner object
        sc.close(); // Close the Scanner to release the resource
    }
}
