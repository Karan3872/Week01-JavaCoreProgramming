import java.util.Arrays;

public class NumberChecker1 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[][] frequency = new int[10][2];
        
        // Initialize the digits column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        
        // Calculate the frequency
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        
        return frequency;
    }

    public static void main(String[] args) {
        int number = 121; // Example number

        int[] digits = getDigitsArray(number);

        // Display the number and its digits
        System.out.println("Number: " + number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Find and display the sum of the digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Find and display the sum of the squares of the digits
        int sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check and display if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad number: " + isHarshad);

        // Find and display the frequency of each digit
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }
    }
}
