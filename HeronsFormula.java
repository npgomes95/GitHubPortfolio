import java.text.DecimalFormat;
import java.util.Scanner;

public class HeronsFormula {
	public static void main(String[] args) {
		/*
		 * Write an app that reads the lengths of the sides of a triangle from the user.
		 * Compute the area of the triangle using Heron's formula in which 'S' represents 
		 * half of the perimeter of the triangle, and 'a' and 'b' and 'c' are the lengths
		 * of three sides. Print the area to three decimal places
		 */
		
		DecimalFormat df = new DecimalFormat("0.###");
		Scanner kybd = new Scanner(System.in);
		
		int a,b,c; // sides
		double s; //half perimeter
		
		double area;
		
		System.out.print("Please enter the three sides of triangle: ");
		a= kybd.nextInt();
		b=kybd.nextInt();
		c=kybd.nextInt();
		
		kybd.close();
		
		s= (a+b+c)/2.00;
		
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("The area of triangle using Heron's formula is: "+ df.format(area));
		
		
		
				
	}

}
