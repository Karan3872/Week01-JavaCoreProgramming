/*
Temperature Converter Program:
Write a program that converts temperatures between Fahrenheit and Celsius.
The program should have separate functions for converting from Fahrenheit 
to Celsius and from Celsius to Fahrenheit.
 */

// Importing the Scanner class from the java.util package for taking user input
import java.util.Scanner;

// Creating the class TemperatureConverter which contains methods to convert temperatures
public class TemperatureConverter 
{
    
    // Method to take input from the user
    public static double takeInput() 
	{
        // Creating a Scanner object named scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a temperature
        System.out.print("Enter the temperature to convert: ");
        
        // Storing the user's input in the variable temperature and returning it
        double temperature = scanner.nextDouble();
        
        // Closing the scanner object to prevent resource leaks
        
        // Returning the user input
        return temperature;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        // Converting Fahrenheit to Celsius using the formula (F - 32) * 5/9
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        // Converting Celsius to Fahrenheit using the formula (C * 9/5) + 32
        return (celsius * 9 / 5) + 32;
    }

    // Method to display the result
    public static void displayResult(double temperature, double convertedTemperature, String conversionType) {
        // Displaying the result to the user based on the conversion type
        System.out.println("The " + conversionType + " temperature is " + String.format("%.3f",convertedTemperature) + " degrees.");
    }

    public static void main(String[] args) 
	{

		// Taking the user's choice for conversion
        Scanner scanner = new Scanner(System.in);
		
	   // Calling the takeInput() method to get the user input
        double temperature = takeInput();
		
        System.out.print("Enter 'F' to convert from Fahrenheit to Celsius \n\t\tor\t\t\n'C' to convert from Celsius to Fahrenheit: ");
        char choice = scanner.next().toUpperCase().charAt(0);
		
		// Converting the temperature based on user input and displaying the result
        double convertedTemperature;
        String conversionType;
        scanner.close();

        if (choice == 'F') {
            // Converting from Fahrenheit to Celsius
            convertedTemperature = fahrenheitToCelsius(temperature);
            conversionType = "Celsius";
        } else if (choice == 'C') {
            // Converting from Celsius to Fahrenheit
            convertedTemperature = celsiusToFahrenheit(temperature);
            conversionType = "Fahrenheit";
        } else {
            System.out.println("Invalid choice. Please enter 'F' or 'C'.");
            return;
        }

        // Calling the displayResult() method to display the result to the user
        displayResult(temperature, convertedTemperature, conversionType);
    }
}