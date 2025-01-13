
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Take user input for the year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();
        
        // Check if the year is valid for Gregorian calendar
        if (year < 1582) {
            System.out.println("Error: The LeapYear program only works for years >= 1582.");
        } else {
            // Check if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        
        // Close the Scanner object
        sc.close();
    }
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4 and not divisible by 100 or divisible by 400
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}

