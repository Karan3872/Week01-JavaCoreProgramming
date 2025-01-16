import java.util.Random;
import java.util.Scanner;

public class VotingEligibilityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random ages for the number of students
        int[] ages = generateRandomAges(numberOfStudents);

        // Determine voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the result in a tabular format
        displayEligibility(eligibility);

        scanner.close();
    }

    // Method to generate random 2-digit ages for the number of students
    public static int[] generateRandomAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        Random random = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(90) + 10; // Generate random ages between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return a 2D array with age and eligibility status
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                eligibility[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "Can Vote";
            } else {
                eligibility[i][1] = "Cannot Vote";
            }
        }
        return eligibility;
    }

    // Method to display the 2D array of ages and eligibility in a tabular format
    public static void displayEligibility(String[][] eligibility) {
        System.out.printf("%-10s %s%n", "Age", "Eligibility");
        System.out.println("-------------------------");
        for (String[] student : eligibility) {
            System.out.printf("%-10s %s%n", student[0], student[1]);
        }
    }
}
