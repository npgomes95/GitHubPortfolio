
public class Flight {
/*
 * Implement a class Flight
 * declare instances of airlineName, flightNumber, flightOrigin and flightDestination
 * create a constructor and initialize all instances
 * test the class using FlightTest driver class
 */
	private String _airlineName;
	private String _flightNumber;
	private String _origin;
	private String _destination;
	
	//contructor
	public Flight(String airlineName, String flightNumber, String origin, String destination) {
		_airlineName = airlineName;
		_flightNumber = flightNumber;
		_origin = origin;
		_destination = destination;
		
	}
	
	//getters
	public String getAirlineName() {
		return _airlineName;
		
	}
	public String getFLightNumber() {
		return _flightNumber;
	}
	public String getOrigin() {
		return _origin;
		
	}
	public String getDestination() {
		return _destination;
	}
	
	
	//setters
	public void setAirlineName(String airlineName) {
		_airlineName = airlineName;
	}
	
	public void setFlightNumber(String flightNumber) {
		_flightNumber = flightNumber;
	}
	public void setOrigin(String origin) {
		_origin = origin;
		
	}
	
	public void setDestination(String destination) {
		_destination = destination;
	}
	
	
	public String toString() {
		return "This is the airline name: " + _airlineName +"\nThis is the flight number: " + _flightNumber + "\nThis is the origin: " + _origin + "\nThis is the destination: "+_destination+"\n\n";
		
		
	}
	
	
	
	
}
