package UDEMY;

import java.util.Scanner;

public class MinMaxSum {
	public static void main(String[] args) {
		
		//intializes array
		double[] numbers = new double[5];
		Scanner kybd = new Scanner(System.in);
		int count = 0;
	
		//asks 5 times for name
		do {
		
			System.out.print("List five numbers to calculate sum, max, and min: ");
			numbers[count] = kybd.nextDouble();
			count++;
		
			
			
		}while(count<numbers.length);
		
		
		//print the the double five times after user input and sums the arrays
		double sum = 0;
		for (int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			sum = sum + numbers[i];
		}
		
		System.out.println("This is the sum of 5 arrays total: "+ sum);
		
		//find max
		double max = numbers[0];
		
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max = numbers[i];
			}
		}
		
		System.out.println("Max: " + max);
		
		//finds minimum 
		double min = numbers[0];
		for (int i =0; i<numbers.length; i++) {
			if(numbers[i]<min) {
				min = numbers[i];
				
			}
			
			
		}
		System.out.println("Min: "+ min);
		System.out.println("Range: " + (max-min));
	}

}
