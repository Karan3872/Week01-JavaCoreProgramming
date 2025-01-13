import java.util.Scanner;

public class CollinearPointsChecker {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the coordinates of the three points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check collinearity using slope formula
        boolean areCollinearUsingSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using slope formula: " + areCollinearUsingSlope);

        // Check collinearity using area of triangle formula
        boolean areCollinearUsingArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area formula: " + areCollinearUsingArea);

        // Close the Scanner object
        scanner.close();
    }

    // Method to check if three points are collinear using the slope formula
    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check if three points are collinear using the area of the triangle formula
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}
