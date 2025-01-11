
import java.util.Scanner; // Import the Scanner class to get input from the user

// Create a class 'LeapYear' to check if a given year is a leap year
class LeapYearSingleLine
{

    public static void main(String[] args)
	{

        // Create a scanner object 'sc' to read input from the user
        // The Scanner class provides methods to read different types of data from the console
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a year by displaying a message
        // 'System.out.print' is used to display the prompt message on the console
        System.out.print("Enter a year: ");
        
        // Read the input year entered by the user and store it in the variable 'year'
        // The 'nextInt()' method of the Scanner class is used to read an integer input
        int year = sc.nextInt(); 

        // Check if the entered year is valid, i.e., greater than or equal to 1582
        // This is because the Gregorian calendar starts from the year 1582
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582");
        } else {
            // Check the leap year condition using multiple 'if' and 'else' statements
            // A leap year occurs if the year is divisible by 4 but not by 100 unless it is also divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                // If the condition is true, print that the year is a leap year
                System.out.println(year + " is a Leap Year.");
            } else {
                // If the condition is false, print that the year is not a leap year
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}

