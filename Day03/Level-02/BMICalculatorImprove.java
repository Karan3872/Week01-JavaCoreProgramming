/*
Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint => 
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person

*/
// Import the Scanner class from the java.util package to take input from the user
import java.util.Scanner;

// Creating class BMICalculator2D to calculate and display BMI and weight status of individuals using a 2D array
public class BMICalculatorImprove
{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        // sc is of type Scanner
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of persons
        System.out.print("Enter the number of persons: ");
        // number is of type int
        int number = sc.nextInt();

        // Create a multi-dimensional array to store height, weight, and BMI of the persons
        // personData is a 2D array of type double with size [number][3]
        double[][] personData = new double[number][3];
        // Create an array to store the weight status of the persons
        // weightStatus is an array of type String with a size of number
        String[] weightStatus = new String[number];

        // Take input for weight and height of the persons and validate for positive values
        for (int i = 0; i < number; i++) {
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            // Validate height to ensure it is positive
            while (personData[i][0] <= 0) {
                System.out.print("Height must be positive. Please re-enter height: ");
                personData[i][0] = sc.nextDouble();
            }

            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
            // Validate weight to ensure it is positive
            while (personData[i][1] <= 0) {
                System.out.print("Weight must be positive. Please re-enter weight: ");
                personData[i][1] = sc.nextDouble();
            }

            // Calculate BMI and store it in the personData array
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        // Close the Scanner to prevent resource leaks
        // sc.close() closes the Scanner object
        sc.close();
    }
}
