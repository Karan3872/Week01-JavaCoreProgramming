// Create DoubleOpt class to compute and display operations with double values
import java.util.Scanner;

class DoubleOpt {

   public static void main(String[] args) {
      // Create a Scanner object to read input from the user
      Scanner sc = new Scanner(System.in);

      // Prompt the user to enter a double value for a
      // Create a variable a to store the first input value
      System.out.print("Enter the first double value (a): ");
      double a = sc.nextDouble();

      // Prompt the user to enter a double value for b
      // Create a variable b to store the second input value
      System.out.print("Enter the second double value (b): ");
      double b = sc.nextDouble();

      // Prompt the user to enter a double value for c
      // Create a variable c to store the third input value
      System.out.print("Enter the third double value (c): ");
      double c = sc.nextDouble();

      // Perform the operation a + b * c and store the result in result1
      // This operation evaluates b * c first and then adds a
      double result1 = a + b * c;

      // Perform the operation a * b + c and store the result in result2
      // This operation evaluates a * b first and then adds c
      double result2 = a * b + c;

      // Perform the operation c + a / b and store the result in result3
      // This operation evaluates a / b first and then adds c
      double result3 = c + a / b;

      // Perform the operation a % b + c and store the result in result4
      // This operation evaluates a % b first (modulus for doubles) and then adds c
      double result4 = a % b + c;

      // Display the results of all double operations
      System.out.println("The results of Double Operations are:");
      System.out.println("a + b * c = " + result1);
      System.out.println("a * b + c = " + result2);
      System.out.println("c + a / b = " + result3);
      System.out.println("a % b + c = " + result4);
   }
}