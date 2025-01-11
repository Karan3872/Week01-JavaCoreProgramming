// Creating a class to calculate average marks, percentage, grade, and remarks
import java.util.Scanner; // Importing the Scanner class to take input from the user

class StudentGradeCalculator {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter marks for Physics
        System.out.print("Enter marks for Physics: ");
        // Declare a variable physics to store the marks entered by the user
        double physics = input.nextDouble();

        // Prompt the user to enter marks for Chemistry
        System.out.print("Enter marks for Chemistry: ");
        // Declare a variable chemistry to store the marks entered by the user
        double chemistry = input.nextDouble();

        // Prompt the user to enter marks for Maths
        System.out.print("Enter marks for Maths: ");
        // Declare a variable maths to store the marks entered by the user
        double maths = input.nextDouble();

        // Calculate the total marks by adding marks of Physics, Chemistry, and Maths
        double totalMarks = physics + chemistry + maths;

        // Calculate the average marks by dividing the total marks by the number of subjects
        double averageMarks = totalMarks / 3;

        // Calculate the percentage by dividing the total marks by the maximum possible marks (300) and multiplying by 100
        double percentage = (totalMarks / 300) * 100; // Assuming each subject is out of 100 marks

        // Declare variables to store the grade and remarks
        String grade;
        String remarks;

        // Determine the grade and remarks based on the percentage obtained
        if (percentage >= 80) {
            // If percentage is 80% or above, assign grade 'A' and remarks for Level 4
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            // If percentage is between 70% and 79%, assign grade 'B' and remarks for Level 3
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            // If percentage is between 60% and 69%, assign grade 'C' and remarks for Level 2
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            // If percentage is between 50% and 59%, assign grade 'D' and remarks for Level 1
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            // If percentage is between 40% and 49%, assign grade 'E' and remarks for Level 1-
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            // If percentage is below 40%, assign grade 'R' and remarks for Remedial standards
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display the calculated average marks
        System.out.println("Average Marks: " + averageMarks);

        // Display the calculated percentage
        System.out.println("Percentage: " + percentage + "%");

        // Display the grade determined based on the percentage
        System.out.println("Grade: " + grade);

        // Display the remarks associated with the grade
        System.out.println("Remarks: " + remarks);
    }
}