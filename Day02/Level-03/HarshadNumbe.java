import java.util.Scanner;

// Creating a class HarshadNumber to check if a number is a Harshad number

class HarshadNumber
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to allow user input
        Scanner scanner = new Scanner(System.in);

        // Declare the variables:
        // `number` to store the input number
        // `sum` to store the sum of digits of the number
        // `originalNumber` to store the original input number
        int number, sum = 0, originalNumber;

        // Prompt the user to input an integer
        System.out.print("Enter an integer: ");
        number = scanner.nextInt();  // Read the number entered by the user

        // Store the original number in another variable for comparison later
        originalNumber = number;

        // Start a while loop to process the digits of the number
        while (number != 0) {
            // Extract the last digit of the number by taking the remainder when dividing by 10
            sum += number % 10;

            // Remove the last digit by performing integer division by 10
            number /= 10;
        }

        // After processing all the digits, check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            // If divisible, print that the number is a Harshad number
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            // If not divisible, print that the number is not a Harshad number
            System.out.println(originalNumber + " is not a Harshad number.");
        }

        // Close the scanner to release the resources after input is completed
        scanner.close();
    }
}