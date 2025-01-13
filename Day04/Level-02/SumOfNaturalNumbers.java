import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take the user input number and check whether it's a natural number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            scanner.close();
            return;
        }
        
        // Find the sum of n natural numbers using recursion
        int sumRecursive = sumUsingRecursion(number);
        
        // Find the sum of n natural numbers using the formula n*(n+1)/2
        int sumFormula = sumUsingFormula(number);
        
        // Compare the two results and print the result
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);
        
        if (sumRecursive == sumFormula) {
            System.out.println("The results from both computations are correct.");
        } else {
            System.out.println("There is a discrepancy between the results.");
        }
        
        // Close the Scanner object
        scanner.close();
    }
    
    // Method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    
    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
