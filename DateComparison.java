/*
Program to Compare Two Dates
Problem Statement: Create a program that:
    ➢ Takes two date inputs and compares them to check if the first date is before, after, or the same as the second date.
Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate class.
*/

// Importing necessary classes for working with dates
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Creating class DateComparison contains the main method to compare two dates
class DateComparison 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first date in the format yyyy-MM-dd
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String inputDate1 = scanner.nextLine();

        // Prompt the user to enter the second date in the format yyyy-MM-dd
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String inputDate2 = scanner.nextLine();

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the input dates to LocalDate objects
        LocalDate date1 = LocalDate.parse(inputDate1, formatter);
        LocalDate date2 = LocalDate.parse(inputDate2, formatter);

        // Compare the two dates and print the result
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } 
		else if 
		(date1.isAfter(date2)) 
		{
            System.out.println("The first date is after the second date.");
        } 
		else if (date1.isEqual(date2)) 
		{
            System.out.println("The first date is the same as the second date.");
        } 
		else 
		{
            System.out.println("Error in date comparison.");
        }

        // Close the Scanner
        scanner.close();
    }
}