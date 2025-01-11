import java.util.Scanner; // Import the Scanner class for user input

// Class StoreValues to store multiple values in an array
class StoreValues
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Initialize an array to store up to 10 numbers
        double[] values = new double[10]; // `values` is an array of doubles with a length of 10
        double total = 0.0; // `total` is a double variable to store the sum of all numbers
        int index = 0; // `index` is an integer to keep track of the current position in the array

        System.out.println("Enter up to 10 numbers. Enter 0 or a negative number to stop:");

        // Infinite loop to take user input
        while (true) {
            // Prompt the user for input
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = sc.nextDouble(); // `input` is a double variable to store the user input

            // Break the loop if the user enters 0 or a negative number
            if (input <= 0) {
                break;
            }

            // Store the input in the array
            values[index] = input; // Store the user input in the array at the current index
            index++; // Increment the index to move to the next position

            // Break the loop if the array reaches its maximum capacity
            if (index == 10) {
                break;
            }
        }

        // Calculate the sum of all values
        for (int i = 0; i < index; i++) {
            total += values[i]; // Add each value in the array to `total`
        }

        // Display the entered values
        System.out.println("\nThe entered numbers are:");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + " "); // Print each value in the array
        }

        // Display the total sum of the numbers
        System.out.println("\nSum of all numbers: " + total);

        // Close the Scanner object
        sc.close(); // Close the Scanner to release the resource
    }
}
