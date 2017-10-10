import java.util.Calendar;

public class Person {
	
	private String name;
	private int birthYear;
	
	Calendar cal = Calendar.getInstance();
	int thisYear = cal.get(Calendar.YEAR);
		
	public Person(String name, int birthYear) {
	this.name = name;
	this.birthYear = birthYear;
	}
	
	public Person() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public void input(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
	}
	public void output(){
		System.out.println(this.name + " is " + getAge());
	}
	
	public String changeName(String name) {
		this.name = name;
		return name;
	}
	
	public int getAge() {
		return (thisYear-birthYear); 
	}

	@Override
	public String toString() {
		return "Person [name - " + name + ", birthYear - " + birthYear + "]";
	}
	
	
	
}