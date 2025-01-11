import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'EmployeeBonus' to calculate the bonus based on years of service
class EmployeeBonus 
{

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the salary and years of service of the employee
        System.out.print("Enter the salary of the employee: ");
        double salary = sc.nextDouble();  // Read the salary value
        
        System.out.print("Enter the years of service of the employee: ");
        int yearsOfService = sc.nextInt();  // Read the years of service
        
        // Check if the years of service are greater than 5
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of the salary
            double bonus = salary * 0.05;
            // Display the bonus amount
            System.out.println("The bonus for the employee is: " + bonus);
        } else {
            // If the years of service are not greater than 5, no bonus is awarded
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
