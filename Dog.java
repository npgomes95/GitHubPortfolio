
public class Dog {

	//private variables
	private String _name;
	private int _age;
	
	//constructor
	public Dog (String name, int age) {
		_name = name;
		_age = age;
		
	}
	//getters
	public String getName() {
		return _name;
	}
	
	
	public int getAge() {
		return _age;
		
	}
	//setters
	
	public void setName(String name) {
		_name = name;
	}
	
	public void setAge(int age) {
		_age = age;
	}
	
	public int getPersonYears() {
		
		return getAge()*7;
		
	}
	
	public String toString() {
		return "The name of the dog is " + getName() + "\nThe dog's age in person is " + getPersonYears();
	}
}
