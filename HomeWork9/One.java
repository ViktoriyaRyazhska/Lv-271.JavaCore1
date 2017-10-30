package HomeWork9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {

	public static double div(double a, double b) throws myException {
		return a / b;

	}

	public static void main(String[] args) throws myException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = 0;
		double b = 0;
		System.out.println("Enter two numbers: ");

		try {
			try {

				a = Double.parseDouble(br.readLine());
				b = Double.parseDouble(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("Please, enter numbers of type double.");
			}
			System.out.println(div(a, b));
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Finish.");

	}

}
