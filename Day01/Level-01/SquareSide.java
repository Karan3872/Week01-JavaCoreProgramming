/*
.Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/

// Creating a class to find the side of a square from its perimeter
import java.util.Scanner;

class SquareSide
{
    public static void main(String[] args) 
	{
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        
        // Creating a double variable perimeter to take user input
        double perimeter = input.nextDouble();
		
		// Creating double side variable to indicate the side of the square
        // Calculate the side of the square using the formula perimeter / 4
        double side = perimeter / 4;

        // Display the length of the side of the square
        System.out.println("The length of the side is " + String.format("%.3f",side) + " whose perimeter is " + perimeter);
    }
}

