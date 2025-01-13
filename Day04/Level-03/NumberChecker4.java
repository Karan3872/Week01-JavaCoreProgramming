import java.util.Arrays;

public class NumberChecker4 {

    // Method to find factors of a number and return them as an array
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

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors using factors array and return the sum
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using factors array and return the product
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static long productOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum == number;
    }

    // Method to find if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum > number;
    }

    // Method to find if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial of a digit
    public static int factorial(int digit) {
        if (digit == 0 || digit == 1) {
            return 1;
        }
        return digit * factorial(digit - 1);
    }

    public static void main(String[] args) {
        int number = 28; // Example number

        int[] factors = findFactors(number);
        
        // Display the number and its factors
        System.out.println("Number: " + number);
        System.out.println("Factors: " + Arrays.toString(factors));

        // Find and display the greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest factor: " + greatestFactor);

        // Find and display the sum of the factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // Find and display the product of the factors
        long product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // Find and display the product of the cube of the factors
        long productOfCubes = productOfCubesOfFactors(factors);
        System.out.println("Product of cubes of factors: " + productOfCubes);

        // Check and display if the number is a perfect number
        boolean perfect = isPerfectNumber(number);
        System.out.println("Is perfect number: " + perfect);

        // Check and display if the number is an abundant number
        boolean abundant = isAbundantNumber(number);
        System.out.println("Is abundant number: " + abundant);

        // Check and display if the number is a deficient number
        boolean deficient = isDeficientNumber(number);
        System.out.println("Is deficient number: " + deficient);

        // Check and display if the number is a strong number
        boolean strong = isStrongNumber(number);
        System.out.println("Is strong number: " + strong);
    }
}