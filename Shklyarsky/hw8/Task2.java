package hw8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sentence");

		String text = br.readLine();

		text.trim().replaceAll("( )+", " ");

		System.out.println(text.trim().replaceAll("\\s{2,}", " ").replace("I am", "I'm"));

	}

}
