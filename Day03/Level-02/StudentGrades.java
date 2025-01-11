/*
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 

Hint => 
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student

*/

// Import the Scanner class from the java.util package to take input from the user
import java.util.Scanner;

// Creating class StudentGrades to calculate and display marks, percentages, and grades of students
public class StudentGrades 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        // sc is of type Scanner
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        // number is of type int
        int number = sc.nextInt();

        // Create arrays to store marks, percentages, and grades of the students
        // physicsMarks, chemistryMarks, and mathsMarks are arrays of type int with a size of number
        int[] physicsMarks = new int[number];
        int[] chemistryMarks = new int[number];
        int[] mathsMarks = new int[number];
        // percentages is an array of type double with a size of number
        double[] percentages = new double[number];
        // grades is an array of type String with a size of number
        String[] grades = new String[number];

        // Take input for marks of students in physics, chemistry, and maths
        for (int i = 0; i < number; i++) {
            // Input for physics marks
            System.out.print("Enter marks in Physics for student " + (i + 1) + ": ");
            physicsMarks[i] = sc.nextInt();
            while (physicsMarks[i] < 0) {
                System.out.print("Marks must be positive. Please re-enter marks in Physics for student " + (i + 1) + ": ");
                physicsMarks[i] = sc.nextInt();
            }

            // Input for chemistry marks
            System.out.print("Enter marks in Chemistry for student " + (i + 1) + ": ");
            chemistryMarks[i] = sc.nextInt();
            while (chemistryMarks[i] < 0) {
                System.out.print("Marks must be positive. Please re-enter marks in Chemistry for student " + (i + 1) + ": ");
                chemistryMarks[i] = sc.nextInt();
            }

            // Input for maths marks
            System.out.print("Enter marks in Maths for student " + (i + 1) + ": ");
            mathsMarks[i] = sc.nextInt();
            while (mathsMarks[i] < 0) {
                System.out.print("Marks must be positive. Please re-enter marks in Maths for student " + (i + 1) + ": ");
                mathsMarks[i] = sc.nextInt();
            }

            // Calculate percentage for the student
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >= 80) 
			{
                grades[i] = "A";
            }
			else if (percentages[i] >= 70) 
			{
                grades[i] = "B";
            } else if (percentages[i] >= 60) 
			{
                grades[i] = "C";
            } else if (percentages[i] >= 50) 
			{
                grades[i] = "D";
            } else if (percentages[i] >= 40)  
			{
                grades[i] = "E";
            }
			else
			{  
				grades[i] = "R";
			}
        }

        // Display the marks, percentages, and grades of each student
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s%n", (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }

        // Close the Scanner to prevent resource leaks
        sc.close();
    }
}
