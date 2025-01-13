
import java.util.Random;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        // Define 2D array to save the salary and years of service
        int[][] employees = determineSalaryAndYearsOfService(10);

        // Calculate the new salary and bonus based on the logic defined above
        double[][] newSalariesAndBonuses = calculateNewSalaryAndBonus(employees);

        // Calculate the sum of the old salary, the sum of the new salary, and the total bonus amount
        displayResults(employees, newSalariesAndBonuses);
    }

    // Method to determine the salary and years of service and return the same
    public static int[][] determineSalaryAndYearsOfService(int numberOfEmployees) {
        Random random = new Random();
        int[][] employees = new int[numberOfEmployees][2];
        for (int i = 0; i < numberOfEmployees; i++) {
            int salary = random.nextInt(90000) + 10000; // 5-digit salary
            int yearsOfService = random.nextInt(15); // Years of service between 0 to 14
            employees[i][0] = salary;
            employees[i][1] = yearsOfService;
        }
        return employees;
    }

    // Method to calculate the new salary and bonus based on the logic defined above
    public static double[][] calculateNewSalaryAndBonus(int[][] employees) {
        double[][] newSalariesAndBonuses = new double[employees.length][2];
        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i][0];
            int yearsOfService = employees[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            newSalariesAndBonuses[i][0] = newSalary;
            newSalariesAndBonuses[i][1] = bonus;
        }
        return newSalariesAndBonuses;
    }

    // Method to display the results in a tabular format
    public static void displayResults(int[][] employees, double[][] newSalariesAndBonuses) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Employee", "Old Salary", "Years", "New Salary", "Bonus");
        for (int i = 0; i < employees.length; i++) {
            int oldSalary = employees[i][0];
            int yearsOfService = employees[i][1];
            double newSalary = newSalariesAndBonuses[i][0];
            double bonus = newSalariesAndBonuses[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f\n", i + 1, oldSalary, yearsOfService, newSalary, bonus);
        }

        System.out.println("\nSummary:");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Amount: %.2f\n", totalBonus);
    }
}

