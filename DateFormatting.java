/*
Program to Display Current Date in Different Formats
Problem Statement: Create a program that displays the current date in three different formats:
    ➢ dd/MM/yyyy
    ➢ yyyy-MM-dd
    ➢ EEE, MMM dd, yyyy
Hint: Use DateTimeFormatter with custom patterns for date formatting.
*/

// Importing necessary classes for working with dates and formatting
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Creating class DateFormatting to display current date in different formats
class DateFormatting 
{

    public static void main(String[] args) 
	{
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define custom date format patterns
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Format the current date using the defined patterns
        String formattedDate1 = currentDate.format(formatter1);
        String formattedDate2 = currentDate.format(formatter2);
        String formattedDate3 = currentDate.format(formatter3);

        // Display the formatted dates
        System.out.println("Current Date in format dd/MM/yyyy	:	" + formattedDate1);
        System.out.println("Current Date in format yyyy-MM-dd	:	" + formattedDate2);
        System.out.println("Current Date in format EEE, MMM dd, yyyy	:	" + formattedDate3);
    }
}