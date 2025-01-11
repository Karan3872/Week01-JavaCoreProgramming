// Creating TriangularParRounds class to calculate the number of rounds to complete a 5 km run in a triangular park
import java.util.Scanner;

class TriangularParkRounds {

   public static void main(String[] args) {
      // Create a scanner object to read user input
      Scanner sc = new Scanner(System.in);

      // Prompt the user to enter the lengths of the three sides of the triangle
      // Create variables side1, side2, side3 to store the lengths of the triangle sides
      System.out.print("Enter the length of the first side: ");
      double side1 = sc.nextDouble();
      System.out.print("Enter the length of the second side: ");
      double side2 = sc.nextDouble();
      System.out.print("Enter the length of the third side: ");
      double side3 = sc.nextDouble();

      // Calculate the perimeter of the triangle
      // Perimeter = side1 + side2 + side3
      double perimeter = side1 + side2 + side3;

      // Calculate the number of rounds to complete 5 km (5000 meters)
      // Rounds = total distance / perimeter of triangle
      double rounds = 5000 / perimeter;

      // Display the number of rounds needed to complete 5 km
      System.out.println("The total number of rounds the athlete will run to complete 5 km is " + Math.ceil(rounds));
   }
}

