import java.util.Scanner; // Import the Scanner class for user input

//Creating class CheckAgeStudent for Checking the age of each student in array

class CheckAgeStudent
 {
    public static void main(String []args)
	{
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
		
        int studentAge[] = new int[10]; // Declare an array to store the ages of 10 students

        // Loop to get the age of each student
        for(int i = 0; i < studentAge.length; i++) {
            System.out.print("Enter the age of student " + (i+1) + ": "); // Prompt user to enter the age of each student
            studentAge[i] = sc.nextInt(); // Store the entered age in the array
        }

        System.out.println("\n"); // Print a newline for better output formatting

        // Loop to check if each student can vote or if the entered age is invalid
        for(int i = 0; i < studentAge.length; i++) {
            if(studentAge[i] < 0) {
                System.err.println("Invalid age of student " + (i+1)); // Print an error message if age is negative
            } else if(studentAge[i] >= 18) {
                System.out.println("The student " + (i+1) + " with the age " + studentAge[i] + " can vote"); // Print a message if the student is 18 or older
            } else {
                System.out.println("The student " + (i+1) + " with the age " + studentAge[i] + " cannot vote"); // Print a message if the student is younger than 18
            }
        }
    }
}