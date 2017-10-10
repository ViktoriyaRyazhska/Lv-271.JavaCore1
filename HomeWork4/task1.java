package HomeWork4;
import java.util.Scanner;

public class task1 {
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		if (a >= -5 && a <= 5) {
			System.out.println(a + " in the range [-5;5]");
		}
		else if (b >= -5 && b <= 5) {
			System.out.println(b + " in the range [-5;5]");
		}
		else if (c >= -5 && c <=5 ) {
			System.out.println(c + " in the range [-5;5]");
		}
		else {
			System.out.println("Not in the range [-5;5]");
		}
		
		
	}

}
