import java.util.Scanner;

public class WindChillCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = scanner.nextDouble();

        // Calculate the wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.println("The wind chill temperature is: " + windChill + " Fahrenheit.");

        // Close the Scanner object
        scanner.close();
    }

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
