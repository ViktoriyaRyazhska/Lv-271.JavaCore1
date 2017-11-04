package prac4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Practice3 {

	public static void main(String[] args) throws IOException {
		List<String> list = new ArrayList<String>();
		
		String fileName = "test.txt";
		String s = null;
		int count = 0;
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
		fr = new FileReader(fileName);
		br = new BufferedReader(fr);
		
		System.out.println("Read data from " + fileName);
		
		while((s = br.readLine()) !=null) {
			list.add(s);
			System.out.println("row read " );
			
			
		}
		br.close();
		}
		catch(Exception e){
			System.out.println("File error");
			
		}
		
		
		
		

	}

}
