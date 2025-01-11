/*
An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person

*/
// Import the Scanner class from the java.util package to take input from the user
import java.util.Scanner;

// Creating class BMICalculator to calculate and display BMI and weight status of individuals
public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        // sc is of type Scanner
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of persons
        System.out.print("Enter the number of persons: ");
        // number is of type int
        int number = sc.nextInt();

        // Create arrays to store height, weight, BMI, and weight status of the persons
        // heights is an array of type double with a size of number
        double[] heights = new double[number];
        // weights is an array of type double with a size of number
        double[] weights = new double[number];
        // bmis is an array of type double with a size of number
        double[] bmis = new double[number];
        // weightStatus is an array of type String with a size of number
        String[] weightStatus = new String[number];

        // Take input for weight and height of the persons
        for (int i = 0; i < number; i++) {
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();

            // Calculate BMI and store it in the bmis array
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status based on BMI
            if (bmis[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n", heights[i], weights[i], bmis[i], weightStatus[i]);
        }

        // Close the Scanner to prevent resource leaks
        sc.close();
    }
}
