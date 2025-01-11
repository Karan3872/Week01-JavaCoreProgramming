// Creating ToatlIncome to calculate total income by adding salary and bonus
import java.util.Scanner;

class TotalIncome {

   public static void main(String[] args) {
      // Create a scanner object to read user input
      Scanner sc = new Scanner(System.in);

      // Prompt the user to enter salary and bonus
      // Create a variable salary to store the income from salary
      System.out.print("Enter the salary: ");
      double salary = sc.nextDouble();

      // Create a variable bonus to store the bonus amount
      System.out.print("Enter the bonus: ");
      double bonus = sc.nextDouble();

      // Calculate the total income by adding salary and bonus
      double totalIncome = salary + bonus;

      // Display the total income details
      System.out.println("The salary is INR " + salary + 
                         " and the bonus is INR " + bonus + 
                         ". Hence, the total income is INR " + totalIncome);
   }
}