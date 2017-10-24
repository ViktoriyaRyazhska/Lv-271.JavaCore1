package HomeWork8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homeWorkString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter five words: ");
		String text = br.readLine();

		String[] str = text.split(" ");
		if (str[0].length() > str[1].length() && str[0].length() > str[2].length() && str[0].length() > str[3].length()
				&& str[0].length() > str[4].length()) {
			System.out.println("Longest word is: " + str[0] + ". Number of letters: " + str[0].length());
		} else if (str[1].length() > str[0].length() && str[1].length() > str[2].length()
				&& str[1].length() > str[3].length() && str[1].length() > str[4].length()) {
			System.out.println("Longest word is: " + str[1] + ". Number of letters: " +  str[1].length());
		} else if (str[2].length() > str[0].length() && str[2].length() > str[1].length()
				&& str[2].length() > str[3].length() && str[2].length() > str[4].length()) {
			System.out.println("Longest word is: " + str[2] + ". Number of letters: " +  str[2].length());
		} else if (str[3].length() > str[0].length() && str[3].length() > str[1].length()
				&& str[3].length() > str[2].length() && str[3].length() > str[4].length()) {
			System.out.println("Longest word is :" + str[3] + ". Number of letters: " + str[3].length());

		} else {
			System.out.println("Longest word is: " + str[4] + ". Number of letters: " + str[4].length());
		}
		
		StringBuilder st = new StringBuilder(str[1]);
		System.out.println("Second word in reverse order: " + st.reverse());
		
		
		
		

	}

}
