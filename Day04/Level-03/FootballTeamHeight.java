
import java.util.Arrays;
import java.util.Random;

public class FootballTeamHeight {
    public static void main(String[] args) {
        // Create an array named heights of size 11
        int[] heights = new int[11];
        
        // Generate random heights in the range 150 to 250 cms
        generateRandomHeights(heights, 150, 250);

        // Display the heights of the players
        System.out.println("Heights of the players: " + Arrays.toString(heights));

        // Find the sum of all elements present in the array
        int sum = findSum(heights);
        
        // Find the mean height of the players on the football team
        double mean = findMean(sum, heights.length);
        
        // Find the shortest height of the players on the football team
        int shortest = findShortest(heights);
        
        // Find the tallest height of the players on the football team
        int tallest = findTallest(heights);
        
        // Display the results
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }

    // Method to generate random heights for the players
    public static void generateRandomHeights(int[] heights, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(max - min + 1) + min;
        }
    }

    // Method to find the sum of all elements present in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height of the players on the football team
    public static double findMean(int sum, int numberOfElements) {
        return (double) sum / numberOfElements;
    }

    // Method to find the shortest height of the players on the football team
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height of the players on the football team
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}

