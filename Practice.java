
public class Practice {
	
	public static void main(String [] args) {
		Practice p = new Practice();
		
		
	}
	
	private void StringEquals() {
		String weather = "raining";
		if(weather.equals("raining")) {
			System.out.println("I am staying home");
		}else {
			System.out.println("I am going out for a walk");
		}
		
		
	}
	
	private void IfElse() {
		String weather = "sunny";
		if (weather == "raining") {
			System.out.println("I am staying home");
		}else {
			System.out.println("I am going out for a walk");
		}
		
	}
	
	private void integerValidation(int validateNumber) {
		int x = validateNumber;
		if (x<0) {
			System.out.println("Negative number");
		}else if(x>0) {
			System.out.println("Positive number");
			
		}
		else {
			System.out.println("zero");
		}
	}
	
	private void retireORnot(double accountBalance, int Age) {
		double account_balance = accountBalance;
		int age = Age;
		
		
		if (account_balance>=1000000 || age >=65) {
			System.out.println("Retire bitch");
		}else {
			System.out.println("You're young and sexy. Make some money for me baby!!!");
		}
		
}
	private void gradeInput(double gpa) {
		double GPA = gpa;
		
		if (GPA == 4.0) {
			System.out.println("Sheesh get a life kid");
		}else if(GPA>=3.5 && GPA<4.0) {
			System.out.println("Get laid");
		}else if(GPA >= 3.0 && GPA<3.5) {
			System.out.println("LOL DUDE");
		}else if (GPA >=2.5 && GPA < 3.0) {
			System.out.println("You gonna struggle FR FR");
		}
		else if (GPA>=2.0 && GPA<2.5) {
			System.out.println("Struggle kid struggle kid");
		}
		else {
			System.out.println("Too much pusssy for u bruh!");
			
		}
	}
		
	
}


