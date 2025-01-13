import java.util.Scanner;

public class SpringSeason {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the month and day
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        // Check if it is spring season and print the result
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Close the Scanner object
        scanner.close();
    }

    // Method to check if the date is in the spring season
    public static boolean isSpringSeason(int month, int day) {
        // Spring season is from March 20 to June 20
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }
}

