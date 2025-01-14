import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the array of names
        System.out.print("Enter the number of names: ");
        int numberOfNames = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String[] names = new String[numberOfNames];
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Call the method to generate the ArrayIndexOutOfBoundsException
        generateArrayIndexOutOfBoundsException(names);

        // Refactor the code to handle the exception
        handleArrayIndexOutOfBoundsException(names);

        // Close the Scanner object
        scanner.close();
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] array) {
        try {
            String name = array[array.length]; // Access index larger than the length of the array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        }
    }

    // Method to demonstrate ArrayIndexOutOfBoundsException handling
    public static void handleArrayIndexOutOfBoundsException(String[] array) {
        try {
            String name = array[array.length]; // Access index larger than the length of the array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handling ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handling RuntimeException: " + e);
        }
    }
}
