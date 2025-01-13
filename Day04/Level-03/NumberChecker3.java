
public class NumberChecker3 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int number = 49; // Example number

        // Check and display if the number is prime
        boolean prime = isPrime(number);
        System.out.println("Is prime: " + prime);

        // Check and display if the number is neon
        boolean neon = isNeon(number);
        System.out.println("Is neon: " + neon);

        // Check and display if the number is spy
        boolean spy = isSpy(number);
        System.out.println("Is spy: " + spy);

        // Check and display if the number is automorphic
        boolean automorphic = isAutomorphic(number);
        System.out.println("Is automorphic: " + automorphic);

        // Check and display if the number is buzz
        boolean buzz = isBuzz(number);
        System.out.println("Is buzz: " + buzz);
    }
}


