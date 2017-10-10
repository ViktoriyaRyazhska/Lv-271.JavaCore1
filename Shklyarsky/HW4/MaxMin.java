import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMin {

	//read 3 integer numbers and write max and min of them;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Type three int numbers!");
		
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());
		
		//max
		if(n1 > n2 && n1 > n3) {
			System.out.println("Number " + n1 + " is biggest");
		} 
		else if (n2 > n1 && n2 > n3) {
			System.out.println("Number " + n2 + " is biggest");
		} 
		else if (n3 > n1 && n3 > n2) {
			System.out.println("Number " + n3 + " is biggest");
		}
		
		//min
		if(n1 < n2 && n1 < n3) {
			System.out.println("Number " + n1 + " is lowest");
		} 
		else if (n2 < n1 && n2 < n3) {
			System.out.println("Number " + n2 + " is lowest");
		} 
		else if (n3 < n1 && n3 < n2) {
			System.out.println("Number " + n3 + " is lowest");
		}
		
		
	}

}
