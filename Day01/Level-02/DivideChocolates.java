// Creating DivideChocolates to divide N chocolates among M children
import java.util.Scanner;

class DivideChocolates {

   public static void main(String[] args) {
      // Create a scanner object to read user input
      Scanner sc = new Scanner(System.in);

      // Prompt the user to enter the number of chocolates
      // Create a variable numberOfChocolates to store the total chocolates
      System.out.print("Enter the number of chocolates: ");
      int numberOfChocolates = sc.nextInt();

      // Prompt the user to enter the number of children
      // Create a variable numberOfChildren to store the total number of children
      System.out.print("Enter the number of children: ");
      int numberOfChildren = sc.nextInt();

      // Calculate the number of chocolates each child gets using integer division
      // Create a variable chocolatesPerChild to store the result of the division
      int chocolatesPerChild = numberOfChocolates / numberOfChildren;

      // Calculate the remaining chocolates using the modulus operator
      // Create a variable remainingChocolates to store the remainder
      int remainingChocolates = numberOfChocolates % numberOfChildren;

      // Display the results of chocolate distribution
      System.out.println("The number of chocolates Each child gets " + chocolatesPerChild + " chocolates and the remaining chocolates are " + remainingChocolates);
   }
}

