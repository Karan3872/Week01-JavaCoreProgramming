/*
Program to Display Current Time in Different Time Zones
Problem Statement: Create a program that displays the current time in different time zones:
    GMT (Greenwich Mean Time)
    IST (Indian Standard Time)
    PST (Pacific Standard Time)
Hint: Use ZonedDateTime and ZoneId to work with different time zones.
*/

// Importing necessary classes for working with dates, times, and time zones
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//Creating class TimeZones to display the current time in different time zones
class TimeZones 
{

    // Method to display the current time in a given time zone
    // Parameters:
    // - zoneId: String representing the time zone ID (e.g., "GMT", "Asia/Kolkata")
    // - zoneName: String representing the human-readable name of the time zone
    public static void displayTime(String zoneId, String zoneName) 
	{
        // Obtain the current time in the specified time zone
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zoneId));

        // Format the time using a custom pattern (yyyy-MM-dd HH:mm:ss z)
        // This pattern includes the date, time (24-hour format), and time zone abbreviation
        String formattedTime = time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"));

        // Print the formatted time along with the time zone name
        System.out.println("Current Time in " + zoneName + "	:	" + formattedTime);
    }

    public static void main(String[] args) 
	{
        // Displaying the current time in different time zones by calling the displayTime method

        // Display the current time in GMT (Greenwich Mean Time)
        System.out.println("=== Current Time in Different Time Zones ===");
        displayTime("GMT", "GMT (Greenwich Mean Time)");

        // Display the current time in IST (Indian Standard Time)
        displayTime("Asia/Kolkata", "IST (Indian Standard Time)");

        // Display the current time in PST (Pacific Standard Time)
        displayTime("America/Los_Angeles", "PST (Pacific Standard Time)");
    }
}