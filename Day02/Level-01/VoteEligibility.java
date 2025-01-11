import java.util.Scanner; // Import the Scanner class for getting user input

// Create a class 'VoteEligibility' to check if a person can vote based on their age

class VoteEligibility {

    public static void main(String[] args) {

        // Create a scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter their age
        System.out.print("Enter the age: ");
        int age = sc.nextInt();  // Read the user's age
        
        // Check if the person is eligible to vote (age >= 18)
        if (age >= 18) {
            // If eligible, display a message indicating the person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If not eligible, display a message indicating the person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}