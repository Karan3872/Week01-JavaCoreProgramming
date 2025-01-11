import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'LargestNumber' to check which of the three numbers is the largest
// This class contains the main method which serves as the entry point of the program

class LargestNumber {

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        // Scanner is a class that provides methods to read different types of input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();  // Read the first number

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();  // Read the second number

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();  // Read the third number

        // Check if the first number is the largest of the three
        // The condition checks if number1 is greater than both number2 and number3
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        
        // Check if the second number is the largest of the three
        // The condition checks if number2 is greater than both number1 and number3
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        
        // Check if the third number is the largest of the three
        // The condition checks if number3 is greater than both number1 and number2
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);
        
        // Display the result to the user
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}

