/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 

*/


import java.util.Random;

public class StudentScorecard {

    public static void main(String[] args) {
        int numberOfStudents = 10; // Assuming 10 students
        int[][] scores = generateRandomScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }

    // Method to generate random 2-digit scores for PCM for all students
    public static int[][] generateRandomScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        Random random = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(91) + 10; // Physics score between 10 and 100
            scores[i][1] = random.nextInt(91) + 10; // Chemistry score between 10 and 100
            scores[i][2] = random.nextInt(91) + 10; // Math score between 10 and 100
        }
        return scores;
    }

    // Method to calculate the total, average, and percentages for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // 3 columns for total, average, and percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to calculate the grade based on the percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = "Level 4, above agency-normalized standards";
            } else if (percentage >=70 && percentage<=79) {
                grades[i] = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60 && percentage<= 69) {
                grades[i] = "Level 2, below, but, approaching agency-normalized standards";
            } else if (percentage >= 50 && percentage <= 59) {
                grades[i] = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40 && percentage <=49) {
                grades[i] = "Level 1-, too below agency-normalized standards";
            } else if (percentage <= 39) {
                grades[i] = "Remedial standards";
            } 
        }
        return grades;
    }

    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s%n", (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }
}
