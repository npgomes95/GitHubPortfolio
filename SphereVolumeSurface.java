import java.text.DecimalFormat;
import java.util.Scanner;

public class SphereVolumeSurface {
	public static void main(String [] args) {
		/*
		 * Write an app that reads the radius of a sphere and prints its volume and surface area.
		 * Print the output to four decimal places
		 * 
		 */
		
		//implements classes
		DecimalFormat df = new DecimalFormat("0.####");
		Scanner kybd = new Scanner(System.in);
		
		double volume =0;
		double area = 0;
		double radius = 0;
		
		
		System.out.print("Please enter the radius: ");
		radius = kybd.nextDouble();
		kybd.close();
		
		
		volume = (4.00/3)*Math.PI *Math.pow(radius, 3);
		
		area = 4.00*Math.PI*Math.pow(radius, 2);
		
		
		System.out.println("The area is " + df.format(area));
		System.out.print("The volume is " + df.format(volume));
		
	}

}
