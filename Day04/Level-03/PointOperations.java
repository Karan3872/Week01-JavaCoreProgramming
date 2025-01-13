import java.util.Scanner;

public class PointOperations {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take inputs for the two points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate and display the Euclidean distance
        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points: " + distance);

        // Find and display the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + lineEquation[0] + " * x + " + lineEquation[1]);

        // Close the Scanner object
        sc.close();
    }

    // Method to find the Euclidean distance between two points
    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of a line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // Slope
        double b = y1 - m * x1; // y-intercept
        return new double[]{m, b};
    }
}



