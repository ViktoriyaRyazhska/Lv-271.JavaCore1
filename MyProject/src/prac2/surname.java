package prac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class surname {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tx = br.readLine();
		
		String[] str1 = tx.split(" ");
		char s = str1[1].charAt(0);
		char s1 = str1[2].charAt(0);
		System.out.println(str1[0] + " " + s + " " + s1);
		System.out.println(str1[1]);
		System.out.println(str1[2] + " " + str1[1] + " " + str1[0]);
		
	}

}
