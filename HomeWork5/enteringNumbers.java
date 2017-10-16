package HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class enteringNumbers { 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int prod = 1;

		System.out.println("Entering the numbers... ");
		for (;;) {
			int n = Integer.parseInt(br.readLine());
			if (n < 0) {
				break;
			}

			if (n % 2 == 0) {
				prod *= n;
			}
		}
		System.out.println("Product of all entered even numbers: " + prod);

	}

}
