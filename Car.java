import java.util.Scanner;

public class Car {
/*
 * Design and implement a class called Car that contains instance data that 
 * Represents the make, model, and year of the car. 
 * Define at the car constructor to initialize these values.
 * Include getter and setter methods for all instance data, and a 
 * toString method that returns one-line description of the car.
 * Create driver class called CarTest and whose main method instantiates and updayes
 * several car objects
 * 
 */
	
	//private fields
	private String _make;
	private String _model;
	private int _year;
	Scanner kybd = new Scanner(System.in);
	
	
	
	public Car(String make, String model, int year) {
		_make = make;
		_model = model;
		_year = year;
		
	}
	
	//getters
	public String getMake() {
		return _make;
	}
	public String getModel() {
		return _model;
		
	}
	
	public int getYear() {
		return _year;
	}
	
	//setters
	
	public void setMake(String make) {
		_make = make;
	}

	public void setModel(String model) {
		_model = model;
		
	}
	
	public void setYear(int year) {
		//validate
		//year cannot <1900 or more than 2018
		
		while (year<1900 || year >2019) {
			System.out.print("Please enter a valid year from years between 1900 and 2018: ");
			year = kybd.nextInt();
		}
		
		_year = year;
		
		
	}
	
	public void quitScanner() {
		
		kybd.close();
	}
	
	public String toString() {
		return _make + " " + _model+ " " + Integer.toString(_year);
	}



}

