package pracTasks4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
	public static void main (String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if (a%2 !=0) {
			System.out.println(a);
		}
		else if (b%2 !=0) {
			System.out.println(b);
		}
		else if (c%2 !=0) {
			System.out.println(c);
		}
		else {
			System.out.println("No one is odd.");
		}
	}

}
