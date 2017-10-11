import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMin {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int nmb[] = new int[3];
		int max = 0;
		int min = 888888888;
		int l = 0;

		for (int i = 0; i < nmb.length; i++) {
			System.out.println("Type a number");
			nmb[i] = Integer.parseInt(br.readLine());
		}

		while (l < nmb.length) {
			if (nmb[l] > max) {
				max = nmb[l];
			}
			if (nmb[l] < min) {
				min = nmb[l];
			}
			l++;
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);

	}

}
