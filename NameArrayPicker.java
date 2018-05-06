package UDEMY;

import java.util.Scanner;

public class NameArrayPicker {
public static void main(String[] args) {
	Scanner kybd = new Scanner(System.in);
	System.out.print("How many arrays do you want to store? ");
	
	while(!kybd.hasNextInt()) {
		System.out.println("Please enter a valid number!!");
		System.out.print("How many arrays do you want to store? ");
		kybd.next();
	}
	
	
	int Storage = kybd.nextInt();
	kybd.nextLine();

	int count = 0;
	
	String[] names = new String[Storage];
	
	
	
	
	while(count<names.length) {
		System.out.print("Store " + Storage + " names please: ");
		names[count] = kybd.nextLine();
		count++;
	
	}
	
	
	
	
	//selects the the name that contains Nelson
	String n = null;
	String third = null;
	
	int counter = 0;
	for(String name : names) {
		counter++;
		System.out.println("These are the names in order "+counter+ ": " + name);
		
		
		
		if(name.contains("Nelson")) {
			n = name;
		}else if (n==null) {
			n="no name contains Nelson";
		}
		
		
		if(name.contains(names[2])){
			third  = name;
		}
			
		
	
		
	}
	
	System.out.println();
	
	System.out.println("This name contains Nelson: " + n);
	
	System.out.println("This is the third name on the list: "+ third);

	
}
}
