// Create QuotientRemainder class to compute quotient and remainder
import java.util.Scanner;

class QuotientRemainder 
{

   public static void main(String[] args)
   {
      // Create a Scanner object to read input from the user
      Scanner sc = new Scanner(System.in);

      // Prompt the user to enter the first number
      // Create a variable number1 to store the first input number
      System.out.print("Enter the first number (number1): ");
      int number1 = sc.nextInt();

      // Prompt the user to enter the second number
      // Create a variable number2 to store the second input number
      System.out.print("Enter the second number (number2): ");
      int number2 = sc.nextInt();

      // Perform integer division to calculate the quotient
      // Create a variable quotient to store the result of number1 / number2
      int quotient = number1 / number2;

      // Calculate the remainder using the modulus operator
      // Create a variable remainder to store the result of number1 % number2
      int remainder = number1 % number2;

      // Display the result with the values of quotient and remainder
      System.out.println("The Quotient is " + quotient + 
                         " and the Remainder is " + remainder + 
                         " of the two numbers " + number1 + " and " + number2);
   }
}