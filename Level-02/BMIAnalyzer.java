/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameter. Calls the  user defined method to compute the BMI and the BMI Status and store in 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person Height, Weight, BMI and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/ 


import java.util.Scanner;

public class BMIAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeight = new double[10][2];

        // Taking user input for height and weight of 10 members
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            heightWeight[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            heightWeight[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiStatus = calculateBMIStatus(heightWeight);

        // Display the result in a tabular format
        displayBMIStatus(bmiStatus);

        scanner.close();
    }

    // Method to calculate BMI and status
    public static String[][] calculateBMIStatus(double[][] heightWeight) {
        String[][] bmiStatus = new String[heightWeight.length][4];

        for (int i = 0; i < heightWeight.length; i++) {
            double weight = heightWeight[i][0];
            double heightInMeters = heightWeight[i][1] / 100.0; // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            String status = getBMIStatus(bmi);

            bmiStatus[i][0] = String.valueOf(heightWeight[i][1]); // Height in cm
            bmiStatus[i][1] = String.valueOf(weight); // Weight in kg
            bmiStatus[i][2] = String.format("%.2f", bmi); // BMI rounded to 2 decimal places
            bmiStatus[i][3] = status; // BMI status
        }

        return bmiStatus;
    }

    // Method to get the BMI status based on the BMI value
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display the 2D string array in a tabular format
    public static void displayBMIStatus(String[][] bmiStatus) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < bmiStatus.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", bmiStatus[i][0], bmiStatus[i][1], bmiStatus[i][2], bmiStatus[i][3]);
        }
    }
}
