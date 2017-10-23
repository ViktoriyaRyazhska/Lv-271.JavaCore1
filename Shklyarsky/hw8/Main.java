package hw8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("write a sentence of 5 words");

		String entry = br.readLine();

		String[] words = entry.split(" ");
		int max = 0;
		String maxWord = null;

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > max) {
				max = words[i].length();
				maxWord = words[i];
			}
		}
		System.out.println(
				"Longest word in in your sentence is = " + maxWord + " with number of symbols = " + maxWord.length());

		System.out.println(new StringBuilder(words[1]).reverse().toString());
	}
}
