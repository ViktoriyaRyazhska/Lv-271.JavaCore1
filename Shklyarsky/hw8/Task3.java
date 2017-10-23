package hw8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter currency sign and then amount");
		
		String entry = br.readLine();
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		Matcher m = p.matcher(entry);

		if (m.matches()) {
			System.out.println("US dolar");
			m.reset();
		} else {
			System.out.println("Not us currency");
		}

	}

}
