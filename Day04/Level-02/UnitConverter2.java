public class UnitConverter2 {
    
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    
    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    
    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    
    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Example usage of the methods
        System.out.println("32 Fahrenheit to Celsius: " + convertFahrenheitToCelsius(32));
        System.out.println("0 Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(0));
        System.out.println("10 pounds to kilograms: " + convertPoundsToKilograms(10));
        System.out.println("10 kilograms to pounds: " + convertKilogramsToPounds(10));
        System.out.println("5 gallons to liters: " + convertGallonsToLiters(5));
        System.out.println("5 liters to gallons: " + convertLitersToGallons(5));
    }
}
