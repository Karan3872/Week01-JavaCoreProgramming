// Creating SimpleInterest to calculate Simple Interest
import java.util.Scanner;

class SimpleInterest {

   public static void main(String[] args) {
      // Create a scanner object to read user input
      Scanner sc = new Scanner(System.in);

      // Prompt the user to enter the principal amount
      // Create a variable principal to store the principal amount
      System.out.print("Enter the principal amount: ");
      double principal = sc.nextDouble();

      // Prompt the user to enter the rate of interest
      // Create a variable rate to store the rate of interest
      System.out.print("Enter the rate of interest: ");
      double rate = sc.nextDouble();

      // Prompt the user to enter the time period (in years)
      // Create a variable time to store the time period
      System.out.print("Enter the time period (in years): ");
      double time = sc.nextDouble();

      // Calculate the simple interest using the formula
      // Simple Interest = (Principal × Rate × Time) / 100
      double interest = (principal * rate * time) / 100;

      // Display the simple interest
      System.out.println("The Simple Interest is INR " + interest + 
                         " for Principal INR " + principal + 
                         ", Rate of Interest " + rate + "%" + 
                         " and Time " + time + " years.");
   }
}

