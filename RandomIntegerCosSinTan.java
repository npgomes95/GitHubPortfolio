import java.util.Random;

public class RandomIntegerCosSinTan {
	
	public static void main(String [] args) {
		/*
		 * Write an app that generates a random integer in the range of 20
		 * to 40 inclusive, and displays sine, cosine, and tangent of 
		 * that number
		 */
		
		
		Random rand = new Random();
		
		
		double number =0;
		//0-20 = 21 and +20 to make it inclusive between 20-40
		number = rand.nextInt(21)+20;
		
		
		System.out.println("The number is: "+ number);
		
		System.out.println("Sin = " + Math.sin(number));
		
		System.out.println("Cos = " + Math.cos(number));
		
		System.out.println("Tan = "+ Math.tan(number));
		
		
		
	}

}
