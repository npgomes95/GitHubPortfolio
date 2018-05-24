package BasicJavaProgramming;

import java.util.Scanner;

public class SelectionTwoDArray {
	public static void main(String[] args) {
		String[][] names = new String[3][3];
		Scanner kybd = new Scanner(System.in);
		int count = 1;
		
		
		//fills three columns and fills in three rows
		for(int row = 0; row<3;row++) {
			for (int col = 0; col<3;col++) {
				System.out.print("Please enter name " +count+": " );
				names[row][col] = kybd.nextLine();
				count++;
			}
		}
		
		System.out.println();
		
		//prints columns and rows
		for(int row = 0; row<3;row++) {
			for (int col = 0; col<3;col++) {
				System.out.print(names[row][col]+ " ");
			}
			System.out.println();
		}
		
		
		
		//checks if the list has the name Nelson
		String n = "No Nelson in this list";
		
		for(int row = 0; row<3;row++) {
			for (int col = 0; col<3;col++) {
				if(names[row][col].contains("Nelson")) {
					n = "This list has the name Nelson";
				}
				
				
				
			}
			
		}
		
		System.out.println("\n"+n);
		
		
	}

}
