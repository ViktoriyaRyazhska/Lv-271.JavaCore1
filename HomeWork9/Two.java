package HomeWork9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void readNumber(int start, int end) throws myException {
		int a = 0;
		System.out.println("Please,enter a number: ");
		try {
			a = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("INVALID NUMBER OR NON-NUMBER TEXT IS READ.");
		}

		if (a >= start && a <= end) {
			System.out.println(a);
		} else {
			System.out.println("Your number not in the range :(");
		}

	}

	public static void main(String[] args) throws myException, NumberFormatException, IOException {

		for (int i = 0; i < 10; i++) {
			readNumber(1, 20);
		}

		System.out.println("Finish.");

	}

}
