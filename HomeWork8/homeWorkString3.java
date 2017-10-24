package HomeWork8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homeWorkString3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text that contains US currency: ");
		String text = br.readLine();

		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})");
		Matcher m = p.matcher(text);

		if (m.matches()) {
			System.out.println("Pattern of US currency is valid.");
			m.reset();
			System.out.println();
		}
		if (m.find()) {
			System.out.println(text.substring(m.start(), m.end()) + "*");
		}
		else {
			System.out.println("Pattern of US currency is wrong.");
		}

	}

}
