/*
Program to Perform Date Arithmetic
Problem Statement: Create a program that:
    ➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
    ➢ Then subtracts 3 weeks from the result.
Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and minusWeeks() methods.
*/

// Importing necessary classes for working with dates
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Creating class DateArithmetic to perform date arithmetic
class DateArithmetic 
{

    public static void main(String[] args) 
	{
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a date in the format yyyy-MM-dd
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the input date to a LocalDate object
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, and 2 years to the date
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("Date after adding 7 days, 1 month, and 2 years: " + modifiedDate);

        // Subtract 3 weeks from the modified date
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("Date after subtracting 3 weeks: " + finalDate);

        // Close the Scanner
        scanner.close();
    }
}