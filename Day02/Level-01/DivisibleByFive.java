import java.util.Scanner; 
// Create a class 'DivisibleByFive' to check if a number is divisible by 5

class DivisibleByFive {

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        // Scanner is a class that provides methods to read different types of input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        // Use 'System.out.print' to display the prompt text on the console
        System.out.print("Enter a number: ");
        
        // Read the user's input as an integer and store it in the 'number' variable
        // The nextInt() method reads an integer from the console
        int number = sc.nextInt();

        // Check if the number is divisible by 5 using the modulus operator
        // The modulus operator (%) gives the remainder when dividing 'number' by 5
        // If the remainder is 0, the number is divisible by 5
        boolean divisibleByFive = (number % 5 == 0);
        
        // Display the result to the user
        // 'System.out.println' prints the output to the console
        // It concatenates the string with the value of 'number' and the result of the divisibility check
        System.out.println("Is the number " + number + " divisible by 5? " + divisibleByFive);
    }
}