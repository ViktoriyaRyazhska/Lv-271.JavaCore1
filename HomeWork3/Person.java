package HomeWork3;

public class Person {
	private String name;
	private int birthYear;
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
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + "]";
	}
	public Person() {}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public  void input(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public String output() {
		return getName() + " " + getBirthYear();
	}	
	
	public int age() {
		int a = 2017-birthYear;
		return a;
	}
	public void changeName(String name) {
		this.name = name;
	
	}
	
	
	public static void main (String[] args) {
		Person p1 = new Person("Vasya",1993);
		Person p2 = new Person("Vitalii",1996);
		Person p3 = new Person("Misha",1884);
		Person p4 = new Person("Sara", 1987);
		Person p5 = new Person("Leonardo", 1889);
		
		System.out.println(p1.name + " is " + p1.age() + " years old.");
		System.out.println(p2.name + " is " + p2.age() + " years old.");
		System.out.println(p3.name + " is " + p3.age() + " years old.");
		System.out.println(p4.name + " is " + p4.age() + " years old.");
		System.out.println(p5.name + " is " + p5.age() + " years old.");
		System.out.println("");
		p2.changeName("John");
		System.out.println(p2);
		System.out.println(p2.name + " is " + p2.age() + " years old.");
		
		
		
		
	}
}
