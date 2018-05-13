import java.util.Random;

public class UseRandomClasses {
	/*
	 * Write a program that creates and prints random phone number of the for XXX-XXX-XXXX.
	 * Included the dashes in the output. Do not let the first three digits contain 8 or 9
	 * but don't be more restrictive than that, and make sure the second set of three digits
	 * is no greater than 742
	 */
	
	public static void main(String[] args) {
		Random rand = new Random();
		int first = rand.nextInt(7);
		int second = rand.nextInt(7);
		int third = rand.nextInt(7);
		
		int middle = rand.nextInt(741);
		
		int last = rand.nextInt(9999);
		
		String middleString= Integer.toString(middle);
		String lastString = Integer.toString(last); 
		String firstString = Integer.toString(first);
		String secondString = Integer.toString(second);
		String thirdString = Integer.toString(third);
		
		
		
		
		while (middleString.length()<3) {
			middleString = "0" + middleString;
			
		}
		
		while (lastString.length()<4){
			lastString = "0" + lastString;
		}
		
		System.out.println(firstString + secondString + thirdString + "-"+ middleString +"-"+ lastString);
		
		
	}
	

}
