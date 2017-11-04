package prac3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pracTask {
	
	public static int squareRectangle(int a, int b) throws MyException {
		if(a < 0 && b < 0) {
			throw new MyException("exc1");
		}
		return a / b;
	}
	
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a1=0;
		int a2=0;
		try {
			a1 = Integer.parseInt(br.readLine());
			 a2 = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			System.out.println(squareRectangle(a1, a2));
		} catch (MyException e) {
		
			e.printStackTrace();
		}
				
		
	}

}
