package HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class taskOne {
	public static void main (String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		
		int[] daysMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println("Please, enter the number of month: ");
		
		for (int i = 0; i < daysMonth.length; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n >= 1 && n <= 12) {
			System.out.println("Amount of days in this month: " + daysMonth[n]);
			}
			else {
				System.out.println("WRONG NUMBER!@");
				System.exit(0);
			}
			
	}

}
	
}
