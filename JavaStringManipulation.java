import java.util.Random;
import java.util.Scanner;

public class JavaStringManipulation {
public static void main(String[] args) {
	/* Write a program that prompts for and reads user's first and last name (Separately).
	 * Then print a string composed of the first letter of the user's first name, followed by a random number
	 * in the range 10 to 99. Assume the last name is at least five letters long.
	 * 
	 */
	
	
	
	String firstName;
	String lastName;
	String finalName;
	
	Random rand = new Random();
	Scanner kybd = new Scanner(System.in);
	
	System.out.println("Please enter your first name: ");
	firstName = kybd.nextLine();
	
	System.out.println("Please enter your last name: ");
	lastName = kybd.nextLine();
	
	
	while (lastName.length()< 5) {
		System.out.println("Last Name must be atleast 5 characters. Try again: ");
		lastName = kybd.nextLine();
		
	
	}
	kybd.close();
	
	finalName = firstName.substring(0, 1);
	finalName += lastName.substring(0, 5);
	finalName += rand.nextInt(99)+10;
	
	System.out.println(finalName);

	
	
	
	
	
	
}
}
