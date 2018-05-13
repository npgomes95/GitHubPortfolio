import java.text.DecimalFormat;
import java.util.Scanner;


public class DistanceBetweenPoints {
	public static void main(String[] args) {
		/*
		 * Write program that calculates the distance between two points
		 */
		
		//inputs decimal format
		DecimalFormat df = new DecimalFormat("0.####");
		
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double distance =0;
	
		
		//input
		Scanner kybd = new Scanner(System.in);
		System.out.print("Please enter x1 coordinates: ");
		x1 = kybd.nextDouble();
		
		System.out.print("Please enter y1 coordinates: ");
		y1 = kybd.nextDouble();
		
		System.out.print("Please enter x2 coordinates: ");
		x2 = kybd.nextDouble();
		
		System.out.print("Please enter y2 coordinates: ");
		y2 = kybd.nextDouble();
		
		kybd.close();
		
		distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		System.out.println("This is the distance is " + df.format(distance));
	}

}
