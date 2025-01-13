import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Initialize a 2D array to store weight, height, and BMI for 10 persons
        double[][] persons = new double[10][3];

        // Take input for weight and height of each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the weight (in kg) of person " + (i + 1) + ": ");
            persons[i][0] = scanner.nextDouble();
            System.out.print("Enter the height (in cm) of person " + (i + 1) + ": ");
            persons[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person and populate the array
        calculateBMI(persons);

        // Determine the BMI status for each person
        String[] bmiStatus = determineBMIStatus(persons);

        // Display the height, weight, BMI, and status of each individual
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s%n", i + 1, persons[i][0], persons[i][1], persons[i][2], bmiStatus[i]);
        }

        // Close the Scanner object
        scanner.close();
    }

    // Method to calculate BMI for each person and populate the array
    public static void calculateBMI(double[][] persons) {
        for (int i = 0; i < persons.length; i++) {
            double weight = persons[i][0];
            double heightInMeters = persons[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            persons[i][2] = Math.round(bmi * 100.0) / 100.0; // Round off to 2 decimal places
        }
    }

    // Method to determine the BMI status for each person
    public static String[] determineBMIStatus(double[][] persons) {
        String[] status = new String[persons.length];
        for (int i = 0; i < persons.length; i++) {
            double bmi = persons[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}



