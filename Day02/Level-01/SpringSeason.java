import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'SpringSeason' to determine if it's the spring season based on month and day

class SpringSeason 
{

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the month and day
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();  // Read the month value
        
        System.out.print("Enter the day: ");
        int day = sc.nextInt();  // Read the day value
        
        // Check if the entered date is within the spring season range (March 20 to June 20)
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            // If the date falls within spring season, display the message
            System.out.println("It's a Spring Season.");
        } else {
            // If the date does not fall within spring season, display the message
            System.out.println("Not a Spring Season.");
        }
    }
}