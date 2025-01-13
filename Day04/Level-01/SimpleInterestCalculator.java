import java.util.Scanner;
public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take user input for principal, rate, and time
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the Time period (in years): ");
        double time = sc.nextDouble();

        // Calculate the simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + " years.");

        // Close the Scanner object
        sc.close();
    }

    // Method to calculate the simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
