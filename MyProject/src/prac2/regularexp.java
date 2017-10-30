package prac2;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexp {
	public static void main(String[] args) throws IOException {
		String[] names = {"name1", "mm", "name$%^"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " is valid? " +valid(names[i]));
		}
				
			
	}
	
	public static boolean valid(String name) {
		Pattern p = Pattern.compile("\\w{3,15}");
		Matcher m = p.matcher(name);
		return m.matches();
	}

}
