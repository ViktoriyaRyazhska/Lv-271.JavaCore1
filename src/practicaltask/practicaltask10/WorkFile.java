package practicaltask.practicaltask10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkFile {

	public static void main(String[] args) {
		ArrayList<String> arrStr = new ArrayList<>();
		FileInputStream fstream;
		BufferedReader br;
		String str = null;
		try {
			fstream = new FileInputStream("mytext.txt");
			br = new BufferedReader(new InputStreamReader(fstream));
			try {
				while ((str = br.readLine()) != null) {
					arrStr.add(str);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// for (String item : arrStr) {
		// System.out.println(item);
		// }
		countLine(arrStr);
		check(arrStr, "Трамп");
	}

	public static void countLine(ArrayList<String> arrStr) {
		int min = arrStr.get(0).length();
		int max = 0;
		int indexMin = 0;
		int indexMax = 0;
		for (int i = 0; i < arrStr.size(); i++) {
			System.out.println(i + "th string has " + arrStr.get(i).length() + "symbols");
			if (arrStr.get(i).length() < min) {
				min = arrStr.get(i).length();
				indexMin = i;
			}
			if (arrStr.get(i).length() > max) {
				max = arrStr.get(i).length();
				indexMax = i;
			}
		}
		System.out.println("The most longest string is " + indexMax + "th and value - " + max);
		System.out.println("The most shortest string is " + indexMin + "th and value - " + min);
	}

	public static void check(ArrayList<String> arrStr, String str) {
		String temp;
		for (int i = 0; i < arrStr.size(); i++) {
		temp = arrStr.get(i);
			if (temp.contains(str)) {
		System.out.println("String #" + i + "have word " + str);
		}
		
						
		}

	}
}
