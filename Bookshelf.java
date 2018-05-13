import java.util.Scanner;

public class Bookshelf {
public static void main(String[] args) {
	Book book1, book2;
	Scanner kybd = new Scanner(System.in);
	
	System.out.print("What's the title for book one? ");
	String BookTitleOne =	kybd.nextLine();
	
	System.out.print("What is the author for book one? ");
	String AuthorOne = kybd.nextLine();
	
	System.out.print("What is the publisher for book one? ");
	String PublisherOne = kybd.nextLine();
	
	System.out.print("What is the copyright for book one? ");
	String CopyrightOne=kybd.nextLine();
	
	System.out.println();
	book1 = new Book(BookTitleOne,AuthorOne, PublisherOne, CopyrightOne );
	
	
	System.out.println(book1);

	System.out.print("What's the title for book two? ");
	String BookTitleTwo =	kybd.nextLine();
	
	System.out.print("What is the author for book two? ");
	String AuthorTwo = kybd.nextLine();
	
	System.out.print("What is the publisher for book two? ");
	String PublisherTwo = kybd.nextLine();
	
	System.out.print("What is the copyright for book two? ");
	String CopyrightTwo=kybd.nextLine();
	
	
	book2 = new Book(BookTitleTwo, AuthorTwo, PublisherTwo, CopyrightTwo);
	
	System.out.println();
	System.out.println(book2);

}
}
