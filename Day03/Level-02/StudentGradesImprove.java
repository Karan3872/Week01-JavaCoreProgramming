/*
Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
Hint => 
All the steps are the same as the problem 8 except the marks are stored in a 2D array
Use the 2D array to calculate the percentages, and grades of the students

*/
// Import the Scanner class from the java.util package to take input from the user
import java.util.Scanner;

// Creating class StudentGrades2D to calculate and display marks, percentages, and grades of students using a 2D array
public class StudentGradesImprove {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        // sc is of type Scanner
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        // number is of type int
        int number = sc.nextInt();

        // Create a multi-dimensional array to store marks of students in physics, chemistry, and maths
        // marks is a 2D array of type int with size [number][3]
        int[][] marks = new int[number][3];
        // Create arrays to store percentages and grades of the students
        // percentages is an array of type double with a size of number
        double[] percentages = new double[number];
        // grades is an array of type String with a size of number
        String[] grades = new String[number];

        // Take input for marks of students in physics, chemistry, and maths
        for (int i = 0; i < number; i++) {
            // Input for physics marks
            System.out.print("Enter marks in Physics for student " + (i + 1) + ": ");
            marks[i][0] = sc.nextInt();
            while (marks[i][0] < 0) {
                System.out.print("Marks must be positive. Please re-enter marks in Physics for student " + (i + 1) + ": ");
                marks[i][0] = sc.nextInt();
            }

            // Input for chemistry marks
            System.out.print("Enter marks in Chemistry for student " + (i + 1) + ": ");
            marks[i][1] = sc.nextInt();
            while (marks[i][1] < 0) {
                System.out.print("Marks must be positive. Please re-enter marks in Chemistry for student " + (i + 1) + ": ");
                marks[i][1] = sc.nextInt();
            }

            // Input for maths marks
            System.out.print("Enter marks in Maths for student " + (i + 1) + ": ");
            marks[i][2] = sc.nextInt();
            while (marks[i][2] < 0) {
                System.out.print("Marks must be positive. Please re-enter marks in Maths for student " + (i + 1) + ": ");
                marks[i][2] = sc.nextInt();
            }

            // Calculate percentage for the student
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

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
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s%n", (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        // Close the Scanner to prevent resource leaks
        sc.close();
    }
}
