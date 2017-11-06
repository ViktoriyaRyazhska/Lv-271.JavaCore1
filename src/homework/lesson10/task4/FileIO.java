package homework.lesson10.task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileIO {

	public static void main(String[] args) {
		ArrayList<String> arrStr = new ArrayList<String>();
		String s = null;
		String maxLine = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
	
		try {
			br = new BufferedReader(new FileReader("file.txt"));
			while ((s = br.readLine()) != null) {
				arrStr.add(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			for (String item : arrStr) {
				if (item.length() > arrStr.get(0).length()) {
					maxLine = item;
				}
			}
			bw = new BufferedWriter(new FileWriter("file2.txt"));
			bw.write("A number of lines in the file \"file1.txt\" equals: " + arrStr.size() + " line(s)\n"
					+ "The longest line in the file \"file1.txt\" is : " + maxLine + "\n");
			bw.write("Oleksandr 01.04.1991");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
