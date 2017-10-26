import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

		public static int div(int a, int b) {
		int x = a / b;
		return x;
	}

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0;

		System.out.println("Enter two numbers");

		try {
			x = div(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
			System.out.println(x);

		} catch (Exception e) {
			System.out.println("Can't devide by zero");
		}
		catch (ArithmeticException e) {
			System.out.println("Can't devide by zero");
		} catch (NumberFormatException | IOException e) {
			System.out.println("Smth wrong");
		}

	}

}
