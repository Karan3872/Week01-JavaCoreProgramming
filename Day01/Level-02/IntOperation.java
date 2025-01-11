// Create IntOperation class to compute and display integer operations
import java.util.Scanner;

class IntOperation 
{

   public static void main(String[] args) 
   {
      // Create a Scanner object to read input from the user
      Scanner sc = new Scanner(System.in);

      // Prompt the user to enter an integer value for a
      // Create a variable a to store the first input integer
      System.out.print("Enter the first integer (a): ");
      int a = sc.nextInt();

      // Prompt the user to enter an integer value for b
      // Create a variable b to store the second input integer
      System.out.print("Enter the second integer (b): ");
      int b = sc.nextInt();

      // Prompt the user to enter an integer value for c
      // Create a variable c to store the third input integer
      System.out.print("Enter the third integer (c): ");
      int c = sc.nextInt();

      // Perform the operation a + b * c and store the result in result1
      // This operation evaluates b * c first (multiplication has higher precedence) 
      // and then adds the result to a
      int result1 = a + b * c;

      // Perform the operation a * b + c and store the result in result2
      // This operation evaluates a * b first and then adds c
      int result2 = a * b + c;

      // Perform the operation c + a / b and store the result in result3
      // This operation evaluates a / b first (division has higher precedence)
      // and then adds the result to c
      int result3 = c + a / b;

      // Perform the operation a % b + c and store the result in result4
      // This operation evaluates a % b first (modulus has higher precedence)
      // and then adds the result to c
      int result4 = a % b + c;

      // Display the results of all integer operations
      System.out.println("The results of Integer Operations are:");
      System.out.println("a + b * c = " + result1);
      System.out.println("a * b + c = " + result2);
      System.out.println("c + a / b = " + result3);
      System.out.println("a % b + c = " + result4);
   }
}

