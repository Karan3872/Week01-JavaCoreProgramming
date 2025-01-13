import java.util.Scanner;
import java.util.Arrays;

public class FactorsAnalysis {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Find the factors of the number
        int[] factors = findFactors(number);
        
        // Display the factors
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));
        
        // Calculate and display the sum of the factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);
        
        // Calculate and display the product of the factors
        long product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);
        
        // Calculate and display the sum of the squares of the factors
        int sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        
        // Close the Scanner object
        sc.close();
    }
    
    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        
        // First loop to find the count of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        // Initialize the array with the count of factors
        int[] factors = new int[count];
        int index = 0;
        
        // Second loop to save the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        
        return factors;
    }
    
    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    
    // Method to find the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    
    // Method to find the sum of the squares of the factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
}

