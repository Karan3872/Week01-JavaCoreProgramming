public class NumberChecker2 {

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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean arraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseArray(digits);
        return arraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
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

        // Check and display if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is palindrome: " + isPalindrome);

        // Check and display if the number is a duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is duck number: " + isDuck);
    }
}
