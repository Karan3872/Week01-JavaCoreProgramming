/*
 Eric Travels from Chennai to Bangalore via Vellore. From
 Chennai toVellore distance is 156.6 km and the time taken
 is 4 Hours and 4 Mins and from Vellore to Bangalore is 211.8
 km and will take 4 Hours and 25 Mins. Compute the total 
 distance and total time from Chennai to Bangalore
*/

// Creating Total Distance class to compute the Distance and Travel Time

class TotalDistance
{
	public static void main(String []args)
	{
		//Creating a variable name to indicate the person traveling
		String name = "Eric";
		
		// Create a variable fromCity, viaCity and toCity to indicate the city
		// from city, via city and to city the person is travelling
      String fromCity = "Chennai", viaCity = "Velore", toCity = "Bangalore";

      // Create a variable distanceFromToVia to indicate the distance 
      // between the fromCity to viaCity
      double distanceFromToVia = 156.6;

      // Create a variable timeFromToVia to indicate the time taken to 
      // travel from fromCity to viaCity in minutes
      int timeFromToVia = 4 * 60 + 4;

      // Create a variable distanceViaToFinalCity to indicate the distance 
      // between the viaCity to toCity
      double distanceViaToFinalCity = 211.8;

      // Create a variable timeViaToFinalCity to indicate the time taken to
      // travel from viaCity to toCity in minutes
      int timeViaToFinalCity = 4 * 60 + 25;
	  
	  // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;

      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");

	}
	
}