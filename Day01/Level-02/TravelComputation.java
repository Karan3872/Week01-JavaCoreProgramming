// Create TravelComputation Class to compute the Distance and Travel Time

import java.util.Scanner;

class TravelComputation {

   public static void main(String[] args) {
      
      // Create a scanner object to take input from the user
      Scanner sc = new Scanner(System.in);

      // Prompt the user to enter the name of the person traveling
      System.out.print("Enter the name of the traveler: ");
      String name = sc.nextLine();
      
      // Prompt the user to enter the fromCity, viaCity, and toCity
      System.out.print("Enter the city of origin (fromCity): ");
      String fromCity = sc.nextLine();
      System.out.print("Enter the via city (viaCity): ");
      String viaCity = sc.nextLine();
      System.out.print("Enter the destination city (toCity): ");
      String toCity = sc.nextLine();

      // Prompt the user to enter the distances between the cities in miles
      System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
      double distanceFromToVia = sc.nextDouble();
      System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
      double distanceViaToFinalCity = sc.nextDouble();

      // Prompt the user to enter the time taken to travel between the cities in minutes
      System.out.print("Enter the time taken to travel from " + fromCity + " to " + viaCity + " in minutes: ");
      int timeFromToVia = sc.nextInt();
      System.out.print("Enter the time taken to travel from " + viaCity + " to " + toCity + " in minutes: ");
      int timeViaToFinalCity = sc.nextInt();

      // Calculate the total distance between the fromCity and toCity in miles
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Calculate the total time taken to travel between the fromCity and toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;

      // Display the travel details with user input values
      System.out.println("\nThe Total Distance traveled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " miles and the " +
                         "Total Time taken is " + totalTime + " minutes.");
   }
}


