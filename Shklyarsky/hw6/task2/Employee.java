package hw6.task2;

public class Employee {

	protected String id;
	protected String name;

	public double calculatePay() {
		return 0;

	}

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee " + name + " with id = " + id + " has " + calculatePay() + " average monthly salary.";
	}

}
