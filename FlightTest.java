
public class FlightTest {
	/*
	 * Implement a class Flight
	 * declare instances of airlineName, flightNumber, flightOrigin and flightDestination
	 * create a constructor and initialize all instances
	 * test the class using FlightTest driver class
	 */
public static void main(String [] args) {
	Flight flight1, flight2, flight3;
	
	flight1 = new Flight("United Airways", "32843809", "Baltimore, MD", "Los Angelos, CA");
	
	
	flight2 = new Flight("Spirit", "43040948", "New York, NY", "Denver, CO");
	
	
	
	flight3 = new Flight("UNITED", "432040928", "Houston, TX", "San Francisco, CA");
	
	
	
	
	
	System.out.println(flight1);
	System.out.println(flight2);
	System.out.println(flight3);
}
}
