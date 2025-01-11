/*
Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

*/
// Creating a class to convert feet to yards and miles
import java.util.Scanner;

class FeetToYardsMiles 
{
    public static void main(String[] args)
	{
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter distance in feet
        System.out.print("Enter the distance in feet: ");
		
		//Creating double distanceInFeet variable to take user input

        double distanceInFeet = input.nextDouble();
		
		//Creating double variables yard and miles
		// Convert feet to yards and miles
        double yards = distanceInFeet / 3;
        double miles = distanceInFeet / 1760;

        // Display the distance in yards and miles
		//Use String.format("%.3f", feet) to format the number to three decimal places
        System.out.println("The distance is " + String.format("%.3f",yards) + " yards and " + miles + " miles for the given " + distanceInFeet + " feet");
    }
}
