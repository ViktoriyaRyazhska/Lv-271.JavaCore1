package HomeWork6Task2;

public class Employee {
	String employeeID;
	String name;

	public Employee(String employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + "]";
	}

}
