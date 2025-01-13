import java.util.Scanner;

public class StudentVoteChecker {
    
    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        // Validate the age for a negative number
        if (age < 0) {
            return false; // Cannot vote
        }
        // Check if age is 18 or above
        if (age >= 18) {
            return true; // Can vote
        }
        return false; // Cannot vote
    }

    public static void main(String[] args) {
        // Create an array of 10 integer elements to store the ages of students
        int[] studentAges = new int[10];
        
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Create an instance of StudentVoteChecker
        StudentVoteChecker checker = new StudentVoteChecker();
        
        // Loop to take user input for the student's age
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
        }
        
        // Loop through the array to check if each student can vote
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = checker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("The student with the age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + studentAges[i] + " cannot vote.");
            }
        }
        
        // Close the Scanner object
        sc.close();
    }
}
