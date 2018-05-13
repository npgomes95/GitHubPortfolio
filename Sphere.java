import java.text.NumberFormat;

public class Sphere {
/*
 * Design and implement a class called Sphere that contains instance
 * data that represents the sphere's diameter. Define the Sphere 
 * constructor to accept and initialize the diameter, and include getter and setter methods
 * for the diameter.
 * Include methods that calculate and return the volume and surface area of the sphere. Create a driver class called
 * multisphere, whose main method instantiates and updates several sphere objects
 * 
 * 
 * Volume = (4.00/3) * PI * R^3
 * Surface area = 4.00* PI * R^2
 */
	
private double _radius;


public Sphere(double radius) {
	_radius = radius;
}

public double getRadius(){
	return _radius;
	
}
public void setRadius(double radius) {
	_radius = radius;
}

public double getVolume() {
	double Volume = 0;
	
	Volume = (4.00)/3 * Math.PI*Math.pow(getRadius(), 3);
	return Volume;
}

public double getArea() {
	double Area = 0;
	Area = 4.00*Math.PI*Math.pow(getRadius(), 2);
	return Area;
}

public String toString() {
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	return fmt.format(getRadius());
}

	
}
