import java.text.DecimalFormat;
import java.util.Scanner;

public interface MultiSphere {
public static void main(String[] args) {
	
	//intialize scanner and decimal format classes
	
	Scanner kybd = new Scanner(System.in);
	DecimalFormat fmt = new DecimalFormat();
	double radius =0;
	
	System.out.print("Please enter the radius: ");
	radius = kybd.nextDouble();
	
	Sphere sphere = new Sphere(radius);
	
	System.out.println("This is the area: "+ fmt.format(sphere.getArea()));
	System.out.println("This is the volume: "+fmt.format(sphere.getVolume()));
	System.out.println("This is the radius: "+fmt.format(sphere.getRadius()));

}
}
