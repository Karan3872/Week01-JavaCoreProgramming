
import java.util.Scanner;

public class FriendsComparison {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Arrays to store the ages and heights of the 3 friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for the age and height of the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Find and display the youngest friend
        int youngestIndex = findYoungest(ages);
        System.out.println("The youngest friend is " + names[youngestIndex] + " with an age of " + ages[youngestIndex] + ".");

        // Find and display the tallest friend
        int tallestIndex = findTallest(heights);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with a height of " + heights[tallestIndex] + " cm.");

        // Close the Scanner object
        sc.close();
    }

    // Method to find the youngest friend based on ages
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find the tallest friend based on heights
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }
}

