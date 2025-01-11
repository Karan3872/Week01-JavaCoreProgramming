import java.util.Scanner; // Import the Scanner class for user input

// Class CheckNumber to check if numbers are positive, negative, or zero
class CheckNumber 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); // `sc` is a Scanner object for reading input from the console

        // Declare an array to store 5 numbers
        int[] numbers = new int[5]; // `numbers` is an array of integers with a length of 5

        // Prompt the user to enter 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt(); // Store the entered number in the array
        }

        // Check each number and determine its type
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print("Number " + numbers[i] + " is positive"); // Check if the number is positive
                if (numbers[i] % 2 == 0) {
                    System.out.println(" and even."); // Positive even number
                } else {
                    System.out.println(" and odd."); // Positive odd number
                }
            } else if (numbers[i] < 0) {
                System.out.println("Number " + numbers[i] + " is negative."); // Negative number
            } else {
                System.out.println("Number " + numbers[i] + " is zero."); // Zero
            }
        }

        // Compare the first and last elements
        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than the last element."); // First element is greater
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("First element is less than the last element."); // First element is less
        } else {
            System.out.println("First and last elements are equal."); // First and last elements are equal
        }

        // Close the Scanner object
        sc.close(); // Close the Scanner to release the resource
    }
}
