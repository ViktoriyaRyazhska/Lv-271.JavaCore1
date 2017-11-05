package javaproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Broker implements User {

	private int salary;
	private String number;
	private String city;
	private String password;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Broker(int salary, String number, String city, String password) {
		this.password = password;
		this.salary = salary;
		this.number = number;
		this.city = city;
	}

	public Broker() {

	}

	public String addInfo() throws IOException {

		System.out.println("Enter customer name");
		String customerName = br.readLine();
		System.out.println("Enter vehicle price");
		String carPrice = br.readLine();
		System.out.println("Enter driver skill in years");
		String driverSkill = br.readLine();
		System.out.println("Enter date of deal");
		String dealDate = br.readLine();

		return customerName + " " + carPrice + " " + driverSkill + " " + dealDate;
	}

	public String toString() {
		return "| " + salary + " salary" + " | " + "phone number " + number + " | " + "from " + city + " | \n";
	}

	public String getPassword() {
		return password;
	}
	
	public boolean passwordCheck() {
		return false;
	}
}
