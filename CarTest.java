import java.util.Scanner;

public class CarTest {
public static void main(String[] args) {
	boolean quit= false;
	String toQuit;
	String model, make;
	int year=0;
	
	
	Scanner kybd = new Scanner(System.in);
	
	//create an empty object
	
	Car car = new Car("", "", 0);
	
	
	while(!quit) {
		System.out.print("Please enter the Car Make, Model, and Year: ");
		make = kybd.next();
		model = kybd.next();
		year = kybd.nextInt();
		
		car.setMake(make);
		car.setModel(model);
		car.setYear(year);
		kybd.nextLine();
		
		System.out.println("Here's the car model: "+ car);
		System.out.print("Press Q to quit or any key to continue: ");
		toQuit = kybd.next();
		
		if(toQuit.equalsIgnoreCase("Q")) {
			quit = true;
			
		}
		
	
		
		
		
		
	}
	kybd.close();
	car.quitScanner();
	System.out.println("Good bye");
	
}
}
