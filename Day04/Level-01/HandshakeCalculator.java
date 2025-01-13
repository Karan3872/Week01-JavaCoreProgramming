import java.util.Scanner;

public class HandshakeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate the maximum number of handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maxHandshakes);

        // Close the Scanner object
        sc.close();
    }

    // Method to calculate the number of handshakes using the combination formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}

