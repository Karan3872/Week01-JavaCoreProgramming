public class DemonstrateNullPointerException {

    public static void main(String[] args) {
        // Call the method to generate the NullPointerException
        generateNullPointerException();

        // Refactor the code to handle the exception
        handleNullPointerException();
    }

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        try {
            String text = null; // Initialize the variable to null
            int length = text.length(); // Call a method on the null reference to generate the exception
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
        }
    }

    // Method to demonstrate NullPointerException handling
    public static void handleNullPointerException() {
        String text = null; // Initialize the variable to null
        try {
            int length = text.length(); // Call a method on the null reference to generate the exception
        } catch (NullPointerException e) {
            System.out.println("Handling NullPointerException: " + e);
        }
    }
}
