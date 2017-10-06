import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Phone {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
		
		System.out.println("Type standard units per minute for 1st country!");
		double c1 = Double.parseDouble(br.readLine());
		System.out.println("For 2nd country!");
		double c2 = Double.parseDouble(br.readLine());
		System.out.println("And for 3th country!");
		double c3 = Double.parseDouble(br.readLine());
		System.out.println("how long did the 1st call last?");
		double t1 = Double.parseDouble(br.readLine());
		System.out.println("2nd call?");
		double t2 = Double.parseDouble(br.readLine());
		System.out.println("3th call?");
		double t3 = Double.parseDouble(br.readLine());
		
		System.out.println("Call from 1st country cost " + c1*t1 + " from 2nd country cost " + c2*t2 + " and from third country it cost " + c3*t3);
		System.out.println("All together it cost " + (c1*t1 + c2*t2 + c3*t3));
	}

}
