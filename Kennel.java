import java.util.Scanner;

public class Kennel {
public static void main(String [] args) {
	String name;
	int age =0;
	
	Scanner kybd = new Scanner(System.in);
	
	System.out.print("What is the dog's name: ");
	name = kybd.nextLine();
	
	System.out.print("What is the age in person years: ");
	
	age = kybd.nextInt();
	
	Dog dog = new Dog(name, age);
	
	
	
	
	System.out.println(dog);
	
}
}
