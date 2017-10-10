package HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
	public static void main (String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if (a < b && a < c) {
			System.out.println("min is " + a + ".");
		}
		else if (b < a && b < c) {
			System.out.println("min is " + b + ".");
		}
		else {
			System.out.println("min is " + c + ".");
		}
		System.out.println("");
		
		if (a > b && a > c) {
			System.out.println("max is " + a + ".");
		}
		else if (b > a && b > c) {
			System.out.println("max is " + b + ".");
		}
		else {
			System.out.println("max is " + c + ".");
		}
	}

}
