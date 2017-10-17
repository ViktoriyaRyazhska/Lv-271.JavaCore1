import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NegativityCheck {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		 * task 4
		 */
		
		int product = 1;
		int input = 0;
		for (;;) {
			input = Integer.parseInt(br.readLine());
			if (input > 0) {
				product = product * input;
			} else {
				break;
			}
		}
		System.out.println("Product of all entered nember = " + product);

		/*
		 * task 3
		 */

		int nmb[] = new int[5];

		System.out.println("enter five numbers");

		for (int i = 0; i < nmb.length; i++) {
			nmb[i] = Integer.parseInt(br.readLine());
		}

		int second = 0;
		int pos = 0;

		for (int i = 0; i < nmb.length; i++) {
			if (nmb[i] > 0) {
				second++;
				}
			if(second==2){
			pos = i;
			break;
		}
		}
		

		System.out.println("second positive number is on " + (pos + 1) + " position");

	

	}

}
