// Creating SwapNumbers class to swap two numbers
import java.util.Scanner;

class SwapNumbers {

   public static void main(String[] args) {
      // Create a scanner object to read user input
      Scanner sc = new Scanner(System.in);

      // Prompt the user to enter the first number
      // Create a variable number1 to store the first number
      System.out.print("Enter the first number: ");
      int number1 = sc.nextInt();

      // Prompt the user to enter the second number
      // Create a variable number2 to store the second number
      System.out.print("Enter the second number: ");
      int number2 = sc.nextInt();

      // Swap the values of number1 and number2 using a temporary variable
      // Create a temporary variable to store the value of number1
      int temp = number1;
      number1 = number2;
      number2 = temp;

      // Display the swapped numbers
      System.out.println("The swapped numbers are " + number1 + " and " + number2);
   }
}

