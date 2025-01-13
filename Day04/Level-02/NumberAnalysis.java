
import java.util.Scanner;

public class NumberAnalysis {
    
    public static void main(String[] args) {
        // Create an array to store 5 integers
        int[] numbers = new int[5];
        
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Take input for the 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        // Loop through the array to check if each number is positive or negative
        // For positive numbers, check if they are even or odd
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println("The number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("The number " + numbers[i] + " is positive and odd.");
                }
            } else {
                System.out.println("The number " + numbers[i] + " is negative.");
            }
        }
        
        // Compare the first and last elements of the array
        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparison > 0) {
            System.out.println("The first element is greater than the last element.");
        } else if (comparison < 0) {
            System.out.println("The first element is less than the last element.");
        } else {
            System.out.println("The first element is equal to the last element.");
        }
        
        // Close the Scanner object
        sc.close();
    }
    
    // Method to check whether the number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    
    // Method to check whether the number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }
}

