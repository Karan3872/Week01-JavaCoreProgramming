// Creating a class to calculate BMI and determine weight status
import java.util.Scanner;

class BMICalculator 
{
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their weight in kilograms
        System.out.print("Enter your weight in kilograms (kg): ");
        // Declare a variable to store the weight and take user input
        double weight = input.nextDouble();

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters (cm): ");
        // Declare a variable to store the height and take user input
        double heightInCm = input.nextDouble();

        // Convert height from centimeters to meters (1 cm = 0.01 meters)
        double heightInMeters = heightInCm / 100;

        // Calculate BMI using the formula BMI = weight / (height * height)
        double bmi = weight / (heightInMeters * heightInMeters);

        // Determine the weight status based on the BMI value
        String status;
        if (bmi <= 18.4) {
            // If BMI is less than or equal to 18.4, the person is underweight
            status = "Underweight";
        } else if (bmi <= 24.9) {
            // If BMI is between 18.5 and 24.9, the person has a normal weight
            status = "Normal";
        } else if (bmi <= 39.9) {
            // If BMI is between 25.0 and 39.9, the person is overweight
            status = "Overweight";
        } else {
            // If BMI is 40.0 or above, the person is obese
            status = "Obese";
        }

        // Display the calculated BMI and the corresponding weight status
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Weight Status: " + status);
    }
}

