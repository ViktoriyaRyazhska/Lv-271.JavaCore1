package pracTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Employee {
	private String name;
	private int departmentNumber;
	private int salary;
	
	
	public Employee() {}
	public Employee(String name, int departmentNumber, int salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public static void main (String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Employee[] em = new Employee[5];
		em[0] = new Employee("Vasya", 2, 1000);
		em[1] = new Employee("Misha", 3, 500);
		em[2] = new Employee("Grisha",1, 2000);
		em[3] = new Employee("Vitalii",2, 1500);
		em[4] = new Employee("Nikita",3, 600);
		
		for (int i = 0; i < em.length; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 1) {
				System.out.println((em[2].name));
			}
			else if(n == 2) {
				System.out.println(em[0].name);
				System.out.println(em[3].name);
			}
			else if (n == 3) {
				System.out.println(em[1].name);
				System.out.println(em[4].name);
			}
			else {
				System.out.println("We have only 3 departments.");
			}
		}
		
		
		
		
		
		
		
	}

}
