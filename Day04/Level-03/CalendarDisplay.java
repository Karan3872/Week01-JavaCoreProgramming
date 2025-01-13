
import java.util.Scanner;

public class CalendarDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        scanner.close();
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        // Get the name of the month
        String monthName = getMonthName(month);

        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(month, year);

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("\n  " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonths = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // Check for leap year in February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return daysInMonths[month - 1];
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + 31 * m / 12) % 7;
    }
}

