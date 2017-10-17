import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	public static void main(String[] args) throws NumberFormatException, IOException {
/*
 * task 1
 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the month number");
		int m = Integer.parseInt(br.readLine());

		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("this month has " + month[m - 1] + " days");
/*
 * task 2
 */
		System.out.println("enter ten numbers");

		int nmb[] = new int[10];
		int sum = 0;

		for (int i = 0; i < nmb.length; i++) {
			nmb[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < nmb.length; i++) {
			for (; i < 5; i++) {
				if (nmb[i] > 0) {
					sum += nmb[i];
				} else {
					System.out.println("if you see this then in first five numbers you entered negative number");
					sum = 1;
					for (int k = 5; k < 10; k++) {
						sum = sum * nmb[k];
					}
				}
			}
		}
		System.out.println(sum);

	}

}
