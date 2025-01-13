import java.util.Arrays;

public class RandomNumberAnalysis {
    
    public static void main(String[] args) {
        // Generate an array of five 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        
        // Find the average, minimum, and maximum values of the array
        double[] results = findAverageMinMax(randomNumbers);
        
        // Display the results
        System.out.println("Average value: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);
    }
    
    // Method to generate an array of 4-digit random numbers given the size as a parameter
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = (int) (Math.random() * 9000) + 1000; // Generate 4-digit random number
        }
        return randomArray;
    }
    
    // Method to find the average, minimum, and maximum values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
}



