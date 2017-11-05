package javaproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager implements User {

	private static String password;
	private String name;
	private String entryPassword;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Manager(String name, String password) {
		this.name = name;
		Manager.password = password;
	}

	public Manager() {
	}

	public boolean passwordCheck() {

		System.out.println("\nEnter password");
		try {
			entryPassword = br.readLine();
		} catch (IOException e) {
			e.getStackTrace();
		}
		Pattern p = Pattern.compile(password);
		Matcher m = p.matcher(entryPassword);

		return m.matches();
	}

	public String addInfo() throws IOException {

		System.out.println("Enter name");
		String eName = br.readLine();
		System.out.println("Enter salary ");
		String eSalary = br.readLine();
		System.out.println("Enter phone number");
		String eNumber = br.readLine();
		System.out.println("Enter city");
		String eCity = br.readLine();
		System.out.println("Enter password");
		String ePassword = br.readLine();

		return eName + " " + eSalary + " " + eNumber + " " + eCity + " " + ePassword;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Welocme " + name;
	}
}
