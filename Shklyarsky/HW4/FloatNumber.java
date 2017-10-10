import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Type 3 float numebrs!");
		float f1 = Float.parseFloat(br.readLine());
		float f2 = Float.parseFloat(br.readLine());
		float f3 = Float.parseFloat(br.readLine());

		if (f1 >= -5 && f1 <= 5) {
			System.out.println("number " + f1 + " is in [-5 | 5] range ");
		} else {
			System.out.println("number " + f1 + " is not in [-5 | 5] range ");
		}
		if (f2 <= 5 && f2 >= -5) {
			System.out.println("number " + f2 + " is in [-5 | 5] range ");
		} else {
			System.out.println("number " + f2 + " is not in [-5 | 5] range ");
		}
		if (f3 <= 5 && f3 >= -5) {
			System.out.println("number " + f3 + " is in [-5 | 5] range ");
		} else {
			System.out.println("number " + f3 + " is not in [-5 | 5] range ");
		}
		
	}

}
