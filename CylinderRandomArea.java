import java.util.Random;

public class CylinderRandomArea {
public static void main(String[] args) {
	Random rand = new Random();
	
	
	//generates random radius
	double r = rand.nextInt(10)+1;
	
	//generates random height
	double h = rand.nextInt(10)+1;
	
	double volume = Math.PI*Math.pow(r, 2)*h;
	
	double area = (2*Math.PI*r*h)+(2*Math.PI*Math.pow(r, 2));
	
	
	System.out.println("The random integer for radius: "+ r );
	System.out.println("The random integer for heighr: "+ h);
	System.out.println("The volume for the cylinder is: " + volume);
	System.out.print("The area for the cylinder is: "+ area);
	
	
}
}
