import java.util.Scanner;

public class UseMathClass {
	
	public static void main(String[] args) {
		/*Write a program that prints the sum of cubes
		 * Prompt for and read two integer values and print the sum
		 * of each value raised to the third power
		 */
		
		int num1 = 0;
		int num2 = 0;
		double cube =0;
		Scanner kybd = new Scanner(System.in);
		
		
		System.out.println("Please enter first number: ");
		
		while( !kybd.hasNextInt()) {
			System.out.println("Please enter a valid number!");
			kybd.next();
		}
	
		
		num1 = kybd.nextInt();
		
	
		
		
		System.out.println("Please enter second number: ");
		while( !kybd.hasNextInt()) {
			System.out.println("Please enter a valid number!");
			kybd.next();
		}
		
		
		num2 = kybd.nextInt();
		
		
		
		
		
		
		cube = Math.pow(num1, 3) + Math.pow(num2, 3);
		
		
		System.out.println("Cube of "+ num1 + " and "+ num2+ " = "+ cube);
		
		
	}

}
