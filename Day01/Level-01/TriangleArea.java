/*
Write a program that takes the base and height to find area of a triangle in square inches and   square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

*/

// Creating a class to calculate the area of a triangle in square inches and square centimeters
import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the base and height in centimeters
        System.out.print("Enter the base of the triangle in centimeters: ");
        
        // Creating a double variable baseCm to take user input
        double baseCm = input.nextDouble();
		
		// Creating a double variable baseInches to convert base from centimeters to inches
        double baseInches = baseCm / 2.54;
        
        System.out.print("Enter the height of the triangle in centimeters: ");
        
        // Creating a double variable heightCm to take user input
        double heightCm = input.nextDouble();
		
		// Creating a double variable heightInches to convert height from centimeters to inches
		double heightInches = heightCm / 2.54;
		
		//Creating double areaCm2 variable to indicate Area of a triangle in square centimeters
        // Calculate the area of the triangle in square centimeters using the formula ½ * base * height
        double areaCm2 = 0.5 * baseCm * heightCm;

        //Creating double areaIn2 variable to indicate Area of a triangle in square Inches
        // Calculate the area of the triangle in square inches using the formula ½ * base * height
        double areaIn2 = 0.5 * baseInches * heightInches;

        // Convert height to feet and inches
        // 1 inch = 2.54 cm
        int heightFeet = ((int)heightInches / 12); // Convert total inches to feet
        double remainingInches = heightInches % 12; // Remaining inches after converting to feet

        // Display the height in feet and inches and the area of the triangle
        System.out.println("Your height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + String.format("%.3f",remainingInches));
        System.out.println("The area of the triangle is " + String.format("%.3f",areaCm2 )+ " square centimeters and " + String.format("%.3f",areaIn2) + " square inches.");
    }
}
