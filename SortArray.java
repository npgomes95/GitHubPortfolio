package UDEMY;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
public static void main(String[] args) {
	int[] ArrayList = new int[10];
	Random rand = new Random();
	System.out.println("This is the array in order:");
	for (int i =0; i<ArrayList.length;i++) {
		ArrayList[i] = rand.nextInt(100)+1;
		
	}
	Arrays.sort(ArrayList);
	System.out.println(Arrays.toString(ArrayList));
	
	
	System.out.println("\nThis is in reverse order: ");
	//in reverse order
	for(int i = ArrayList.length-1; i>=0;i--) {
		System.out.print(ArrayList[i] + " ");
		
	}
	System.out.println("\n");
	
	//sum of arrays
	int sum = 0;
	for(int i =0; i<ArrayList.length; i++) {
		sum = sum+ArrayList[i];
		
	}
	
	System.out.println("This is the sum of 10 random numbers: " + sum);
	
	//finds the max number of 10 arrays
	int max = ArrayList[0];
	for(int i = 0; i<ArrayList.length; i++) {
		if(ArrayList[i]>max) {
			max = ArrayList[i];
		}
	

	
	}
	System.out.println("This is the max: "+ max);
	
	
	//finds the min
	int min = ArrayList[0];
	for(int i =0; i<ArrayList.length; i++) {
		if(ArrayList[i]<min) {
			min = ArrayList[i];
		}
	}
	
	System.out.println("This is the min: "+ min);
	System.out.println("This the range: " + (max-min));
	System.out.println("This is the average: "+ ((double)sum/ArrayList.length));
	
	double median = (double)(ArrayList[4]+ArrayList[5])/2;
	System.out.println("This is the median: "+ median);
	
	
	
}

}
