import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		float nmb[] = new float[3];
		for (int i = 0; i < nmb.length; i++) {
			System.out.println("type a number!");
			nmb[i] = Float.parseFloat(br.readLine());
		}

		for (int i = 0; i < nmb.length; i++) {
			if ((nmb[i] <= 5) && (nmb[i] >= -5)) {
				System.out.println("number " + nmb[i] + " is between [-5|5]");
			} else {
				System.out.println("number " + nmb[i] + " is out of range[-5|5]");
			}
		}

	}

}
