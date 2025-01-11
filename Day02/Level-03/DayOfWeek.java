import java.util.Scanner;

//// Creating a class DayOfWeek to calculate the day of the week for a given date
public class DayOfWeek 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store month, day, and year
        int m, d, y;

        // Prompt the user to input the month, day, and year
        System.out.print("Enter month: ");
        m = scanner.nextInt();  // Read the month
        System.out.print("Enter day: ");
        d = scanner.nextInt();  // Read the day
        System.out.print("Enter year: ");
        y = scanner.nextInt();  // Read the year

        // Apply the Zeller's Congruence formula to calculate the day of the week
        int y0 = y - (14 - m) / 12;  // Adjust the year based on the month
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;  // Apply leap year adjustments
        int m0 = m + 12 * ((14 - m) / 12) - 2;  // Adjust month for the formula
        int d0 = (d + x + 31 * m0 / 12) % 7;  // Calculate the day of the week using modulus (0 = Sunday, 1 = Monday, etc.)

        // Output the result, the day of the week as a number
        System.out.println("Day of the week: " + d0);

        // Close the scanner to release resources after input
        scanner.close();
    }
}