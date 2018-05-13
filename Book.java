
public class Book {
/*
 * Design and implement a class called Book that contains instance data for the title
 * author, publisher, and copyright date. Define the Book constructor that accepts and initialize
 * this data. Include setters and getters for all instance data. Include toString method that returns a nicely formatted,
 * multi-line description of the book. Create a driver class called Bookshelf whose main method
 * instantiates and updates several book objects
 * 
 *  
 */

//private variables 
	private String _title;
	private String _author;
	private String _publisher;
	private String _copyright;
	
	public Book (String title, String author, String publisher, String copyright) {
		_title = title;
		_author=author;
		_publisher=publisher;
		_copyright=copyright;
		
	}
	//getters
	public String getTitle() {return _title;}
	public String getAuthor() {return _author;}
	public String getPublisher() {return _publisher;}
	public String getCopyright() {return _copyright;}
	
	
	//setters
	public void setTitle(String title){_title = title;}
	public void setAuthor(String author) {_author=author;}
	public void setPublisher(String publisher) {_publisher=publisher;}
	public void setCopyright(String copyright) {_copyright=copyright;}
	
	
	public String toString() {
		return "Title: " +getTitle() + "\n"+"Author: " + getAuthor() +"\n" +"Publisher: " + getPublisher() +"\n" + "Copyright: " + getCopyright()+"\n\n";
		
	}
	
	

}
