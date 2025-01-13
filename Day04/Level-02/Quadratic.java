
import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input values for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();

        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
        }

        // Close the Scanner object
        sc.close();
    }

    // Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // Check the discriminant value to determine the number of roots
        if (delta > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots
            return new double[]{};
        }
    }
}

