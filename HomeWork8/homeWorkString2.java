package HomeWork8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homeWorkString2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sentence that contains between the words more than one space: ");
		String text = br.readLine();
		
		String replaced = text.replaceAll(" {2,}"," ");
		System.out.println(replaced);
		
		
		

	}

}
