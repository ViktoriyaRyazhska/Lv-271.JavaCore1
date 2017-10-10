package HomeWork4;

public class Dog {
	private String name;
	private String breed;
	private int age;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public enum breed{
		BIGL, PUDEL, DOBERMAN
	}
	
	public Dog (String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public static void main (String[] args) {
		Dog d1 = new Dog("jer","bigl", 3);
		Dog d2 = new Dog("pit","pudel", 5);
		Dog d3 = new Dog("max","doberman", 7);
		
		System.out.println(d1.equals(d2) && d1.equals(d3));
		System.out.println("");
		
		if (d1.age > d2.age && d1.age > d3.age) {
			System.out.println("The oldest dog is " + d1.name);
		}
		else if (d2.age > d1.age && d2.age > d3.age) {
			System.out.println("The oldest dog is " + d2.name);
		}
		else {
			System.out.println("The oldest dog is " + d3.name);
		}
		
		
		
		
	}

}
