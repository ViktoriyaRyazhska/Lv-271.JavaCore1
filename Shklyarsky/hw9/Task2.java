import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {

	public static void readNumber(int a, int b) throws myException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] nmb = new int[10];
		ArrayList<Integer> nmb2 = new ArrayList<Integer>();

		for (int i = 0; i < nmb.length; i++) {
			try {
				nmb[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("invalid number or non-number text is read");
			}

			if ((nmb[i] > a) && (nmb[i] < b)) {
				nmb2.add(nmb[i]);
			}
		}

		Collections.sort(nmb2);
		System.out.println(nmb2);
	}

	public static void main(String[] args) throws myException {

		System.out.println("enter 10 numbers");

		readNumber(1, 100);

	}

}
