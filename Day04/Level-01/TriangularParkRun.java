import java.util.Scanner;

public class TriangularParkRun {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the three sides of the triangle in meters
        System.out.print("Enter the length of side A (in meters): ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter the length of side B (in meters): ");
        double sideB = scanner.nextDouble();
        System.out.print("Enter the length of side C (in meters): ");
        double sideC = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = calculatePerimeter(sideA, sideB, sideC);

        // Determine the number of rounds needed to complete a 5 km run
        int rounds = calculateRounds(perimeter, 5000); // 5 km = 5000 meters

        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        // Close the Scanner object
        scanner.close();
    }

    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    // Method to compute the number of rounds needed to complete a given distance
    public static int calculateRounds(double perimeter, double distance) {
        return (int) Math.ceil(distance / perimeter);
    }
}

