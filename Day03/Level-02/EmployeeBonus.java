/*
Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees

*/
// Import the Scanner class from the java.util package to take input from the user
import java.util.Scanner;

// Creating class EmployeeBonus To calculate and display the bonus, old salary, and new salary of 10 employees
class EmployeeBonus 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Define arrays to store salaries, years of service, bonuses, and new salaries
        // These arrays are of type double to hold decimal values
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        
        // Variables to store total bonus, total old salary, and total new salary
        // These are also of type double to hold decimal values
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input for salaries and years of service for 10 employees
        for (int i = 0; i < 10; i++) {
            while (true) {
                // Prompt user for salary and years of service
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salaries[i] = scanner.nextDouble(); // Input of type double
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextDouble(); // Input of type double

                // Check for valid input; if invalid, prompt the user to enter again
                if (salaries[i] > 0 && yearsOfService[i] >= 0) {
                    break; // Exit the loop if input is valid
                } else {
                    System.out.println("Invalid input. Please enter again.");
                }
            }
        }

        // Loop to calculate bonuses and new salaries based on years of service
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus for more than 5 years
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus for 5 years or less
            }

            // Calculate new salary by adding bonus to the old salary
            newSalaries[i] = salaries[i] + bonuses[i];
            
            // Accumulate total bonus, total old salary, and total new salary
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print the total bonus payout, total old salary, and total new salary
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
