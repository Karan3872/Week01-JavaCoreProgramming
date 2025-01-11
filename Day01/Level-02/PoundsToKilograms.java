// Creating PoundsToKilograms to convert weight in pounds to kilograms
import java.util.Scanner;

class PoundsToKilograms {

   public static void main(String[] args) {
      // Create a scanner object to read user input
      Scanner sc = new Scanner(System.in);

      // Prompt the user to enter the weight in pounds
      // Create a variable weightInPounds to store the weight in pounds
      System.out.print("Enter the weight in pounds: ");
      double weightInPounds = sc.nextDouble();

      // Convert the weight from pounds to kilograms using the conversion factor 1 pound = 2.2 kg
      // Create a variable weightInKg to store the weight in kilograms
      double weightInKg = weightInPounds * 2.2;

      // Display the weight in kilograms
      System.out.println("The weight of the person in pounds is " + weightInPounds + 
                         " and in kilograms is " + weightInKg);
   }
}