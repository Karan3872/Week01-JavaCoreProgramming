/*
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.

*/
// Creating a class to calculate the maximum number of handshakes
import java.util.Scanner;

class Handshakes {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
		
		//Creating double numberOfStudents variable to take user input
        int numberOfStudents = input.nextInt();

		//Creating int maxHandshakes variable to indicate total number of handshakes
        // Calculate the maximum number of handshakes using the combination formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the maximum number of handshakes
        System.out.println("The maximum number of handshakes is " + maxHandshakes);
    }
}