import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in)); 
				
		System.out.println("Radius of your bed?");
		double rad = Double.parseDouble(br.readLine());
		System.out.println("perimetr of your bed is " + rad*2*3.1415 + "m, and area is " + rad*rad*3.1415 + "m2");
		
	}

}
