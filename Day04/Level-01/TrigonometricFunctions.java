import java.util.Scanner;

public class TrigonometricFunctions {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Calculate the trigonometric functions
        double[] trigValues = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("Sine of " + angle + " degrees: " + trigValues[0]);
        System.out.println("Cosine of " + angle + " degrees: " + trigValues[1]);
        System.out.println("Tangent of " + angle + " degrees: " + trigValues[2]);

        // Close the Scanner object
        scanner.close();
    }

    // Method to calculate the trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[]{sine, cosine, tangent};
    }
}

