// Creating FahrenheitToCelsius class to convert temperature from Fahrenheit to Celsius
import java.util.Scanner;

class FahrenheitToCelsius {

   public static void main(String[] args) {
      // Create a scanner object to read user input
      Scanner sc = new Scanner(System.in);

      // Prompt the user to enter the temperature in Fahrenheit
      // Create a variable fahrenheit to store the temperature in Fahrenheit
      System.out.print("Enter the temperature in Fahrenheit: ");
      double fahrenheit = sc.nextDouble();

      // Apply the formula to convert Fahrenheit to Celsius
      // Formula: (Fahrenheit − 32) × 5/9 = Celsius
      double celsiusResult = (fahrenheit - 32) * 5 / 9;

      // Display the converted temperature in Celsius
      System.out.println(fahrenheit + " Fahrenheit is equal to " + celsiusResult + " Celsius");
   }
}