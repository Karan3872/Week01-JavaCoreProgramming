// Creating CesiusToFahreneit class to convert temperature from Celsius to Fahrenheit
import java.util.Scanner;

class CelsiusToFahrenheit
{

   public static void main(String[] args) {
      // Create a scanner object to read user input
      Scanner sc = new Scanner(System.in);

      // Prompt the user to enter the temperature in Celsius
      // Create a variable celsius to store the temperature in Celsius
      System.out.print("Enter the temperature in Celsius: ");
      double celsius = sc.nextDouble();

      // Apply the formula to convert Celsius to Fahrenheit
      // Formula: (Celsius × 9/5) + 32 = Fahrenheit
      double fahrenheitResult = (celsius * 9 / 5) + 32;

      // Display the converted temperature in Fahrenheit
      System.out.println(celsius + " Celsius is equal to " + fahrenheitResult + " Fahrenheit");
   }
}